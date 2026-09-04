package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //val pet = Pet(name = "pet", age = 5)
        val cat = Cat(name = "barbie", age = 4)
        val dog = Dog(name = "Buddy", age = 8)
        val scorpion = Scorpion(name = "Stringer", age = 30)

        val pets = mutableListOf(cat, dog, scorpion)
        val pettablePets = mutableListOf<PetTable>(cat, dog)

        val happypet = Happy(date = "June 24th, 2026")
        val sadpet = Sad(date = "July 10th, 2026")

        val moods = mutableListOf<Mood>(happypet, sadpet)


    }
}