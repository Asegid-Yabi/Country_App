package com.example.country_app.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

// Define blue variants for light and dark theme
private val BlueLight = Color(0xFF2979FF) // Light blue color for primary
private val BlueDark = Color(0xFF0D47A1)  // Darker blue color for primary
private val LightBlueBackground = Color(0xFFB5C0E1) // Light blue background for light theme
private val DarkBlueBackground = Color(0xFF1A237E) // Dark blue background for dark theme

private val DarkColorScheme = darkColorScheme(
    primary = BlueDark,
    secondary = Color(0xFF03DAC5),
    background = DarkBlueBackground, // Dark background for dark theme
    surface = Color(0xFF1E1E1E),
    onPrimary = Color.White,
    onBackground = Color.White, // White text on dark background
    onSurface = Color.White
)

private val LightColorScheme = lightColorScheme(
    primary = BlueLight,
    secondary = Color(0xFF03DAC5),
    background = LightBlueBackground, // Light background for light theme
    surface = Color.White,
    onPrimary = Color.White,
    onBackground = Color.Black,
    onSurface = Color.Black
)


@Composable
fun Country_AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context)
            else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme, // Use the dynamic or custom color scheme
        typography = Typography,
        content = content
    )
}
