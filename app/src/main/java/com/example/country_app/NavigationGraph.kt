package com.example.country_app

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.country_app.viewmodel.CultureViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.country_app.ui.theme.components.HomeScreen

@Composable
fun NavigationGraph(
    navController: NavHostController,
    windowSizeClass: WindowSizeClass,
    viewModel: CultureViewModel = viewModel()
) {
    val categories = viewModel.categories

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController = navController, categories = categories)
        }
        composable(
            "categoryDetail/{categoryId}",
            arguments = listOf(navArgument("categoryId") { type = NavType.IntType })
        ) { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getInt("categoryId")
            val category = categories.find { it.id == categoryId }

            category?.let {
                CategoryDetailScreen(
                    category = it,
                    navController = navController,
                    windowSizeClass = windowSizeClass,
                    categories = categories,
                    onCategorySelected = {}
                )
            }
        }
    }
}


