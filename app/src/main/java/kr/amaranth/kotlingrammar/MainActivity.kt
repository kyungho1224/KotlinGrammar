package kr.amaranth.kotlingrammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.amaranth.kotlingrammar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = "hi"

    }

}