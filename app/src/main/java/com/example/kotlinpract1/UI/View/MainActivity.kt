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
    // init pract6

    private lateinit var navController: NavController

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.fragment_container)

//        setContent {
//                // Пример использования Composable элемента с настроенными стилями
//            StudentInfoUI(
//                studentName = "Иванов Иван Иванович",
//                groupName = "Группа 12345",
//                modifier = Modifier.fillMaxSize().background(Color.White)
//            )
//        }
        setContent {
            MyApp("Шевелёв Игорь", "ИКБО-25-21")
        }
    }
}