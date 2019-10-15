package io.aikosoft.cardsdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = FruitsRecyclerViewAdapter(getFruits().apply {
            addAll(getFruits())
            addAll(getFruits())
        })
    }

    private fun getFruits() = arrayListOf(
            App("Twitter", "Twitter, Inc.","4.5","Installed", R.drawable.twitter, R.drawable.rating_black  ),
            App("Facebook", "Sign up for Facebook","4.2", "Free",R.drawable.facebook, R.drawable.rating_black),
            App("Instagram", "Instagram","EDITORS' CHOICE", "Update",R.drawable.instagram, R.drawable.rating_black)
//            App(name = "Cabbage", imgRes = R.drawable.cabbage)
    )
}