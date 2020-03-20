package com.elifbon.composeiwd.ui

import android.media.Image
import androidx.compose.Composable
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.foundation.Box
import androidx.ui.foundation.DrawBackground
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.painter.ImagePainter
import androidx.ui.layout.*
import androidx.ui.unit.dp
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
        modifier = LayoutPadding(16.dp)
    ) {
        Image(image = speaker.image)
        Spacer(LayoutHeight(16.dp))
        Text(speaker.name)
        Text(speaker.title)
        Text(speaker.sessionTitle)
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
fun Image(image: androidx.ui.graphics.Image) {
    Container(modifier = LayoutHeight(180.dp) + LayoutSize.Fill)  {
        Clip(RoundedCornerShape(5.dp)) {
            DrawImage(image = image)
        }
    }


}