package com.example.englishwordsproject.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.englishwordsproject.component.BaseScaffold
import com.example.englishwordsproject.component.BaseTopBar
import com.example.englishwordsproject.ui.theme.EnglishWordsProjectTheme
import com.example.englishwordsproject.ui.theme.sdp

@Composable
fun HomeScrenn() {
    BaseScaffold(
        topBar = {
            BaseTopBar(
                title = { Text(text = "denemeee") }
            )
        }
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