package br.com.coupledev.fundamentals

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.set
import br.com.coupledev.fundamentals.databinding.ActivitySharedPrefsBinding

class SharedPrefsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySharedPrefsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySharedPrefsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        binding.btnSave.setOnClickListener {
            val name = binding.etPrefsName.text.toString()
            val age = binding.etPrefsAge.text.toString().toInt()
            val isAdult = binding.cbAdult.isChecked

            editor.apply {
                putString("name", name)
                putInt("age", age)
                putBoolean("isAdult", isAdult)
                apply()
            }
        }

        binding.btnLoad.setOnClickListener {
            val name = sharedPref.getString("name", null)
            val age = sharedPref.getInt("age", 0)
            val isAdult = sharedPref.getBoolean("isAdult", false)

            binding.etPrefsName.setText(name)
            binding.etPrefsAge.setText(age.toString())
            binding.cbAdult.isChecked = isAdult
        }
    }
}