package com.example.geoquizapp1m

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.geoquizapp1m.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val totalQuestion = 4
        var totalCorrect = 0
        var totalWrong = 0

        if(Utils.q1Answer){
            totalCorrect += 1
        }
        if(Utils.q2Answer){
            totalCorrect += 1
        }
        if(Utils.q3Answer){
            totalCorrect += 1
        }
        if(Utils.q4Answer){
            totalCorrect += 1
        }

        totalWrong = totalQuestion - totalCorrect

        binding.correctAnswer.text = totalCorrect.toString()
        binding.wrongAnswer.text = totalWrong.toString()

    }

    override fun onBackPressed() {
        Toast.makeText(this, "Quiz End Here!", Toast.LENGTH_SHORT).show()
        super.onBackPressed()

    }
}