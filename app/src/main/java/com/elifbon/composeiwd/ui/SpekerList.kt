package com.elifbon.composeiwd.ui

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Image
import androidx.ui.layout.*
import com.elifbon.composeiwd.model.SpeakerInfo
import com.elifbon.composeiwd.themeTypography

/*
@Composable
fun SpeakerList(speakers: List<SpeakerInfo>){
    ScrollingList(speakers) { speaker -> // Not available yet
        SpeakerInformation(speaker)
    }
}*/

@Composable
fun SpeakerInformation(speaker: SpeakerInfo) {

    Column(
        modifier = Spacing(16.dp)
    ) {
        Image(image = speaker.image)
        HeightSpacer(16.dp)
        Title(title = speaker.name)
        Subtitle(subtitle = speaker.title)
        Body(speaker.sessionTitle)
    }
}

@Composable
fun Title(title: String) {
    Text(title,
        style = themeTypography.h6)
}

@Composable
fun Subtitle(subtitle: String) {
    Text(subtitle,
        style = themeTypography.body1)
}

@Composable
fun Body(body: String) {
    Text(body,
        style = themeTypography.body2)
}

@Composable
fun Image(image: Image) {
    Container(modifier = Height(180.dp) wraps Expanded) {
        Clip(RoundedCornerShape(5.dp)) {
            DrawImage(image = image)
        }
    }

}