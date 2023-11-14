package com.example.login_registration

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login_registration.screens.SignInScreen
import com.example.login_registration.screens.SignUpScreen
import com.example.login_registration.screens.SplashScreen
import com.example.login_registration.ui.theme.Login_RegistrationTheme
import com.example.login_registration.ui.theme.surfaceColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login_RegistrationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = surfaceColor
                ) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination =  Routes.SplashScreen.route) {
                        composable(Routes.SplashScreen.route) {
                            SplashScreen(navController = navController)
                        }
                        composable(Routes.SignInScreen.route) {
                            SignInScreen(navController = navController)
                        }
                        composable(Routes.SignUpScreen.route) {
                            SignUpScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }
}