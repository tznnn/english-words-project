package com.example.englishwordsproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.example.englishwordsproject.home.HomeScrenn
import com.example.englishwordsproject.ui.theme.EnglishWordsProjectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            EnglishWordsProjectTheme {
                HomeScrenn()
            }
        }
    }

}