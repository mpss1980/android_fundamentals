package br.com.coupledev.fundamentals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.coupledev.fundamentals.databinding.ActivityDataIntentBinding

class DataIntentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSendData.setOnClickListener {
            Intent(this, ShowDataActivity::class.java).also {
                val name = binding.etName.text.toString()
                val age = binding.etAge.text.toString().toInt()
                val country = binding.etCountry.text.toString()
                val person = Person(name, age, country)

                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }

        }
    }
}