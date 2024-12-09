package com.brfdev.testapplication.ui.screens

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.brfdev.testapplication.R
import com.brfdev.testapplication.ui.theme.TestApplicationTheme

class MainActivity : ComponentActivity() {

    private val myViewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        initializeBtn()
        myViewModel.success.observe(this){
            startActivity(
                Intent(
                    this,
                    WelcomeScreen::class.java
                )
            )
        }
    }

    private fun initializeBtn() {
        val button = findViewById<Button>(R.id.btnButton)
        val email = findViewById<EditText>(R.id.etEmail)
        val password = findViewById<EditText>(R.id.etPassword)

        button.setOnClickListener{
            myViewModel.login(email.text.trim().toString(), password.text.trim().toString())
        }
    }
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
    TestApplicationTheme {
        Greeting("Android")
    }
}