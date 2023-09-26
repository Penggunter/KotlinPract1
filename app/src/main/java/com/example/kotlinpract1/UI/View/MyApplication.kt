package com.example.kotlinpract1.UI.View

import android.annotation.SuppressLint
import android.app.Application
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import com.example.kotlinpract1.Data.Dagger.AppComponent
import com.example.kotlinpract1.Data.Dagger.AppModule
import com.example.kotlinpract1.Data.Dagger.DaggerAppComponent
import com.example.kotlinpract1.R
import com.example.kotlinpract1.UI.StateHolder.ViewModel.MyViewModel

class MyApplication : Application() {

    lateinit var appComponent: AppComponent

    @SuppressLint("MissingInflatedId")
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

}