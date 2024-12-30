package com.example.country_app.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.country_app.data.CultureCategory

@Composable
fun DrawerContent(
    categories: List<CultureCategory>,
    onCategoryClick: (CultureCategory) -> Unit,
    onBackClick: () -> Unit, // Callback to hide the side menu
    backgroundColor: androidx.compose.ui.graphics.Color // Color for the drawer background
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .width(200.dp) // Set a consistent width for the drawer
            .background(backgroundColor) // Set drawer background color
            .padding(top = 24.dp)
    ) {
        // Back Button to hide the drawer
        IconButton(onClick = onBackClick, modifier = Modifier.padding(start = 8.dp)) {
            Icon(Icons.Filled.ArrowBack, contentDescription = "Close Drawer")
        }

        // List of categories
        LazyColumn(
            modifier = Modifier.padding(top = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(categories) { category ->
                Text(
                    text = category.title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onCategoryClick(category) }
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    style = MaterialTheme.typography.bodyLarge.copy(
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
            }
        }
    }
}
