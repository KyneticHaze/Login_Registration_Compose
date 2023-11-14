package com.example.login_registration

sealed class Routes(val route: String) {
    data object SplashScreen: Routes("splash_screen")
    data object SignInScreen: Routes("signIn_screen")
    data object SignUpScreen: Routes("signUp_screen")
}
