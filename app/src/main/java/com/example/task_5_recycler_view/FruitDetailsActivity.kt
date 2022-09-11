package com.example.task_5_recycler_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FruitDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_details)
        val description=intent.getStringExtra("FruitItem")
        val descriptionArea=findViewById<TextView>(R.id.fruit_Details)
        descriptionArea.setText(description)
        val fruitNumber=intent.getIntExtra("N",0)
        val currentFruit= lists[fruitNumber]
        val image=findViewById<ImageView>(R.id.details_Image)
        val imageNum:Int=currentFruit.fruitImage
        image.setImageResource(imageNum)
    }
}