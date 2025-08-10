package com.example.e2_p1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicSecureTextField
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button

import androidx.compose.material3.Card

import androidx.compose.material3.OutlinedTextField


import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e2_p1.ui.theme.E2_P1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            E2_P1Theme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF006400)) {
                    LoginForm(modifier = Modifier.fillMaxSize())
                }

            }
        }
    }
}


@Composable
fun LoginForm(modifier: Modifier){

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("")}

    Card(modifier = Modifier.padding(start = 30.dp,end=30.dp,bottom=400.dp,top=80.dp)) {
        Column(modifier = Modifier) {
            Text("Login Form",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedTextField( value = username,
                onValueChange = {username = it},
                singleLine = true,
                label = {
                    Text("Name")
                },
                modifier = Modifier.padding(start=20.dp,end=10.dp,top=10.dp).fillMaxWidth()
            )
            OutlinedTextField( value = password,
                onValueChange = {password = it},
                singleLine = true,
                label = {
                    Text("Password")
                },
                visualTransformation = PasswordVisualTransformation() ,
                modifier = Modifier.padding(start=20.dp,end=10.dp,top=10.dp).fillMaxWidth()
            )
            Spacer(modifier = Modifier.padding(20.dp))
            Button(onClick = {},
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier.padding(start=50.dp,end=50.dp)) {
                Text(
                    "Login",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview(){
    E2_P1Theme {
        Surface(modifier = Modifier.fillMaxSize(),
            color = Color(0xFF006400)) {
            LoginForm(modifier = Modifier.fillMaxSize())
        }

    }
}
