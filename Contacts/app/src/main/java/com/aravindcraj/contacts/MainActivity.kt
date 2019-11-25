package com.aravindcraj.contacts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Model
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.graphics.SolidColor
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle
import androidx.ui.material.withOpacity
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Contacts(details)
            }
        }
    }
}

@Composable
fun Contacts(details: List<Contact>) {
    VerticalScroller {
        Column(
                mainAxisSize = LayoutSize.Expand,
                mainAxisAlignment = MainAxisAlignment.Start,
                crossAxisSize = LayoutSize.Expand
        ) {
            details.forEach { detail ->
                Contact(detail = detail)
            }
        }
    }
}

@Composable
fun Contact(detail: Contact) {
    Container(modifier = Spacing(16.dp)) {
        Column(mainAxisSize = LayoutSize.Expand, crossAxisSize = LayoutSize.Expand) {
            Text(text = detail.name,
                    style = +themeTextStyle { h6 })
            Text(text = detail.contactNumber,
                    style = +themeTextStyle { body1 })
            Text(text = detail.profile,
                    style = (+themeTextStyle { subtitle1 }).withOpacity(0.3f))
        }
    }
}