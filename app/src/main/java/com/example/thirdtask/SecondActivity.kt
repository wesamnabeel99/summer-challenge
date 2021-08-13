package com.example.thirdtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView

lateinit var lottieAnimationView: LottieAnimationView
lateinit var handler:Handler
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        handler= Handler()
        handler.postDelayed({
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
            finish()
        } ,  7000)
    }
}