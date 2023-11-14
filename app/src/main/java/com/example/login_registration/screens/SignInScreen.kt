package com.example.login_registration.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.login_registration.R
import com.example.login_registration.Routes
import com.example.login_registration.components.CustomDivider
import com.example.login_registration.components.CustomTextFieldWithPadding
import com.example.login_registration.ui.theme.surfaceColor
import com.example.login_registration.ui.theme.textColor

// Giriş Ekranı
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(
    navController: NavController
) {

    var textEmail by remember { mutableStateOf("") }
    var textPassword by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = surfaceColor
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(30.dp))

            AsyncImage(
                model = R.drawable.sign_in,
                contentDescription = "sign_in_picture",
                modifier = Modifier.size(300.dp, 300.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                CustomTextFieldWithPadding(text = textEmail, onChange = { textEmail = it })
                CustomTextFieldWithPadding(text = textPassword, onChange = { textPassword = it })
            }

            Spacer(modifier = Modifier.height(50.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(start = 30.dp)
                        .size(160.dp, 45.dp), colors = ButtonDefaults.buttonColors(
                        containerColor = textColor
                    )
                ) {
                    Text(text = "Sign In")
                }
                TextButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(end = 30.dp)) {
                    Text(
                        text = "Forgot Password?", style = TextStyle(
                            textDecoration = TextDecoration.Underline,
                            color = textColor,
                            fontSize = 15.sp
                        )
                    )
                }
            }
            CustomDivider()

            Spacer(modifier = Modifier.height(30.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(text = "Don't have account?", fontSize = 14.sp)
                OutlinedButton(
                    onClick = {
                        navController.navigate(Routes.SignUpScreen.route)
                    },
                    border = BorderStroke(2.dp, textColor),
                    modifier = Modifier.size(200.dp, 42.dp)
                ) {
                    Text(
                        text = "Sign Up", style = TextStyle(
                            color = textColor,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
        }
    }
}