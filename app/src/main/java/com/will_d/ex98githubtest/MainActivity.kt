package com.will_d.ex98githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val tv:TextView by lazy { findViewById(R.id.tv) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "GitHub Test"

        var a:Int = 10
        supportActionBar?.subtitle = "sub Title : $a"

        tv.text = "Sample Text"
    }
}
