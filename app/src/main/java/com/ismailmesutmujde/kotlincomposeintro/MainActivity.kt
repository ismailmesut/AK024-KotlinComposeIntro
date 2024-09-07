package com.ismailmesutmujde.kotlincomposeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ismailmesutmujde.kotlincomposeintro.ui.theme.KotlinComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            Greeting(name = "Android")
        }

    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    // Column, Row, Box

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomText(text = "Hello Android!")
        Spacer(modifier =Modifier.padding(5.dp))
        CustomText(text = "Hello World!")
        Spacer(modifier =Modifier.padding(5.dp))
        CustomText(text = "Hello Kotlin!")
        Spacer(modifier =Modifier.padding(5.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment =  Alignment.CenterVertically
        ) {
            CustomText(text = "Test 1")
            Spacer(modifier =Modifier.padding(5.dp))
            CustomText(text = "Test 2")
            Spacer(modifier =Modifier.padding(5.dp))
            CustomText(text = "Test 3")
        }
    }


    // Column : alt alta dizer

    /*
    Column {

        Text(
            text = "Hello World!",
            modifier = modifier,
            color = Color.Blue,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }*/

    // Row : yan yana dizer
    /*
    Row {
        Text(
            text = "Hello Android!",
            modifier = modifier,
            color = Color.Blue,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Hello World!",
            modifier = modifier,
            color = Color.Blue,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }*/

    // Box : üst üste dizer
    /*
    Box {
        Text(
            text = "Hello Android!",
            modifier = modifier,
            color = Color.Blue,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Hello World!",
            modifier = modifier,
            color = Color.Blue,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }*/
}

@Composable
fun CustomText(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .clickable {
                println("hello android clicked")
            }
            .background(color = Color.Black)
            .padding(top = 10.dp, start = 1.dp, end = 1.dp, bottom = 30.dp)
            //.width(150.dp)
            //.height(200.dp)
            //.size(width = 50.dp, height = 50.dp)
            //.fillMaxWidth(0.5f)
            //.fillMaxHeight(0.5f)
            //.fillMaxSize(0.5f)
        ,color = Color.White,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting("Android")
}