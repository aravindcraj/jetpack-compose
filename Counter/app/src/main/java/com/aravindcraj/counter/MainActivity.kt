package com.aravindcraj.counter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Counter()
            }
        }
    }
}

@Composable
fun Counter() {
    val count = +state { 0 }

    Column(crossAxisAlignment = CrossAxisAlignment.Center) {
        Text(text = "Current value is: ${count.value}", modifier = Spacing(16.dp))
        Row {
            Button(text = "-", onClick = {
                count.value--
            })
            WidthSpacer(width = 4.dp)
            Button(text = "+", onClick = {
                count.value++
            })
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Counter()
    }
}
