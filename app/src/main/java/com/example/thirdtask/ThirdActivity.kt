package com.example.thirdtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        handler=Handler()
        handler.postDelayed({
            val intent = Intent(this,LastActivity::class.java)
            startActivity(intent)
            finish()
        } ,  7000)

    }
}