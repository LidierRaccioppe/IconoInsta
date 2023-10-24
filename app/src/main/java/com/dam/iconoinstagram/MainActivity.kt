package com.dam.iconoinstagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dam.iconoinstagram.ui.theme.IconoInstagramTheme




val NOMBRE = "Lidier Máximo López Raccioppe"
    val tag : String = "Estado por ver"







class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IconoInstagramTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    grande()
                }
            }
        }

    }
}
@Composable
fun ArtistCard() {
    Column {
        Text("Fredo Godofredo")
        Text("3 minutes ago")
    }
}

@Composable
fun mostrar() {
    Box{
        Image(
            painter = painterResource(R.drawable.fredo),
            contentDescription = "Icono",
            modifier = Modifier
                    .clip(CircleShape)
        )
        Image(
            painter = painterResource(R.drawable.very),
            contentDescription = "Icono2",
            alignment = Alignment.BottomEnd,
            modifier = Modifier
                    .padding(50.dp)
                .clip(CircleShape)
                .size(40.dp)
        )
    }
}
@Composable
fun grande(){
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End

    ){
        mostrar()
        ArtistCard()
    }
    Row (){
        Image(
            contentDescription = "Icono")}


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
















@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IconoInstagramTheme {
        Greeting("Android")
    }
}