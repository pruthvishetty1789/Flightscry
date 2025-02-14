package com.example.flightscry

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Retrieve UI components
        val flightNumber: TextView = findViewById(R.id.flight_number)
        val departureAirport: TextView = findViewById(R.id.departure_airport)
        val departureTime: TextView = findViewById(R.id.departure_time)
        val arrivalAirport: TextView = findViewById(R.id.arrival_airport)
        val arrivalTime: TextView = findViewById(R.id.arrival_time)

        // Set dummy flight data
        flightNumber.text = "Flight BA1456"
        departureAirport.text = "EDI (Edinburgh)"
        departureTime.text = "08:30 AM"
        arrivalAirport.text = "LHR (London Heathrow)"
        arrivalTime.text = "10:15 AM"
    }
}
