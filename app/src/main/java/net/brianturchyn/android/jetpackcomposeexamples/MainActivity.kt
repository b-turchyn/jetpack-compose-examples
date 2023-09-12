package net.brianturchyn.android.jetpackcomposeexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import net.brianturchyn.android.jetpackcomposeexamples.ui._TopAppBar
import net.brianturchyn.android.jetpackcomposeexamples.ui.colorScheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceBundle: Bundle?) {
        super.onCreate(savedInstanceBundle)

        setContent {
            MaterialTheme(
                colorScheme = colorScheme
            ) {
                _TopAppBar()
            }
        }
    }
}