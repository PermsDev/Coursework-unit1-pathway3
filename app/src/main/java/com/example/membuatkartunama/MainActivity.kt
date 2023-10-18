package com.example.membuatkartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.membuatkartunama.ui.theme.MembuatKartuNamaTheme
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MembuatKartuNamaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingCard(
                        nama = "Andi Amjad Naufal",
                        noTlp = "089656021020",
                        linkGDev = "@g.dev/perms",
                        email = "andiamjad@gmail.com"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingCard(
    nama: String,
    noTlp: String,
    linkGDev: String,
    email: String
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0x6090EE90)) // Latar belakang warna krim
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Menggunakan Box untuk menggabungkan dua gambar
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.3f)
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "Background Image",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp)
                        .scale(0.5f)
                )
                Image(
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = "Foreground Image",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp)
                        .scale(0.5f)
                )
            }
            // Judul Kartu Nama
            Text(
                text = "$nama",
                fontSize = 28.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            // Informasi Pribadi
            Text(
                text = "Android Developer Extraordinaire",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                modifier = Modifier.fillMaxWidth()
            )

        // Informasi kontak
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            Text(
                text = "No.Tlp  : $noTlp             ",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                color = Color.Black // Warna teks
            )
            Text(
                text = "G.Dev   : $linkGDev              ",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                color = Color.Black // Warna teks
            )
            Text(
                text = "Email   : $email",
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                color = Color.Black // Warna teks
            )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun KartuNama() {
    MembuatKartuNamaTheme {
        GreetingCard(
            nama = "Andi Amjad Naufal",
            noTlp = "089656021020",
            linkGDev = "@g.dev/perms",
            email = "andiamjad@gmail.com"
        )
    }
}