package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.foodapp.databinding.ActivityMainBinding

class FoodDetails : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val bundle=intent.extras

        findViewById<ImageView>(R.id.ivFoodImage).setImageResource(bundle!!.getInt("image"))
        findViewById<TextView>(R.id.tvName).text = bundle!!.getString("name")
        findViewById<TextView>(R.id.tvDetails).text = bundle!!.getString("des")

    }
}