package com.wiryadev.topappbartest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.wiryadev.topappbartest.ui.theme.TopAppBarTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopAppBarTestTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        TopAppBar(
                            backgroundColor = MaterialTheme.colors.surface.copy(
                                alpha = 0.9f
                            ),
                            content = {
                                Text(text = "Default Appbar")
                            }
                        )
                    }
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Red)
                    ) {
                        LazyColumn {
                            items(20) {
                                Text(text = "Test $it", style = MaterialTheme.typography.h2)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TopAppBarTestTheme {
        Greeting("Android")
    }
}