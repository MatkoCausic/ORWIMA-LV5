package com.example.hrferitmatkocausic.projekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.annotation.DrawableRes
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hrferitmatkocausic.projekt.ui.theme.HrferitmatkocausicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("Hello, World!")
        val Dawg = Robot()
        Dawg.goRight(5)
        Dawg.goUp(9)
        println(Dawg.getLocation())
    }
}
data class Ingredient{
    @DrawableRes val image = null
    var title: String = ""
    var subtitle: String = ""
}

data class Recipe{
    @DrawableRes val image = null
    var title: String = ""
    var category: String = ""
    var cookingTime: Float = 0f
    var energy: Int = 0
    var rating: Float = 0f
    var description: String = ""
    var reviews: String = ""
    var ingredients: List<Ingredient>? = null
}

class Robot{
    var x: Int = 0
    var y: Int = 0

    fun goRight(steps: Int){
        x+=steps
    }
    fun goLeft(steps: Int){
        x-=steps
    }
    fun goDown(steps: Int){
        y-=steps
    }
    fun goUp(steps: Int){
        y+=steps
    }
    fun getLocation(): String{
        return "My coordinates are: ${x}x, ${y}y"
    }
}
