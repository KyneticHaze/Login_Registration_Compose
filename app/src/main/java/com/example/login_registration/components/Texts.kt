package com.example.login_registration.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.login_registration.ui.theme.textColor

@Composable
fun LightText(
    text: String, modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Text(text = text, style = MaterialTheme.typography.headlineMedium, color = textColor)
    }
}

@Composable
fun BoldText(
    text: String, modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Text(
            text = text,
            style = MaterialTheme.typography.headlineLarge,
            color = textColor,
            fontWeight = FontWeight.SemiBold
        )
    }
}