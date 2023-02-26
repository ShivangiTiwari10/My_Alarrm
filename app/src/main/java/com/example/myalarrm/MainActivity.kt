package com.example.myalarrm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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

            R.id.sendFeedback -> Toast.makeText(this, "You clicked on sendFeedback", Toast.LENGTH_SHORT)
                .show()


            R.id.help -> Toast.makeText(this, "You clicked on help", Toast.LENGTH_SHORT)
                .show()
        }
        return true
    }

}