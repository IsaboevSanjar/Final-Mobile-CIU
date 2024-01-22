package sanjar.uz.finalpreperation.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import sanjar.uz.finalpreperation.databinding.ItemsNewsBinding

class Adapter : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    private val news = ArrayList<NewsData>()
    fun addNews(data: List<NewsData>) {
        this.news.addAll(data)
        notifyDataSetChanged()
    }

    inner class MyViewHolder(private val binding: ItemsNewsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun workWithData(data: NewsData, position: Int) {
            binding.newsDesc.text = data.description
            binding.newsTime.text = data.time
            binding.newsTitle.text = data.title
            Glide.with(binding.newsImg.context).load(data.img).centerCrop().into(binding.newsImg)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemsNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.workWithData(news[position], position)
    }
}