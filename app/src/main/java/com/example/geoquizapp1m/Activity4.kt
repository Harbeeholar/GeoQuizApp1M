package com.example.geoquizapp1m

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.geoquizapp1m.databinding.Activity4Binding

class Activity4 : AppCompatActivity() {
    private lateinit var binding: Activity4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        binding = Activity4Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nextQuestion.setOnClickListener {
            startActivity(Intent(this, Activity1::class.java))
            finish()
        }
        binding.previousQuestion.setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
            finish()
        }
        binding.falseButton.setOnClickListener {
            Utils.q2Answer = false
            Toast.makeText(this, "False is Selected", Toast.LENGTH_SHORT).show()

        }
        binding.trueButton.setOnClickListener {
            Toast.makeText(this, "True is Corrected", Toast.LENGTH_SHORT).show()
            Utils.q2Answer = true
        }
        binding.resultButton.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
            finish()
        }
    }
}