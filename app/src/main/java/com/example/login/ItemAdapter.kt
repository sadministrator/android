package com.example.login

import android.content.Intent
import android.view.LayoutInflater
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_info.*

class ItemAdapter(var list: ArrayList<Item>): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.activity_item, parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        fun bindItems(data: Item){
            val number: TextView = itemView.requireViewById(R.id.number)
            val name: TextView = itemView.requireViewById(R.id.name)
            number.text = data.number
            name.text = data.name

            itemView.setOnClickListener{
                val sendData = Intent (itemView.context, Info::class.java).apply {
                    putExtra("number",data.number)
                    putExtra("name",data.name)
                }
                itemView.context.startActivity(sendData)
            }
        }
    }
}