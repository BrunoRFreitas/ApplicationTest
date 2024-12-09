package com.brfdev.testapplication.ui.screens.welcome

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.brfdev.testapplication.R

class WelcomeScreen: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }
}