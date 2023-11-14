package com.example.login_registration.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.login_registration.R
import com.example.login_registration.components.BoldText
import com.example.login_registration.components.LightText
import com.example.login_registration.ui.theme.buttonColor
import com.example.login_registration.ui.theme.textColor

// Ana Ekran

@Composable
fun SplashScreen(
    navController: NavController
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            LightText(text = "Hey There,")
            Spacer(modifier = Modifier.height(10.dp))
            BoldText(text = "Welcome Back")
        }

        AsyncImage(
            model = R.drawable.shoes_company,
            contentDescription = "Login Image",
            modifier = Modifier
                .size(250.dp, 250.dp)
        )

        Text(
            text = "Avangard Shoes",
            style = TextStyle(color = textColor, fontSize = 30.sp, fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "A world brand",
            style = TextStyle(color = textColor, fontSize = 20.sp, letterSpacing = 1.sp)
        )

        Spacer(modifier = Modifier.height(60.dp))

        Button(
            onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                containerColor = textColor
            ),
            modifier = Modifier.size(200.dp, 55.dp)
        ) {
            Text(text = "Sign In")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                containerColor = buttonColor
            ),
            border = BorderStroke(2.dp, textColor),
            modifier = Modifier.size(200.dp, 55.dp)
        ) {
            Text(
                text = "Sign Up", style = TextStyle(
                    color = textColor
                )
            )
        }

        Divider(
            color = textColor, modifier = Modifier
                .alpha(.3f)
                .padding(start = 30.dp, end = 30.dp, top = 30.dp)
        )

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(25.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .border(2.dp, textColor, RoundedCornerShape(10.dp))
                    .clickable { }
            ) {
                AsyncImage(
                    model = R.drawable.instagram,
                    contentDescription = "instagram",
                    modifier = Modifier.padding(12.dp)
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .border(2.dp, textColor, RoundedCornerShape(10.dp))
                    .clickable { }
            ) {
                AsyncImage(
                    model = R.drawable.x,
                    contentDescription = "X",
                    modifier = Modifier.padding(12.dp)
                )
            }
        }

    }
}