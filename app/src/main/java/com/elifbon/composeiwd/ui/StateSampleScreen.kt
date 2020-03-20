package com.elifbon.composeiwd.ui

import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.LayoutHeight
import androidx.ui.layout.LayoutPadding
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.unit.dp

@Model
class CounterState(var count: Int = 0)

@Composable
fun Counter(state: CounterState) {
    Button(
        onClick = {
            state.count++
        },
        modifier = LayoutPadding(24.dp)
    ){
        Text("I've been clicked ${state.count} times")
    }
}

@Composable
fun Greeting(name: String) {
    Text (text = "Hello $name!", modifier = LayoutPadding(24.dp))
}

@Composable
fun StateSampleScreen(
    names: List<String> = listOf("Android", "there"),
    counterState: CounterState = CounterState()
) {
    Column(modifier = LayoutHeight.Fill) {
        Column(modifier = LayoutFlexible(1f)) {
            for (name in names) {
                Greeting(name = name)
                Divider(color = Color.Black)
            }
        }
        Counter(counterState)
    }
}