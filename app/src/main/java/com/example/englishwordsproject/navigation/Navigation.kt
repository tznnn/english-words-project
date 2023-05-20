package com.example.englishwordsproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.englishwordsproject.Screen
import com.example.englishwordsproject.home.HomeScrenn
import com.example.englishwordsproject.mywords.MyWordsScreen

@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            HomeScrenn(navController = navController)
        }
        composable(route = Screen.MyWordsScreen.route) {
            MyWordsScreen(navController = navController)
        }
        /* composable(
             route = Screen.MyWordsScreenWithArg.route+"/{testArg}",
             arguments = listOf(
                 navArgument("testArg"){
                     type= NavType.StringType
                     defaultValue="ato"
                     nullable=true
                 }
             )
         ){ entry ->
                 MyWordsScreen(testArgument =entry.arguments?.getString("testArg"), navController = navController )
         }

         */


    }
}