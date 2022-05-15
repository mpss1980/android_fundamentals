package br.com.coupledev.fundamentals.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.coupledev.fundamentals.databinding.ItemViewPagerBinding

class ViewPagerAdapter(
    val images: List<Int>
): RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder(val binding: ItemViewPagerBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemViewPagerBinding.inflate(layoutInflater, parent, false)
        return ViewPagerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val currentImage = images[position]
        holder.binding.ivImageViewPager.setImageResource(currentImage)
    }

    override fun getItemCount(): Int {
        return images.size
    }
}