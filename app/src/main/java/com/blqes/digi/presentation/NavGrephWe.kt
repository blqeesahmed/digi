package com.blqes.digi.presentation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.blqes.digi.presentation.firstscreen.LoginScreen
import com.blqes.digi.presentation.firstscreen.WelcomeScreen


@Composable
fun AppNavGraph() {

    // NavController = المسؤول عن التنقل بين الشاشات
    val navController = rememberNavController()

    // NavHost = container لكل الشاشات
    NavHost(
        navController = navController,
        startDestination = "welcome_screen" // أول شاشة تظهر
    ) {

        // شاشة البداية
        composable("welcome_screen") {
            WelcomeScreen(navController)
        }

        // 👇 شاشة تسجيل الدخول (placeholder)
        composable("login_screen") {
            LoginScreen(navController)
        }

        // 👇 شاشة إنشاء حساب (placeholder)
        composable("register_screen") {
            // TODO: اعملي هنا RegisterScreen
        }
    }
}