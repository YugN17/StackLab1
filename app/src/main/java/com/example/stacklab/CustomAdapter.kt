package com.example.stacklab

import android.R.layout
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.stacklab.FragmentA.Companion.movielist


 internal class CustomAdapter() :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>(){
    companion object{
        var selectedlist=ArrayList<String>()
        var mobilelist=ArrayList<String>()

    }



    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.txt2)
var addtocart:Button=view.findViewById(R.id.addtocart)
        var image:ImageView=view.findViewById(R.id.img2)

    }
    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemlayout, parent, false)

        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = movielist[position]
        holder.title.text = movie
holder.addtocart.setOnClickListener(object :View.OnClickListener{
    @SuppressLint("ShowToast")
    override fun onClick(v: View?) {
        selectedlist.add(movie)
        movielist.removeAt(position)
        notifyDataSetChanged()
    }

})
        holder.image.setImageResource(R.drawable.images34)


    }
    override fun getItemCount(): Int {
        return movielist.size
    }
}

