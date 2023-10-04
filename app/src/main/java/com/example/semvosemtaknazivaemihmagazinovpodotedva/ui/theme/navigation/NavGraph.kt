package com.example.semvosemtaknazivaemihmagazinovpodotedva.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.semvosemtaknazivaemihmagazinovpodotedva.firstScreen
import com.example.semvosemtaknazivaemihmagazinovpodotedva.secondScreen
import com.example.semvosemtaknazivaemihmagazinovpodotedva.ui.theme.navigation.Screens.First.route

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.First.route
    ){
        composable(route = Screens.First.route){
            firstScreen(navController)
        }
        composable(route = Screens.Second.route){
            secondScreen(navController)
        }

    }
}