package com.example.login_registration.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.login_registration.components.CustomTextField
import com.example.login_registration.ui.theme.textColor

// Kayıt Ekranı

@Composable
fun SignUpScreen(
    navController: NavController
) {

    var name by remember { mutableStateOf("") }

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirm by remember { mutableStateOf("") }

    var isTruePassword by remember {
        mutableStateOf(true)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Create Your Account", style = TextStyle(
                color = textColor,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            ), modifier = Modifier.padding(top = 80.dp)
        )

        Spacer(modifier = Modifier.height(100.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            CustomTextField(text = name, icon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Name"
                )
            }) {
                name = it
            }
            CustomTextField(text = email, icon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email"
                )
            }) {
                email = it
            }
            CustomTextField(text = password, icon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Password"
                )
            }) {
                password = it
            }
            CustomTextField(text = confirm, icon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Confirm Password"
                )
            }) {
                confirm = it
            }
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                    containerColor = textColor
                ), modifier = Modifier
                    .size(200.dp, 45.dp)
                    .padding(start = 20.dp)
            ) {
                Text(text = "Sign Up", fontSize = 18.sp)
            }

            Spacer(modifier = Modifier.height(70.dp))

            Column(horizontalAlignment = Alignment.End,modifier = Modifier.align(Alignment.End).padding(end = 20.dp)) {
                Text(text = "Already have an account?", style = TextStyle(
                    color = textColor,
                    fontSize = 14.sp
                ))
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Sign In", style = TextStyle(
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