package com.elifbon.composeiwd.ui

import androidx.compose.Composable
import androidx.ui.graphics.Color
import androidx.ui.material.ColorPalette
import androidx.ui.material.MaterialTheme
import com.example.jetnews.ui.lightThemeColors


@Composable
fun IWDDemoApp(children: @Composable() () -> Unit) {
    MaterialTheme(colors = lightThemeColors){
        children()
    }
}