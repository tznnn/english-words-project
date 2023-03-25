package com.example.englishwordsproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.example.englishwordsproject.ui.theme.EnglishWordsProjectTheme
import com.example.englishwordsproject.ui.theme.sdp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            EnglishWordsProjectTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = EnglishWordsProjectTheme.colors.whiteColor
                ) {

                    Column(modifier = Modifier.fillMaxWidth()) {
                        Spacer(modifier = Modifier.height(100.sdp))
                        Text(text = "Atakan", style = EnglishWordsProjectTheme.typography.title)
                        Spacer(modifier = Modifier.height(20.sdp))

                        Text(
                            text = "Atakan",
                            style = EnglishWordsProjectTheme.typography.normalText
                        )
                    }

                }
            }
        }
    }

    @Composable
    fun ScaffoldWithTopBar() {
        Scaffold(
            topBar = {
                TopAppBar(
                    modifier = Modifier
                        .fillMaxWidth()
                        .statusBarsPadding(),
                    contentColor = EnglishWordsProjectTheme.colors.whiteColor,
                    elevation = 1.dp,
                    backgroundColor = Color.Red ?: Color.Transparent,
                ) {

                }
            }, content = {
                Column(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize()
                        .background(Color(0xff8d6e63)),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Content of the page",
                        fontSize = 30.sp,
                        color = Color.White
                    )
                }

            })
    }
}