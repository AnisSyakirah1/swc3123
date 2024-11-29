package com.example.eaaaaasy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val product1: ImageView = findViewById(R.id.HairDryer)
        val product2: ImageView = findViewById(R.id.Shirt)

        // Navigate to Product 1 Description
        product1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("productName", "Product 1")
            startActivity(intent)
        }

        // Navigate to Product 2 Description
        product2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("productName", "Product 2")
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}