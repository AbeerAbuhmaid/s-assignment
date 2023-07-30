package com.example.s_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment

import com.example.abeer_assignment.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p: TextView = findViewById(R.id.phg)
        p.setOnClickListener {
            var a = DialogFragment()
            a.show(supportFragmentManager, "Power House Gym")


        }

    }

    fun receiveFeedback(feedback: String) {
        val x: TextView = findViewById(R.id.phg)
        x.text = feedback;

    }


    fun OnCreateOptionMenu(menu: Menu): Boolean {
        var inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show()
            R.id.item3 -> Toast.makeText(this, "item 3 selected", Toast.LENGTH_SHORT).show()
            R.id.item4 -> Toast.makeText(this, "item 4 selected", Toast.LENGTH_SHORT).show()
        }
        return true;
    }
}