package com.satria.apk_kelompok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.satria.apk_kelompok.UserActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_hp.setOnClickListener{
            val intent = Intent(this, HpActivity::class.java)
            startActivity(intent)
        }

        btn_user.setOnClickListener{
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }

        btn_pembeli.setOnClickListener{
            val intent = Intent(this, PembeliActivity::class.java)
            startActivity(intent)
        }
    }
}