package com.example.englishwordsproject.mywords

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.englishwordsproject.component.BaseScaffold
import com.example.englishwordsproject.component.MainTopBar
import com.example.englishwordsproject.ui.theme.EnglishWordsProjectTheme
import com.example.englishwordsproject.ui.theme.sdp

@Composable
fun MyWordsScreen(
    navController: NavController,
) {
    BaseScaffold(
        topBar = {
            MainTopBar(
                title = "Kelimelerim Sayfası",
                leftAction = {
                    Icon(
                        modifier = Modifier
                            .size(24.sdp)
                            .clickable {
                                navController.popBackStack()
                            },
                        tint = EnglishWordsProjectTheme.colors.whiteColor,
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "backIcon",

                        )
                }

            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.sdp)
        ) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Text(
                    text = "testArgument",
                    style = EnglishWordsProjectTheme.typography.title
                )

            }
        }
    }
}