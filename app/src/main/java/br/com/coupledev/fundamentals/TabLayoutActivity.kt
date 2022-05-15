package br.com.coupledev.fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.coupledev.fundamentals.adapters.TabViewPagerAdapter
import br.com.coupledev.fundamentals.databinding.ActivityTabLayoutBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabLayoutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTabLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var pagesContent = listOf(
            "First Tab",
            "Second Tab",
            "Third Tab",
            "Fourth Tab",
            "Fifth Tab",
        )

        val adapter = TabViewPagerAdapter(pagesContent)
        binding.tabViewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.tabViewPager) {tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@TabLayoutActivity, "Selected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@TabLayoutActivity, "Unselected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@TabLayoutActivity, "ReSelected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }

        })
    }
}