package com.example.androidbushido

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidbushido.ui.theme.AndroidBushidoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBushidoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Bushido(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Bushido(modifier: Modifier = Modifier) {
    var inputText by remember { mutableStateOf("")}

    Box(modifier.fillMaxSize()) {
        Image(
            painterResource(id = R.drawable.frame),
            contentDescription = "Bushido",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillHeight,
        )
        Button(onClick = {},
            modifier = Modifier.fillMaxWidth()) {Text("Lifting")}
        TextField(
            value = inputText,
            onValueChange = { inputText = it},
            modifier = Modifier
                .align(
                    Alignment.BottomCenter)
                .padding(16.dp),
            textStyle = TextStyle(color = Color.Magenta)
        )

    }
}