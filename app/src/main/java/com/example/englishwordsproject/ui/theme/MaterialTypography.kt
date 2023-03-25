package com.example.englishwordsproject.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.englishwordsproject.R

@Immutable
data class MaterialTypography(
    val materialTypography: Typography,
){
    val title: TextStyle
        @Composable
        get() {
            return TextStyle(
                fontFamily = FontFamilies.OpenSans,
                fontWeight = FontWeight.Normal,
                fontSize = 45.ssp,
                lineHeight = 32.ssp,
                letterSpacing = (0.1f).ssp
            )
        }

    val subTitle: TextStyle
        @Composable
        get() {
            return TextStyle(
                fontFamily = FontFamilies.OpenSans,
                fontWeight = FontWeight.Normal,
                fontSize = 22.sp,
                lineHeight = 32.sp,
                letterSpacing = (0.3f).sp
            )
        }

    val normalText: TextStyle
        @Composable
        get() {
            return TextStyle(
                fontFamily = FontFamilies.OpenSans,
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp,
                lineHeight = 32.sp,
                letterSpacing = (0.3f).sp
            )
        }
}

fun defaultAppTypography() = appTypography()

fun appTypography(): MaterialTypography {
    val baseTextStyle = TextStyle(
        fontFamily = FontFamilies.OpenSans,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 22.sp,
        letterSpacing = (0.3f).sp
    )
    return MaterialTypography(
        materialTypography = Typography(body1 = baseTextStyle)
    )
}

@Immutable
object FontFamilies {
    @Stable
    val OpenSans = FontFamily(
        Font(R.font.open_sans_regular),
        Font(R.font.open_sans_semibold, weight = FontWeight.SemiBold),
        Font(R.font.open_sans_bold, weight = FontWeight.Bold)
    )
}