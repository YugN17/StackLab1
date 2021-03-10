package com.example.stacklab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import com.example.stacklab.FragmentA.Companion.movielist
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private  lateinit var tablayout:TabLayout
    private lateinit var viewpager: ViewPager
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var checkoutid:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tablayout=findViewById(R.id.tabs);
        viewpager=findViewById(R.id.viewPager);
        viewPagerAdapter= ViewPagerAdapter(supportFragmentManager)
        viewpager.adapter=viewPagerAdapter
        tablayout.setupWithViewPager(viewpager)
        checkoutid=findViewById(R.id.checkout)


        checkoutid.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
val intent=Intent(this@MainActivity,Cart::class.java)
                startActivity(intent)
            }

        })

    }


}
