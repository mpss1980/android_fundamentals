package br.com.coupledev.fundamentals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.coupledev.fundamentals.databinding.ActivityIntentServiceBinding
import br.com.coupledev.fundamentals.services.MyIntentService
import br.com.coupledev.fundamentals.services.MyService

class IntentServiceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntentServiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentServiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIntentStart.setOnClickListener {
            Intent(this, MyIntentService::class.java).also {
                startService(it)
                binding.tvIntentService.text = "Service running"
            }
        }

        binding.btnIntentStop.setOnClickListener {
            MyIntentService.stopService()
            binding.tvIntentService.text = "Service stopped"
        }

        binding.btnIntentStart2.setOnClickListener {
            Intent(this, MyService::class.java).also {
                startService(it)
                binding.tvIntentService2.text = "Service 2 running"
            }
        }

        binding.btnIntentStop2.setOnClickListener {
            Intent(this, MyService::class.java).also {
                stopService(it)
                binding.tvIntentService2.text = "Service 2 stopped"
            }
        }

        binding.btnSendServiceData.setOnClickListener {
            Intent(this, MyService::class.java).also {
                val dataString = binding.etDataString.text.toString()
                it.putExtra("EXTRA_DATA", dataString)
                startService(it)
            }
        }
    }
}