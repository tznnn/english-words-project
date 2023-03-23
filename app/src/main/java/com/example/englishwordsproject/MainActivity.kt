package com.example.englishwordsproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.englishwordsproject.ui.theme.EnglishWordsProjectTheme

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
                    Column(
                        modifier = Modifier
                            .height(50.dp)
                            .background(Brush.horizontalGradient(EnglishWordsProjectTheme.colors.gradientBackgroundColor))
                    ) {

                    }
                }
            }
        }
    }
}