package br.com.coupledev.fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.coupledev.fundamentals.databinding.ActivityShowDataBinding

class ShowDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShowDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.getSerializableExtra("EXTRA_PERSON").also {
            binding.tvFromIntent.text = it.toString()
        }
    }
}