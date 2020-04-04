package com.elifbon.composeiwd.ui

import androidx.compose.Composable
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.toModifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Image
import androidx.ui.graphics.ScaleFit
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
        SpeakerImage(image = speaker.image)
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
fun SpeakerImage(image: Image?) {

  image?.let { image ->
       val sizeModifier = LayoutHeight.Min(180.dp) + LayoutWidth.Fill
        Container(modifier = sizeModifier) {
           Clip(shape = RoundedCornerShape(5.dp)) {
                val imageModifier = ImagePainter(image).toModifier(scaleFit = ScaleFit.FillWidth)
                Box(modifier = sizeModifier + imageModifier)
            }
        }
    }

}