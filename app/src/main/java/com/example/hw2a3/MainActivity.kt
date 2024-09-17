package com.example.hw2a3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hw2a3.ui.theme.HW2A3Theme
import kotlin.random.Random




class MainActivity : ComponentActivity() {
    val facts = listOf(
        "Australia is wider than the moon.",
        "Venus is the only planet to spin clockwise.",
        "Allodoxaphobia is the fear of other people’s opinions.",
        "Human teeth are the only part of the body that cannot heal themselves.",
        "Competitive art used to be an Olympic sport.",
        "The first person processed at Ellis Island was a 15-year-old girl from Ireland.",
        "Google Images was created after Jennifer Lopez wore the green dress at the 2000 Grammys.",
        "Lemons float, but limes sink.",
        "The Eiffel Tower was originally made for Barcelona.",
        "It would take 19 minutes to fall to the center of the Earth.",
        "The real name for a hashtag is an octothorpe.",
        "Neil Armstrong’s hair was sold in 2004 for $3,000.",
        "The longest English word is 189,819 letters long.",
        "The tiny pocket in jeans was designed to store pocket watches.",
        "People once ate arsenic to improve their skin.",
        "“The Terminator” script was sold for $1.",
        "A fear of long words is called Hippopotomonstrosesquippedaliophobia.",
        "There were active volcanoes on the moon when dinosaurs were alive."


    )
    private var factNum = mutableStateOf(Random.nextInt(facts.size))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HW2A3Theme {
                funFacts(facts, factNum)

            }
        }
    }
}

@Composable
fun funFacts(facts: List<String>, factNum: MutableState<Int>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = facts[factNum.value],
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(30.dp)
        )
        Button(onClick = {
            if(factNum.value + 1 == facts.size){
                factNum.value = 0
            }else{
                factNum.value += 1
            }

        }
        ) {Text("Next") }



    }


}