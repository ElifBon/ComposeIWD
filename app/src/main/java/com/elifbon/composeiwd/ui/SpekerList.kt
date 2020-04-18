package com.elifbon.composeiwd.ui

import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.ImageAsset
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
        modifier = Modifier.padding(16.dp)
    ) {
        SpeakerImage(image = speaker.image)
        Spacer(Modifier.preferredHeight(16.dp))
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
fun SpeakerImage(image: ImageAsset?) {

  image?.let {

      val imageModifier = Modifier
          .preferredHeightIn(minHeight = 180.dp)
          .fillMaxWidth()
          .clip(shape = RoundedCornerShape(4.dp))
      Image(image, modifier = imageModifier, contentScale = ContentScale.Crop)

    }

}