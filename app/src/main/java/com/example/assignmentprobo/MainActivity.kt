package com.example.assignmentprobo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignmentprobo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.button.setOnClickListener {


            println("click listener")
            var intent = Intent(this,SecondAct::class.java);

            intent.putExtra("name",binding.name.text.toString())

            intent.putExtra("contact",binding.contact.text.toString())
            intent.putExtra("email",binding.email.text.toString())

            startActivity(intent)
        }
    }
}