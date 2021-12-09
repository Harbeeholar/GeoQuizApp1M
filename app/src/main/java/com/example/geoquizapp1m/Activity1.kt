package com.example.geoquizapp1m

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.geoquizapp1m.databinding.ActivityMainBinding

class Activity1 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nextQuestion.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
            finish()
        }
        binding.previousQuestion.setOnClickListener {
            startActivity(Intent(this, Activity4::class.java))
            finish()
        }
        binding.falseButton.setOnClickListener {
            Utils.q1Answer = false
            Toast.makeText(this, "False is Selected", Toast.LENGTH_SHORT).show()
        }
        binding.trueButton.setOnClickListener {
            Utils.q1Answer = true
            Toast.makeText(this, "True is Corrected", Toast.LENGTH_SHORT).show()

        }

    }
}