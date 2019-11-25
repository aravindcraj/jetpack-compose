package com.aravindcraj.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Print("Hello World")
        }
    }
}

@Composable
fun Print(message: String) {
    Text(text = "$message!")
}

@Preview
@Composable
fun DefaultPreview() {
    Print("Hello World")
}
