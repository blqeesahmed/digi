package com.blqes.digi.presentation.firstscreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.blqes.digi.uilogin.LoginContent
import com.blqes.digi.viewmodel.AuthViewModel

@Composable
fun LoginScreen(navController: NavController) {

    val authViewModel = AuthViewModel()

    LoginContent(
        authViewModel = authViewModel,
        onLoginSuccess = {
            navController.navigate("home_screen")
        }
    )
}