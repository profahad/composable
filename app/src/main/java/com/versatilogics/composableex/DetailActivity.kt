package com.versatilogics.composableex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.versatilogics.composableex.components.BottomBar
import com.versatilogics.composableex.components.InsetAwareTopAppBar
import com.versatilogics.composableex.ui.theme.ComposableExTheme

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableExTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        InsetAwareTopAppBar(
                            title = {
                                Text(
                                    text = "Dashboard",
                                    style = MaterialTheme.typography.subtitle2,
                                    color = LocalContentColor.current
                                )
                            },
                            navigationIcon = {
                                IconButton(onClick = {
                                    finish()
                                }) {
                                    Icon(
                                        imageVector = Icons.Filled.ArrowBack,
                                        contentDescription = stringResource(R.string.app_name)
                                    )
                                }
                            }
                        )
                    },
                    bottomBar = {
                        BottomBar(onToggleFavorite = {

                        }, onUnimplementedAction = {

                        })
                    }
                ) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                    ) {
                        Text("Android")
                    }
                }
            }
        }
    }
}