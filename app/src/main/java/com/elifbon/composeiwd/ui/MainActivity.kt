package com.elifbon.composeiwd.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview
import com.elifbon.composeiwd.data.getSpeakersWithImagesLoaded
import com.elifbon.composeiwd.data.speakerInfoList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        speakerInfoList = getSpeakersWithImagesLoaded(speakerInfoList, resources)

        setContent {
            IWDDemoApp() {
                Surface {
                    SpeakerInformation(speakerInfoList[2])

                }

                /*Surface(color = Color.Yellow) {
                    StateSampleScreen()

                }*/

            }
        }
    }
}

@Preview
@Composable
fun defaultPreview(){
    IWDDemoApp() {
        Surface {
            SpeakerInformation(speakerInfoList[2])

        }

        /*Surface(color = Color.Yellow) {
            StateSampleScreen()

        }*/

    }
}