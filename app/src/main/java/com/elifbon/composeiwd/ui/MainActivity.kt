package com.elifbon.composeiwd.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import androidx.ui.material.surface.Surface
import com.elifbon.composeiwd.data.speakerInfoList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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