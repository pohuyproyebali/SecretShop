package com.example.semvosemtaknazivaemihmagazinovpodotedva

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun secondScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
    Text(
        text = "Потайная лавка - это",
        fontSize = 27.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = FontFamily.SansSerif
    )
        Text(
            text = "Лучший магазин с товарами по доте",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif
        )
        Text(
            text = "Мы производим исключительно качественные кружки, коврики, брелки и т.д.",
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .padding(top = 20.dp)

        )
        Text(
            text = "За всеми новостями магазина вы можете следить в наших соцсетях:",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .padding(top = 20.dp)

        )
        Row(modifier = Modifier
            .padding(top = 20.dp)
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(start = 40.dp)
                    .size(width = 130.dp, height = 45.dp),
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(2.dp,  brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF527F3F),
                        Color(0xFF95CE8C)
                    )
                )
                ),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text(text = "Telegram")
            }


            Button(
                onClick = {},
                modifier = Modifier
                    .padding(start = 20.dp)
                    .size(width = 130.dp, height = 45.dp),
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(2.dp,  brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF527F3F),
                        Color(0xFF95CE8C)
                    )
                )
                ),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text(text = "VK")
            }


        }
        Image(painter = painterResource(id = R.drawable.all), contentDescription = "aboba", modifier = Modifier
            .size(500.dp)
        )
    }



}



