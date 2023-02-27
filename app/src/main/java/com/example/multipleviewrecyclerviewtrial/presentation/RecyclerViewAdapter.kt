package com.example.multipleviewrecyclerviewtrial.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewrecyclerviewtrial.data.DataEntities
import com.example.multipleviewrecyclerviewtrial.databinding.ItemOneBinding
import com.example.multipleviewrecyclerviewtrial.databinding.ItemTwoBinding

class RecyclerViewAdapter( val list: ArrayList<DataEntities>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val view_one = 1
        const val view_two = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            view_one -> ViewHolderOne(
                ItemOneBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            view_two -> ViewHolderTwo(
                ItemTwoBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> throw IllegalAccessException("Invalid entered type!")
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        if (list[position].viewType === Companion.view_one {
//            (holder as ViewHolderOne).bind(position)
//        } else {
//            (holder as ViewHolderTwo).bind(position)
//        }

        return when (list[position].viewType){
            view_one -> (holder as ViewHolderOne).bind(list[position])
                view_two -> (holder as ViewHolderTwo).bind(list[position])
            else -> throw IllegalAccessException("Invalid entered type!")
        }
    }


    override fun getItemViewType(position: Int): Int {
        return list[position].viewType
    }
}