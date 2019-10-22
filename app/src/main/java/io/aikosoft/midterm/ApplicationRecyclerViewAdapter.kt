package io.aikosoft.cardsdemo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ApplicationRecyclerViewAdapter(private val app: List<App>) :
        RecyclerView.Adapter<ApplicationRecyclerViewAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_app, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(app[position])
    }

    override fun getItemCount(): Int = app.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvName: TextView = itemView.findViewById(R.id.tv_name)
        private val tvDescription: TextView = itemView.findViewById(R.id.tv_description)
        private val tvRating: TextView = itemView.findViewById(R.id.tv_rating)
        private val tvStatus: TextView = itemView.findViewById(R.id.tv_status)
        private val ivPhoto: ImageView = itemView.findViewById(R.id.iv_photo)
        private val ivRating: ImageView = itemView.findViewById(R.id.iv_photo_rating)


        fun bind(app: App) {
            tvName.text = app.name
            ivPhoto.setImageResource(app.imgRes)
            ivRating.setImageResource(app.imgRating)
            tvDescription.text = app.description
            tvRating.text = app.rating
            tvStatus.text = app.status

            itemView.setOnClickListener {
                Intent(context, DetailActivity::class.java).also {
                    it.putExtra("app", app)
                    context.startActivity(it)
                }
            }
        }
    }
}