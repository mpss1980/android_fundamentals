package br.com.coupledev.fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import br.com.coupledev.fundamentals.adapters.ViewPagerAdapter
import br.com.coupledev.fundamentals.databinding.ActivityViewPagerBinding

class ViewPagerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewPagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = listOf(
            R.drawable.photo_um,
            R.drawable.photo_dois,
            R.drawable.photo_um,
            R.drawable.photo_dois,
            R.drawable.photo_um,
            R.drawable.photo_dois,
        )

        val adapter = ViewPagerAdapter(images)
        binding.viewPager.adapter = adapter

        binding.viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        binding.viewPager.beginFakeDrag()
        binding.viewPager.fakeDragBy(-10f)
        binding.viewPager.endFakeDrag()
    }
}