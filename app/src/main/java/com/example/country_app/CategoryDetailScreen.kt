package com.example.country_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.country_app.data.CultureCategory
import com.example.country_app.ui.theme.components.DrawerContent
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryDetailScreen(
    category: CultureCategory,
    navController: NavController,
    windowSizeClass: WindowSizeClass,
    categories: List<CultureCategory>, // List of categories for the drawer
    onCategorySelected: (CultureCategory) -> Unit // Callback to update the category content
) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()

    // Define text styles and image sizes based on window size
    val titleTextStyle = when (windowSizeClass) {
        WindowSizeClass.Compact -> MaterialTheme.typography.titleLarge
        WindowSizeClass.Medium -> MaterialTheme.typography.displaySmall
        WindowSizeClass.Expanded -> MaterialTheme.typography.displayMedium
    }

    val bodyTextStyle = when (windowSizeClass) {
        WindowSizeClass.Compact -> MaterialTheme.typography.bodyMedium
        WindowSizeClass.Medium -> MaterialTheme.typography.bodyLarge
        WindowSizeClass.Expanded -> MaterialTheme.typography.bodyLarge.copy(lineHeight = 28.sp)
    }

    val imageHeight = when (windowSizeClass) {
        WindowSizeClass.Compact -> 200.dp
        WindowSizeClass.Medium -> 250.dp
        WindowSizeClass.Expanded -> 300.dp
    }

    // ModalNavigationDrawer for side menu
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            // Drawer content with a background and back button
            DrawerContent(
                categories = categories,
                onCategoryClick = { selectedCategory ->
                    onCategorySelected(selectedCategory) // Update category content
                    coroutineScope.launch { drawerState.close() } // Close the drawer after selecting
                    // Navigate to the selected category detail
                    navController.navigate("categoryDetail/${selectedCategory.id}")
                },
                onBackClick = {
                    coroutineScope.launch { drawerState.close() } // Close the drawer without navigating home
                },
                backgroundColor = MaterialTheme.colorScheme.background

            )
        }
    ) {
        // Main screen content inside a Scaffold
        Scaffold(
            topBar = {
                TopAppBar(
                    navigationIcon = {
                        IconButton(onClick = { coroutineScope.launch { drawerState.open() } }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Open Drawer",
                                tint = MaterialTheme.colorScheme.onPrimary)
                        }
                    },
                    title = {
                        Box(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = category.title,
                                style = titleTextStyle.copy(
                                    color = MaterialTheme.colorScheme.onPrimary // Adjust text color for contrast
                                ),
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = { navController.popBackStack("home", false) }) {
                            Icon(Icons.Filled.ArrowBack, contentDescription = "Go Back",
                                tint = MaterialTheme.colorScheme.onPrimary)
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primary // Use the same color as in the previous screen
                    )
                )
            }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize() // Make sure the Column fills the entire screen
                    .fillMaxWidth() // Ensure full screen width for the background
                    .background(MaterialTheme.colorScheme.background)
                    .verticalScroll(rememberScrollState())
                    .padding(paddingValues)
                    .padding(horizontal = when (windowSizeClass) {
                        WindowSizeClass.Compact -> 8.dp
                        WindowSizeClass.Medium -> 16.dp
                        WindowSizeClass.Expanded -> 24.dp
                    })
            ) {
//                // Category content as before
//                category.introImageRes?.let { imageRes ->
//                    Image(
//                        painter = painterResource(id = imageRes),
//                        contentDescription = "${category.title} Image",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(imageHeight)
//                            .padding(bottom = 16.dp)
//                    )
//                }

                // Display content sections of the selected category
                for (section in category.contentSections) {
                    section.title?.let { title ->
                        Text(
                            text = title,
                            style = titleTextStyle.copy(fontSize = titleTextStyle.fontSize * 0.9f),
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                    }
                    Text(
                        text = section.content,
                        style = bodyTextStyle,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                    section.imageRes?.let { imageRes ->
                        Image(
                            painter = painterResource(id = imageRes),
                            contentDescription = section.title,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(imageHeight * 1.2f)
                                .padding(vertical = 8.dp)
                        )
                    }
                }
            }
        }
    }
}


