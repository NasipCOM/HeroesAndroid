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
            Fruit("Apple", "Apple is red", R.drawable.apple),
            Fruit("Cherry", "Cherry is sweet", R.drawable.cherry),
            Fruit("Tomatoes", "Tomatoes is like a ball", R.drawable.tomatos),
            Fruit(name = "Cabbage", imgRes = R.drawable.cabbage)
    )
}