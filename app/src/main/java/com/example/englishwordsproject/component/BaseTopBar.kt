package com.example.englishwordsproject.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.TopAppBar
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.example.englishwordsproject.ui.theme.EnglishWordsProjectTheme
import com.example.englishwordsproject.ui.theme.sdp

@Composable
fun BaseTopBar(
    title: (@Composable RowScope.() -> Unit)? = null,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
    backgroundColor: Color = Color.Transparent,
    contentColor: Color = contentColorFor(backgroundColor),
    elevation: Dp = 1.sdp
) {
    TopAppBar(
        modifier = Modifier.background(
            Brush.horizontalGradient(
                EnglishWordsProjectTheme.colors.gradientBackgroundColor
            )
        ),
        contentColor = EnglishWordsProjectTheme.colors.whiteColor,
        backgroundColor = Color.Transparent,
        elevation = 0.sdp
    ) {
        if (title != null) {
            Row(
                content = title,
            )
        }
    }
}