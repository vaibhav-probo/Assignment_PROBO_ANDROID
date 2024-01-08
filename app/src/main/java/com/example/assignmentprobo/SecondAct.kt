package com.example.assignmentprobo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignmentprobo.databinding.ActivitySecondBinding

class SecondAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding_1 = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(binding_1.root)


        var intent= getIntent()
        binding_1.nameField.text="Your name Entered is "+intent.getStringExtra("name")

        binding_1.contactField.text="Your Contact Entered is "+intent.getStringExtra("contact")

        binding_1.emailField.text="Your Email Entered is "+intent.getStringExtra("email")
    }
}