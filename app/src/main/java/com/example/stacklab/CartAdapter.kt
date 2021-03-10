package com.example.stacklab

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.stacklab.CustomAdapter.Companion.mobilelist
import com.example.stacklab.FragmentA.Companion.movielist


internal class CartAdapter(private var selectedlist: ArrayList<String>, ) :
    RecyclerView.Adapter<CartAdapter.MyViewHolder>(){

    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.txt12)
        var deletecart: ImageButton =view.findViewById(R.id.delete)
        var image: ImageView =view.findViewById(R.id.imgr)

    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemlayout2, parent, false)

        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return selectedlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = selectedlist[position]
        holder.title.text = movie
        holder.deletecart.setOnClickListener(object : View.OnClickListener{
            @SuppressLint("ShowToast")
            override fun onClick(v: View?) {
               movielist.add(movie)
                selectedlist.removeAt(position)
                notifyDataSetChanged()
            }

        })
        holder.image.setImageResource(R.drawable.images34)
    }


}
