package com.example.task_5_recycler_view

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FruitViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    private val fruitName:TextView
    private val fruitImage:ImageView
    init {
        fruitName=itemView.findViewById(R.id.fruit_Name)
        fruitImage=itemView.findViewById(R.id.fruit_Image)

        itemView.setOnClickListener{
            val fruitsList= lists
            val currentFruit=fruitsList[layoutPosition]
            Toast.makeText(itemView.context,currentFruit.fruitName,Toast.LENGTH_SHORT).show()
            val firstIntent=Intent(itemView.context,FruitDetailsActivity::class.java)
            firstIntent.putExtra("FruitItem",fruitsList[layoutPosition].shortDescription)
            firstIntent.putExtra("N",layoutPosition)
            itemView.context.startActivity(firstIntent)
        }
        }

    fun bindFruits(fruit: Fruit)
    {
        fruitName.text=fruit.fruitName
        fruitImage.setImageResource(fruit.fruitImage)
    }
}