package net.brianturchyn.android.jetpackcomposeexamples.ui

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun _TopAppBar() {
    TopAppBar(
        title = { Text("Top App Bar Example")},
        navigationIcon = { NavIcon() }
    )
}

@Composable
fun NavIcon() {
    IconButton(onClick = {}) {
        Icon(imageVector = Icons.Default.Menu, contentDescription = "Navigation Menu")
    }
}

@Preview
@Composable
fun TopAppBarExample() {
    TopBarWrapper {
        _TopAppBar()
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CenterExample() {
    TopBarWrapper {
        CenterAlignedTopAppBar(
            title = { Text("Center-Aligned") },
            navigationIcon = { NavIcon() }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MediumExample() {
    TopBarWrapper {
        MediumTopAppBar(
            title = { Text("Medium") },
            navigationIcon = { NavIcon() }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LargeExample() {
    TopBarWrapper {
        LargeTopAppBar(
            title = { Text("Large") },
            navigationIcon = { NavIcon() }
        )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TopBarWrapper(topBar: @Composable () -> Unit) {
    MaterialTheme(colorScheme = colorScheme) {
        Scaffold(topBar = topBar) { Text("Body") }
    }
}