package br.com.coupledev.fundamentals.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.coupledev.fundamentals.databinding.ItemTabViewPagerBinding

class TabViewPagerAdapter(
    val pagesContent: List<String>
): RecyclerView.Adapter<TabViewPagerAdapter.TabViewPagerHolder>() {
    inner class TabViewPagerHolder(val binding: ItemTabViewPagerBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TabViewPagerHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemTabViewPagerBinding.inflate(layoutInflater, parent, false)
        return TabViewPagerHolder(binding)
    }

    override fun onBindViewHolder(holder: TabViewPagerHolder, position: Int) {
        val currentPageContent = pagesContent[position]
        holder.binding.tvItemTabViewPager.text = currentPageContent
    }

    override fun getItemCount(): Int {
        return pagesContent.size
    }
}