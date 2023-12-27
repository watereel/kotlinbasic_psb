// MainActivity.kt
package com.example.kotlinbasic_psb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.kotlinbasic_psb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val myName : String
        val MyAge : Int
        binding.clickBtn.setOnClickListener {
            Log.d("메인화면로그", "큰버튼눌림")
            Log.e("에러관련로그","에러로그")
        }
        binding.smallBtn.setOnClickListener {
            Toast.makeText(this, "작은버튼눌림", Toast.LENGTH_SHORT).show()
        }
        // Now you can access views using `binding` e.g., binding.myTextView.text = "Hello, ViewBinding!"
    }
}
