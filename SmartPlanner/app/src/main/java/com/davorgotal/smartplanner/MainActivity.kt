package com.davorgotal.smartplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    /*PRIVATNE VARIJABLE ZA FRAGMENTE*/
    private val DiagramFragment = DiagramFragment()
    private val TasksFragment = TasksFragment()
    private val CalendarFragment = CalendarFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*MICANJE POCETNOG NAV BAR-A*/
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        /*TODAY DATE*/
        val todayDate: TextView = findViewById(R.id.currentDaytv)
        val simpleDateFormat = SimpleDateFormat("dd.MM.yyyy")
        val currentDateAndTime: String = simpleDateFormat.format(Date())
        todayDate.text = currentDateAndTime
    }
}
