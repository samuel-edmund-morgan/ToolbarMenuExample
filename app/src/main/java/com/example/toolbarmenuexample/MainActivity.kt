package com.example.toolbarmenuexample

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
        menuInflater.inflate(R.menu.menu_resource, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.back -> Toast.makeText(this, "BACK", Toast.LENGTH_LONG).show()
            R.id.contacts -> Toast.makeText(this, "CONTACTS", Toast.LENGTH_LONG).show()
            R.id.photo -> Toast.makeText(this, "PHOTO", Toast.LENGTH_LONG).show()
            R.id.settings -> Toast.makeText(this, "SETTINGS", Toast.LENGTH_LONG).show()
        }
        return true
    }
}