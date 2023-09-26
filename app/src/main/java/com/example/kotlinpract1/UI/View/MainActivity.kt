package com.example.kotlinpract1.UI.View

import android.annotation.SuppressLint
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import com.example.kotlinpract1.R
import com.example.kotlinpract1.UI.StateHolder.ViewModel.MyViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val students = listOf(
            Student("Шевелёв Игорь", "ИКБО-25-21"),
            Student("Иван Иванович", "ИКБО-100-23"),
            Student("Вася Васильев", "ИКБО-100-23"),
            Student("Пётр Петрович", "ИКБО-100-23")
        )

        setContent {
            MyApp(students, applicationContext) // Передача контекста приложения
        }
    }
}