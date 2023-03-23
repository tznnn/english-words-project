package com.example.englishwordsproject.ui.theme

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

@Stable
class ColorPalette(
    whiteColor: Color,
    gradientBackgroundColor: List<Color>
) {
    var whiteColor by mutableStateOf(whiteColor)
        private set
    var gradientBackgroundColor by mutableStateOf(gradientBackgroundColor)
        private set


    fun update(other: ColorPalette) {
        whiteColor = other.whiteColor
        gradientBackgroundColor = other.gradientBackgroundColor
    }
}