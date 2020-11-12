package com.example.kulinerhitssurabaya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kulinerhitssurabaya.R
import kotlinx.android.synthetic.main.list_kul.view.*

class KulAdapter  (val itemKul: List<KulData>, val clickListener:
    (KulData) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType:
    Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_kul, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemKul[position],
            clickListener)
    }
    override fun getItemCount() = itemKul.size
    class PartViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        fun bind(data: KulData, clickListener: (KulData) -> Unit) {
            itemView.image_list.setImageResource(data.imgKu)
            itemView.list_kul.text = data.nameKu
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}