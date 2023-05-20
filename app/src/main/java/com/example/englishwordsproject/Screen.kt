package com.example.englishwordsproject

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object MyWordsScreen : Screen("my_words_screen")
    object MyWordsScreenWithArg : Screen("my_words_screen_arg")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { args ->
                append("/$args")
            }
        }
    }
}
