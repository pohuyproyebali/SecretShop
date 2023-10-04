package com.example.semvosemtaknazivaemihmagazinovpodotedva.ui.theme.navigation

sealed class Screens (val route: String)
{
    object First: Screens("first_screen")
    object Second: Screens("second_screen")
}