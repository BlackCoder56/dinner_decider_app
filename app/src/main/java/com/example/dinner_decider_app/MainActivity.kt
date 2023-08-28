package com.example.dinner_decider_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random


class MainActivity : AppCompatActivity() {


    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val deciderBtn = findViewById<Button>(R.id.decide_btn)
        val addBtn = findViewById<Button>(R.id.add_food_btn)
        val foodViewer = findViewById<TextView>(R.id.food_view)
        val enterFood = findViewById<EditText>(R.id.new_food)

        val foodList = arrayListOf("Fish", "Pizza", "Fries")

        deciderBtn.setOnClickListener {
            val randomFood = Random.nextInt(foodList.count())
            foodViewer.text = foodList[randomFood]
        }

        addBtn.setOnClickListener {
            val newFood = enterFood.text.toString()
            if (enterFood.text.isEmpty())
                Toast.makeText(this, "Enter food in Food field please!!", Toast.LENGTH_SHORT).show()
            else
                foodList.add(newFood).toString()
                enterFood.text.clear()
                Toast.makeText(this, "Food Item added successfully!!", Toast.LENGTH_SHORT).show()
        }


    }





    
}