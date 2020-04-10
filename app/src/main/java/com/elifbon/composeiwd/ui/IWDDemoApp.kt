package com.elifbon.composeiwd.ui

import androidx.compose.Composable
import androidx.ui.material.MaterialTheme
import lightThemeColors


@Composable
fun IWDDemoApp(children: @Composable() () -> Unit) {
    MaterialTheme(colors = lightThemeColors){
        children()
    }
}