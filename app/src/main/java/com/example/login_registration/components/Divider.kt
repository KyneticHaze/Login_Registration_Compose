package com.example.login_registration.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp
import com.example.login_registration.ui.theme.textColor

@Composable
fun CustomDivider() {
    Divider(
        color = textColor, modifier = Modifier
            .alpha(.3f)
            .padding(start = 30.dp, end = 30.dp, top = 30.dp)
    )
}