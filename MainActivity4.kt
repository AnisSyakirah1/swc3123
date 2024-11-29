package com.example.eaaaaasy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        val cartItemsTextView: TextView = findViewById(R.id.cart)
        val checkoutButton: Button = findViewById(R.id.checkout)

        // Get product name from Intent
        val productName = intent.getStringExtra("productName")
        cartItemsTextView.text = "Cart: $productName"

        // Checkout and Finish the Process
        checkoutButton.setOnClickListener {
            finish() // End the activity stack or do further actions here.
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}