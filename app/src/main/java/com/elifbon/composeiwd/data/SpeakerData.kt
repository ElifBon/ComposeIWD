package com.elifbon.composeiwd.data

import androidx.compose.unaryPlus
import androidx.ui.res.imageResource
import com.elifbon.composeiwd.R
import com.elifbon.composeiwd.model.SpeakerInfo

val speakerInfoList = listOf(
    SpeakerInfo(
        0,
        "Elif BONCUK",
        "GDE Istanbul",
        "Build UI with Compose",
        imageResource(R.drawable.istanbulgalata)
    ),
    SpeakerInfo(
        1,
        "Nazlı TEMURTAŞ & Burcu GENECİ",
        "Co-founders of MondayHero",
        "Startup Journey: How to Build a Global Product",
        image = imageResource(id = R.drawable.sirkeci)
    ),
    SpeakerInfo(
        2,
        "Gökçen Burcu ERTURK",
        "Senior Data Scientist",
        "Top 5 Data Science Hacks for Business Cases",
        image = imageResource(id = R.drawable.anitkabir)
    ),
    SpeakerInfo(
        3,
        "Yüksel TOLUN",
        "GDE Ankara",
        "Building Your First Action For The Google Assistant",
        image = imageResource(id = R.drawable.anitkabir)
    )
)