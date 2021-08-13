package com.example.thirdtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import java.util.*
;
lateinit var intent:Intent
class MainActivity : AppCompatActivity() {
    lateinit var handler : Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler=Handler()
        handler.postDelayed({
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        } ,  7000)
    }
}
