package com.example.pertemuan3tataletak.ui.theme


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.TataLetak.R



@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(
        modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)
    ) {
        Text(text = "Komponen 1")
        Text(text = "Komponen 2")
        Text(text = "Komponen 3")
        Text(text = "Komponen 4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen 1")
        Text(text = "Komponen 2")
        Text(text = "Komponen 3")
        Text(text = "Komponen 4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Text 2")
        Text(text = "Text 212")
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier) {
    Column {
        // Baris 1
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen 1 Baris 1")
            Text(text = "Komponen 2 Baris 1")
            Text(text = "Komponen 3 Baris 1")
        }

        // Baris 2
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen 1 Baris 2")
            Text(text = "Komponen 2 Baris 2")
            Text(text = "Komponen 3 Baris 2")
        }
    }
}

@Composable
fun TataletakRowColumn2(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column {
            Text(text = "Komponen 1 Kolom 1")
            Text(text = "Komponen 2 Kolom 1")
        }
        Text(text = "Komponen 3 Kolom 1") // Asumsi di luar Column sebelumnya
        Column {
            Text(text = "Komponen 1 Kolom 2")
            Text(text = "Komponen 2 Kolom 2")
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier) {
    val gambar = painterResource(id = R.drawable.notasibalok.png)

    Column {
        // Box Kuning (Header)
        Box(
            modifier = modifier
                .height(110.dp)
                .background(color = Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            // Konten Box Kuning (Kosong dalam sumber)
        }

        // Column Bersarang (Dua Baris)
        Column {
            // Baris 1
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col 1 Row 1 Komponen 1")
                Text(text = "Col 1 Row 1 Komponen 2")
                Text(text = "Col 1 Row 1 Komponen 3")
            }

            // Baris 2
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col 1 Row 2 Komponen 1")
                Text(text = "Col 1 Row 2 Komponen 2")
                Text(text = "Col 1 Row 2 Komponen 3")
            }
        }

        // Spacer
        Spacer(modifier = Modifier.height(10.dp))

        // Box Cyan (Utama)
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(500.dp)
                .background(color = Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "My Layout",
                fontSize = 50.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}
