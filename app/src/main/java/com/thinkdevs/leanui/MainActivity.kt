package com.thinkdevs.leanui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		object : CountDownTimer(1000, 1000){
			override fun onFinish() {
			
				counter.text = "Left : 0"
			}
			
			override fun onTick(p0: Long) {
				counter.text = "Left : ${p0 / 1000}"
			}
			
		}
	}
}
