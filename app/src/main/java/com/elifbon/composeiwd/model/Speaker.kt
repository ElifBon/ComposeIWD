package com.elifbon.composeiwd.model

import androidx.compose.Model
import androidx.ui.graphics.Image

@Model
data class SpeakerInfo(val id: Int,
                       val name: String,
                       val title: String,
                       val sessionTitle: String,
                       val image: Image
)