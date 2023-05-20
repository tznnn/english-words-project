package com.example.englishwordsproject.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.englishwordsproject.ui.theme.EnglishWordsProjectTheme
import com.example.englishwordsproject.ui.theme.sdp

@Composable
fun BaseTopBar(
    title: (@Composable RowScope.() -> Unit)? = null,
    modifier: Modifier,
    leftAction: (@Composable RowScope.() -> Unit)? = null,
    rightAction: (@Composable RowScope.() -> Unit)? = null,
    backgroundColor: Color = Color.Transparent,
    contentColor: Color = EnglishWordsProjectTheme.colors.whiteColor,
    elevation: Dp = 0.sdp,
) {
    TopAppBar(
        modifier = modifier,
        contentColor = contentColor,
        backgroundColor = backgroundColor,
        elevation = elevation
    ) {
        ConstraintLayout(
            modifier = Modifier.fillMaxWidth()
        ) {
            val (leftIcon, rightIcon, mainTitle) = createRefs()

            if (leftAction != null) {
                Row(
                    content = leftAction,
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(horizontal = 16.sdp)
                        .constrainAs(leftIcon) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            start.linkTo(parent.start)
                        }
                )

            }
            if (rightAction != null) {
                Row(
                    content = rightAction,
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(horizontal = 16.sdp)
                        .constrainAs(rightIcon) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            end.linkTo(parent.end)
                        }
                )

            }
            if (title != null) {
                Row(
                    content = title,
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.constrainAs(mainTitle) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(leftIcon.end)
                        end.linkTo(rightIcon.start)
                    }
                )
            }

        }
    }
}

@Composable
fun MainTopBar(
    title: String,
    titleModifier: Modifier = Modifier,
    titleStyle: TextStyle = EnglishWordsProjectTheme.typography.title,
    titleColor: Color = EnglishWordsProjectTheme.colors.whiteColor,
    leftAction: (@Composable RowScope.() -> Unit)? = null,
    rightAction: (@Composable RowScope.() -> Unit)? = null,
    backgroundColor: Color = Color.Transparent,
    contentColor: Color = EnglishWordsProjectTheme.colors.whiteColor,
    elevation: Dp = 0.sdp,
) {
    BaseTopBar(
        modifier = Modifier.background(
            Brush.horizontalGradient(
                EnglishWordsProjectTheme.colors.gradientBackgroundColor
            )
        ),
        title = {
            Text(
                text = title,
                modifier = titleModifier,
                style = titleStyle,
                color = titleColor,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
            )
        },
        leftAction = {
            if (leftAction != null) {
                Row(content = leftAction)
            } else Spacer(modifier = Modifier.width(24.sdp))
        },
        rightAction = {
            if (rightAction != null) {
                Row(content = rightAction)
            } else Spacer(modifier = Modifier.width(24.sdp))
        }
    )
}