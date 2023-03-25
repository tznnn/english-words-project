package com.example.englishwordsproject.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import com.example.englishwordsproject.ui.theme.EnglishWordsProjectTheme

@Composable
fun BaseScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable () -> Unit = {},
    backgroundColor: Brush = Brush.horizontalGradient(EnglishWordsProjectTheme.colors.gradientBackgroundColor),
    content: @Composable (PaddingValues) -> Unit = {},
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Scaffold(
            modifier = Modifier
                .statusBarsPadding(),
            topBar = topBar,
            backgroundColor = EnglishWordsProjectTheme.colors.whiteColor,
            content = content
        )
    }
}