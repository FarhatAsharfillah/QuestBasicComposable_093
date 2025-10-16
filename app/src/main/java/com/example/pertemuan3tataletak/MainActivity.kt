package com.example.mylayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.example.mylayout.ui.theme.MyLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Aktifkan mode edge-to-edge
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            MyLayoutTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    // Panggil composable utama dengan padding dari Scaffold
                    TataletakBoxColumnRow(
                        modifier = Modifier.padding(paddingValues = innerPadding)
                    )
                }
            }
        }
    }
}

// Fungsi composable utama (mengambil dari file Tataletak.kt)
@Composable
fun TataletakBoxColumnRowPreview() {
    MyLayoutTheme {
        TataletakBoxColumnRow()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TataletakBoxColumnRowPreview()
}
