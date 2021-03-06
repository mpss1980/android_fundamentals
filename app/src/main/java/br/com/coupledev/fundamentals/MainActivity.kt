package br.com.coupledev.fundamentals

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import br.com.coupledev.fundamentals.databinding.ActivityMainBinding
import br.com.coupledev.fundamentals.receivers.AirplaneModeChangedReceiver

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var receiver: AirplaneModeChangedReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        receiver = AirplaneModeChangedReceiver()
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver, it)
        }

        binding.btnOpenPermissions.setOnClickListener {
            Intent(this, PermissionsActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenImplicitsIntents.setOnClickListener {
            Intent(this, IntentsActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenDataIntent.setOnClickListener {
            Intent(this, DataIntentActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenDialogs.setOnClickListener {
            Intent(this, DialogActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenSpinner.setOnClickListener {
            Intent(this, SpinnerActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenRecyclerView.setOnClickListener {
            Intent(this, RecycleViewActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenFragments.setOnClickListener {
            Intent(this, FragmentActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenBottomNavigation.setOnClickListener {
            Intent(this, BottomNavigationActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenviewPager.setOnClickListener {
            Intent(this, ViewPagerActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenTabLayout.setOnClickListener {
            Intent(this, TabLayoutActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenNavDrawer.setOnClickListener {
            Intent(this, NavigationDrawerActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenSharedPrefs.setOnClickListener {
            Intent(this, SharedPrefsActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnNotification.setOnClickListener {
            Intent(this, ShowNotificationActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenIntenService.setOnClickListener {
            Intent(this, IntentServiceActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnOpenDragAndDrop.setOnClickListener {
            Intent(this, DragAndDropActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.miAddContact -> Toast.makeText(this, "You clicked on Add Contact", Toast.LENGTH_SHORT).show()
            R.id.miFavorites -> Toast.makeText(this, "You clicked on Favorites", Toast.LENGTH_SHORT).show()
            R.id.miSettings -> Toast.makeText(this, "You clicked on Settings", Toast.LENGTH_SHORT).show()
            R.id.miClose -> finish()
            R.id.miFeedback -> Toast.makeText(this, "You clicked on Feedback", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}
