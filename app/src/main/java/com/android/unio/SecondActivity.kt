package com.android.unio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import com.android.unio.resources.C
import com.android.unio.ui.theme.SampleAppTheme

class SecondActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      SampleAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize().semantics { testTag = C.Tag.second_screen_container },
            color = MaterialTheme.colorScheme.background) {
              Text(
                  "Hello Robolectric!",
                  modifier = Modifier.semantics { testTag = C.Tag.greeting_robo })
            }
      }
    }
  }
}
