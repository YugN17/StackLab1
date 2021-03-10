package com.example.stacklab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import com.example.stacklab.CustomAdapter.Companion.selectedlist

class Cart : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private lateinit var done: Button
    private lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
         toolbar= findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true);
supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                onBackPressed()
            }

        })
        done=findViewById(R.id.done)
        done.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                val builder=AlertDialog.Builder(this@Cart)
                builder.setTitle("Message")
                builder.setMessage("Your order has been successfully placed")
                builder.setPositiveButton("OK"){dialogInterface,which->
                    Toast.makeText(applicationContext,"Your order has been placed", Toast.LENGTH_LONG).show()

                }
                val alertDialog=builder.create()
                alertDialog.setCancelable(false)
                alertDialog.show()
            }

        })
        recyclerView=findViewById(R.id.recycler23)


        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = CartAdapter(selectedlist)

    }
}