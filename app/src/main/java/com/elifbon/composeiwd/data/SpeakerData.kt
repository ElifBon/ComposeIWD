package com.elifbon.composeiwd.data


import android.content.res.Resources
import androidx.ui.graphics.imageFromResource
import com.elifbon.composeiwd.R
import com.elifbon.composeiwd.model.SpeakerInfo

var speakerInfoList = listOf(
    SpeakerInfo(
        0,
        "Elif BONCUK",
        "GDE Istanbul",
        "Build UI with Compose",
        R.drawable.istanbulgalata
    ),
    SpeakerInfo(
        1,
        "Nazlı TEMURTAŞ & Burcu GENECİ",
        "Co-founders of MondayHero",
        "Startup Journey: How to Build a Global Product",
        R.drawable.sirkeci
    ),
    SpeakerInfo(
        2,
        "Gökçen Burcu ERTURK",
        "Senior Data Scientist",
        "Top 5 Data Science Hacks for Business Cases",
        R.drawable.anitkabir
    ),
    SpeakerInfo(
        3,
        "Yüksel TOLUN",
        "GDE Ankara",
        "Building Your First Action For The Google Assistant",
        R.drawable.anitkabir
    )

)

fun getSpeakersWithImagesLoaded(posts: List<SpeakerInfo>, resources: Resources): List<SpeakerInfo> {
    return posts.map {
        it.copy(
            image = imageFromResource(resources, it.imageId)
        )
    }
}