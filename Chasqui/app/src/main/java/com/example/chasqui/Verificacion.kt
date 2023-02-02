package com.example.chasqui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chasqui.databinding.ActivityMainBinding
import com.example.chasqui.databinding.ActivityVerificacionBinding
import com.google.firebase.auth.FirebaseAuth

class Verificacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verificacion)
    }
}