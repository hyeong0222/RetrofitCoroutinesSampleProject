package com.example.retrofitcoroutinessampleproject.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retrofitcoroutinessampleproject.data.model.User
import com.example.retrofitcoroutinessampleproject.databinding.ItemLayoutBinding

class MainAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<DataViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return ItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ).let { DataViewHolder(it) }
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int {
        return users.size
    }

    fun addUsers(users: List<User>) {
        this.users.apply {
            clear()
            addAll(users)
        }
    }
}

class DataViewHolder(private val binding: ItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(user: User) {
        itemView.apply {
            binding.textViewUserName.text = user.name
            binding.textViewUserEmail.text = user.email
            Glide.with(binding.imageViewAvatar.context).load(user.avatar)
                .into(binding.imageViewAvatar)
        }
    }
}