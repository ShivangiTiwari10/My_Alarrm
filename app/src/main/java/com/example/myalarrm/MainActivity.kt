package com.example.myalarrm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.myalarrm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        val navController = navHostFragment!!.findNavController()

        val popupMenu = PopupMenu(this, null)
        popupMenu.inflate(R.menu.bottom_toolbar)

        binding.bottomBar.setupWithNavController(popupMenu.menu, navController)
        Log.d("Bottombar","${navController.navInflater}")


        binding.bottomBar.onItemSelected = {
            when (it) {
                0 -> {
                    i = 0
                    navController.navigate(R.id.alarmFragment)
               Log.d("Bottombar","${navController.navInflater}")
                }
                1 -> i = 1
                2 -> i = 2
                3 -> i = 3
                4 -> i = 4
            }
        }


        navController.addOnDestinationChangedListener { controller, destination, arguments ->

            title = when (destination.id) {
                R.id.alarmFragment -> "MyAlarm"
                R.id.clockFragment -> "clockFragment"
                R.id.timerFragment -> "Timer"
                R.id.stopwatchFragment -> "stopwatchFragment"
                R.id.bedtimeFragment -> "bedtimeFragment"
                else -> " p-Kart"
            }
            Log.d("destinATION","$controller")

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.ScreenSaver -> Toast.makeText(
                this,
                "You clicked on ScreenSaver",
                Toast.LENGTH_SHORT
            ).show()


            R.id.Settings -> Toast.makeText(this, "You clicked on Settings", Toast.LENGTH_SHORT)
                .show()

            R.id.privacy -> Toast.makeText(this, "You clicked on privacy", Toast.LENGTH_SHORT)
                .show()

            R.id.sendFeedback -> Toast.makeText(
                this,
                "You clicked on sendFeedback",
                Toast.LENGTH_SHORT
            )
                .show()


            R.id.help -> Toast.makeText(this, "You clicked on help", Toast.LENGTH_SHORT)
                .show()
        }
        return true
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        if (i == 0) {
            finish()
        }

    }

}