package com.example.task_5_recycler_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FruitsAdapter(private val fruitsList:List<Fruit>
): RecyclerView.Adapter<FruitViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemFruitView=LayoutInflater.from(parent.context).inflate(R.layout.fruit_item,parent,false)
        return FruitViewHolder(itemFruitView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val currentFruit=fruitsList[position]
        holder.bindFruits(currentFruit)
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }
}