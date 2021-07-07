package com.versatilogics.composableex

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.versatilogics.composableex.components.Greeting
import com.versatilogics.composableex.components.Submit
import com.versatilogics.composableex.ui.theme.ComposableExTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableExTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxHeight()
                            .fillMaxWidth()
                    ) {
                        Greeting("Fahad")
                        Spacer(modifier = Modifier.padding(top = 60.dp))
                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth(),
                        ) {
                            Submit(title = "Dismiss") {
                                Toast.makeText(
                                    this@MainActivity,
                                    "Dismiss this dialog",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                            Submit(title = "Submit") {
                                Intent(this@MainActivity, DetailActivity::class.java).also {
                                    startActivity(it)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewMainActivity() {
    ComposableExTheme() {
        Surface(color = Color.White) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Greeting("Fahad")
                Spacer(modifier = Modifier.padding(top = 60.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    Submit(title = "Dismiss") {
                    }
                    Submit(title = "Submit") {
                    }
                }
            }
        }
    }
}