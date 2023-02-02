package com.example.chasqui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chasqui.databinding.ActivityMainBinding
import com.example.chasqui.databinding.ActivityVerificacionBinding
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {
    var binding: ActivityVerificationBinding?=null
    var auth: FirebaseAuth?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityVerificationBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        auth = FirebaseAuth.getInstance()
        if(auth!!.currentUser!=null){
            val intent= Intent(this@Login,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        supportActionBar!!.hide()



    }
}