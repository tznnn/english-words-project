package com.example.englishwordsproject.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavController
import com.example.englishwordsproject.Screen
import com.example.englishwordsproject.component.BaseScaffold
import com.example.englishwordsproject.component.MainTopBar
import com.example.englishwordsproject.ui.theme.EnglishWordsProjectTheme
import com.example.englishwordsproject.ui.theme.sdp

@Composable
fun HomeScrenn(
    navController: NavController
) {
    BaseScaffold(
        topBar = {
            MainTopBar(
                title = "Ana Sayfa",
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
                    text = "Ana Sayfa",
                    style = EnglishWordsProjectTheme.typography.title
                )
            }

            Spacer(modifier = Modifier.height(100.sdp))
            OutLineTextFieldSample()
            Spacer(modifier = Modifier.height(20.sdp))

            Text(
                text = "Atakan",
                style = EnglishWordsProjectTheme.typography.normalText
            )
            Spacer(modifier = Modifier.height(20.sdp))
            Button(
                modifier = Modifier.background(
                    Brush.horizontalGradient(
                        EnglishWordsProjectTheme.colors.gradientBackgroundColor
                    )
                ),
                onClick = {
                    navController.navigate(Screen.MyWordsScreen.route)
                }) {
                Text(text = "Kelimelerim", color = EnglishWordsProjectTheme.colors.whiteColor)
            }
            Spacer(modifier = Modifier.height(20.sdp))

            Button(
                onClick = {
                    navController.navigate(Screen.MyWordsScreenWithArg.withArgs("Ataknnn"))
                }) {
                Text(text = "Arg test")
            }


        }
    }

}

@Composable
fun OutLineTextFieldSample() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        label = { Text(text = "İngilizce") },
        onValueChange = {
            text = it
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Blue,
            focusedLabelColor = Color.Black,
            unfocusedLabelColor = Color.Blue,
            cursorColor = Color.Gray
        ),
    )
}