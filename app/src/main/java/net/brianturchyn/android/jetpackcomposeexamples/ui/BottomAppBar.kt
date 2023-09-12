package net.brianturchyn.android.jetpackcomposeexamples.ui

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun _BottomAppBar() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    TempIcon(imageVector = Icons.Filled.PlayArrow, description = "Play Item")
                    TempIcon(imageVector = Icons.Filled.ArrowForward, description = "Next")
                    TempIcon(imageVector = Icons.Filled.Delete, description = "Delete")
                },
                floatingActionButton = {
                    FloatingActionButton(onClick = {}) {
                        Icon(imageVector = Icons.Filled.Add, contentDescription = "Add")
                    }
                }
            )
        }
    ) {
        Text("Bottom App Bar")
    }
}

@Preview
@Composable
fun BottomAppBarExample() {
    _BottomAppBar()
}


@Composable
fun TempIcon(imageVector: ImageVector, description: String) {
    IconButton(onClick = {}) {
        Icon(imageVector = imageVector, contentDescription = description)
    }
}
