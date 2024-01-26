package com.example.lemonado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonado.ui.theme.LemonadoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    image()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LemonadoTheme {
        image(


        )
    }
}

@Composable
fun image(modifier: Modifier = Modifier) {
    var currentStep by remember { mutableStateOf(1) }


    Surface(
        modifier = Modifier.fillMaxSize()

    ) {
        when (currentStep) {

            1 -> {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_tree),
                        contentDescription = "1",

                        modifier = Modifier
                            .wrapContentSize()
                            .border(width = 5.dp, color = Color.Cyan, shape= RectangleShape)
                            .clickable {
                                currentStep = 2
                            }
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(
                        text = "Tap the lemon tree to select a lemon",
                        fontSize = 16.sp,
                        modifier = Modifier

                    )
                }
            }

            2 -> {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_squeeze),
                        contentDescription = "2",
                        modifier = Modifier .wrapContentSize()
                            .border(width = 5.dp, color = Color.Cyan, shape= RectangleShape)
                            .clickable {
                                currentStep = 3
                            }
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(
                        text = "Keep tapping the lemon to squeeze it",
                        fontSize = 16.sp,

                    )
                }

            }

            3-> {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_drink),
                        contentDescription = "2",
                        modifier = Modifier.wrapContentSize()
                            .border(width = 5.dp, color = Color.Cyan, shape= RectangleShape)
                            .clickable {
                                currentStep = 4
                            }
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(
                        text = "Tap the lemonade to drink it",
                        fontSize = 16.sp,
                        modifier = Modifier
                    )
                }

            }

            4 -> {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_restart),
                        contentDescription = "2",
                        modifier = Modifier.wrapContentSize()
                            .border(width = 5.dp, color = Color.Cyan, shape= RectangleShape)
                            .clickable {
                                currentStep = 1
                            }
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(
                        text = "Tap the empty glass to start again",
                        fontSize = 20.sp,
                        modifier = Modifier
                    )
                }

            }
        }
    }
}