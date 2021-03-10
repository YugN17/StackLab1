package com.example.stacklab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.stacklab.FragmentA.Companion.movielist


class FragmentA : Fragment() {

private lateinit var recyclerView:RecyclerView

private lateinit var adapter:CustomAdapter
companion object{
    var movielist=ArrayList<String>()
}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view= inflater.inflate(R.layout.fragment_a, container, false)

        movielist= ArrayList<String>()
        movielist.add("Oppo")
        movielist.add("Samsung")
        movielist.add("Nokia")
        recyclerView=view.findViewById(R.id.recycler)

adapter=CustomAdapter()
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = adapter

        return view;
    }

    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
    }

}