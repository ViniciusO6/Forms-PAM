package com.example.aulajetpack1

import android.R.attr.onClick
import android.location.GnssAntennaInfo.Listener
import android.os.Bundle
import androidx.compose.material3.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aulajetpack1.ui.theme.AulaJetPack1Theme
import com.example.aulajetpack1.ui.theme.Pink40
import com.example.aulajetpack1.ui.theme.Purple500
import com.example.aulajetpack1.ui.theme.Roxo01
import com.example.aulajetpack1.ui.theme.Roxo02

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AulaJetPack1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProdutoItem()
                }
            }
        }
    }
}

@Composable
fun btn() {
    Button(
        onClick = { },
        modifier = Modifier
            .padding(16.dp)
            .width(250.dp)
            .height(50.dp)
            .fillMaxWidth()

    ) {
        Text("Logar")
    }
}
@Preview(showBackground = true)
@Composable
fun ProdutoItem() {

    Column (
    ){
        Box(
            modifier = Modifier
                .height(101.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Roxo01, Roxo02
                        )
                    )
                )
                .fillMaxWidth()
        ){
            Image(
                painterResource(id = R.drawable.perfil),
                contentDescription = "Descrição da Minha Imagem",
                modifier = Modifier
                    .offset(y = (50).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter)
                    .width(100.dp),
                    contentScale = ContentScale.Crop
            )

        }
        Spacer(modifier = Modifier.height(50.dp))

        Column(Modifier.padding(16.dp)){

            Text(
                 modifier = Modifier.fillMaxWidth(),
                 text = "Login",
                 fontSize = 18.sp, fontWeight = FontWeight(700),
                 maxLines = 2,
                 overflow = TextOverflow.Ellipsis,
                 textAlign = TextAlign.Center
            )

            Text(
                text = "Nome",
                Modifier.padding(top = 8.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )

            Spacer(modifier = Modifier.height(10.dp))

            var Nome by remember { mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = Nome,
                onValueChange = { Nome = it },
            )

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Número de Telefone",

                Modifier.padding(top = 8.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )

            Spacer(modifier = Modifier.height(10.dp))
            var Numero by remember { mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = Numero,
                onValueChange = { Numero = it }
            )

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Curso",
                Modifier.padding(top = 8.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )

            Spacer(modifier = Modifier.height(10.dp))
            var curso by remember { mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = curso,
                onValueChange = { curso = it },
            )

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Ano",
                Modifier.padding(top = 8.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )

            Spacer(modifier = Modifier.height(10.dp))
            var ano by remember { mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = ano,
                onValueChange = { ano = it },
            )
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                btn()
            }

        }


    }
}
