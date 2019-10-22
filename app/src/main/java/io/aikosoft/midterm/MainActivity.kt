package io.aikosoft.midterm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = ApplicationRecyclerViewAdapter(getFruits().apply {
            addAll(getFruits())
            addAll(getFruits())
        })
    }

    private fun getFruits() = arrayListOf(
            App("Spiderman", "17 Years Old","Power type: 100%", R.drawable.spider, R.drawable.rating_black  ),
            App("Superman", "30 Years Old","Power type 100%", R.drawable.superman, R.drawable.rating_black),
            App("Batman", "43 Years Old","Power type 100%", R.drawable.batman, R.drawable.rating_black),
            App("Halk", "47 Years Old","Power type 100%", R.drawable.halk, R.drawable.rating_black)

    )
}