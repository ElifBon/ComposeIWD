package com.elifbon.composeiwd.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.layout.padding
import androidx.ui.material.Surface
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.elifbon.composeiwd.R
import com.elifbon.composeiwd.data.getSpeakersWithImagesLoaded
import com.elifbon.composeiwd.data.speakerInfoList
import com.elifbon.composeiwd.themeTypography


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        speakerInfoList = getSpeakersWithImagesLoaded(speakerInfoList, resources)

        setContent {
            IWDDemoApp() {
                Column() {
                    TopAppBar(content =
                    { Row() {
                        Text (text = resources.getString(R.string.app_name),
                            modifier = Modifier.padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
                        style = themeTypography.h5)
                    }})
                    /*Surface {
                         SpeakerList(speakerInfoList)

                    }*/

                    Surface  {
                        StateSampleScreen()

                    }
                }
               

            }
        }
    }
}

@Preview
@Composable
fun defaultPreview(){

    IWDDemoApp() {
        Surface {
            Greeting(name = "Elif")

        }

        /*Surface {
            StateSampleScreen()

        }*/

    }
}