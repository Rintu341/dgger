package com.example.daggerandhilt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.daggerandhilt.ui.theme.DaggerAndHiltTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService // this is called field injection

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val component = DaggerUserRegistrationComponent.builder().build()
            component.inject(this)

//            emailService.send("sujanrintu@gmail.com","soumita@gamil.com","hii")
            userRegistrationService.registerUser("sujanrintu@gamil.com","2345")

            DaggerAndHiltTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Hello World!")
                }
            }
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
    DaggerAndHiltTheme {
        Greeting("Android")
    }
}