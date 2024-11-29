package com.example.eaaaaasy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val productNameTextView: TextView = findViewById(R.id.productHD)
        val addToCartButton: Button = findViewById(R.id.addtocartHD)

        // Get product name from Intent
        val productName = intent.getStringExtra("productName")
        productNameTextView.text = productName

        // Add to Cart and Navigate to Cart Page
        addToCartButton.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("productName", productName)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}