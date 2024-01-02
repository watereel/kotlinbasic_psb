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
        val userAge = 17

        if (userAge >= 20){
            Log.d("성인판별", "성인이맞습니다")
        }
        else if (userAge >= 17){
            Log.d("성인판별", "고등학생.")
        }
        else if (userAge >= 14){
            Log.d("성인판별", "중학생.")
        }
        else {
            Log.d("성인판별", "성인이 아닙니다.")
        }

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
