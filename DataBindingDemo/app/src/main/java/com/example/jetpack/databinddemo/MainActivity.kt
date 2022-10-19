package com.example.jetpack.databinddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jetpack.databinddemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //databing方式绑定数据
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = User("liangyanbin", 20)

        //传统方式绑定数据
//        setContentView(R.layout.activity_main)
//        val user = User("liangyanbin", 20)
//        val tvName = findViewById<TextView>(R.id.tvName);
//        tvName.text = user.name
    }
}