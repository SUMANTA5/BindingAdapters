package com.sumanta.bindingadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sumanta.bindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val post = Post(
            "Introduction to kotlin",
            "Sumanta",
            "https://media.discordapp.net/attachments/868206566761975908/894650168052433028/Live_3.png?width=1271&height=715"
        )
        binding.post = post

    }
}