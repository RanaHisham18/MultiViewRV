package com.example.multipleviewrecyclerviewtrial.presentation

import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewrecyclerviewtrial.data.DataEntities
import com.example.multipleviewrecyclerviewtrial.databinding.ItemTwoBinding

class ViewHolderTwo(private val binding: ItemTwoBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(dataEntities: DataEntities){
        binding.GirlTv.text = dataEntities.displayData
    }
}