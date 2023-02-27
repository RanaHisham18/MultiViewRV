package com.example.multipleviewrecyclerviewtrial.presentation

import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewrecyclerviewtrial.data.DataEntities
import com.example.multipleviewrecyclerviewtrial.databinding.ItemOneBinding

class ViewHolderOne (private val binding: ItemOneBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(dataEntities: DataEntities){
        binding.BoyTv.text = dataEntities.displayData
    }
}