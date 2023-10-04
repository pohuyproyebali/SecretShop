package com.example.semvosemtaknazivaemihmagazinovpodotedva

import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
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
import com.example.semvosemtaknazivaemihmagazinovpodotedva.ui.theme.navigation.Screens
import com.example.semvosemtaknazivaemihmagazinovpodotedva.ui.theme.navigation.Screens.First.route

@Composable
fun firstScreen(navController: NavController){
        Column(

            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF527F3F),
                            Color(0xFF95CE8C)
                        )
                    )
                )
            //.padding(15.dp),

        ) {
            Row (
                modifier = Modifier.padding(15.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.pudge),
                    contentDescription = "pudge",
                    modifier = Modifier.size(width = 76.dp, height = 85.dp)
                )
                Column(modifier = Modifier
                    .padding(start = 25.dp, top = 7.dp)
                ) {
                    Text(text = "ПОТАЙНАЯ ЛАВКА", color = Color.White, fontSize = 28.sp, fontWeight = FontWeight.Medium, fontFamily = FontFamily.SansSerif)
                    Text(text = "Магазин товаров по доте", color = Color.White, fontSize = 18.sp, fontStyle = FontStyle.Italic, fontFamily = FontFamily.SansSerif)
                }


            }

            Divider(thickness = 2.dp, color = Color.White, startIndent = 0.dp)
            Box(

            ) {
                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.kovrik),
                        contentDescription = "kovrik",
                        modifier = Modifier

                            .size(570.dp)

                    )
                }
                Column(
                    modifier = Modifier
                        .padding(top = 50.dp, start = 15.dp)
                ) {
                    Text(
                        text = "Лучшее качество",
                        color = Color.White,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif
                    )
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .padding(top = 50.dp)
                            .size(width = 250.dp, height = 45.dp),
                        shape = RoundedCornerShape(15.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.White,
                            contentColor = Color.Black
                        )
                    ) {
                        Text(text = "Перейти к магазинам")
                    }
                }
            }
            Button(onClick = {
                //TODO: Navigate to Home Screen
                navController.navigate(Screens.Second.route)
            }) {
                Text(text = "Aboba")
                
            }
        }
    }
