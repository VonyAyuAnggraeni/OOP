package com.satria.apk_kelompok

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.satria.apk_kelompok.Database.AppRoomDB
import kotlinx.android.synthetic.main.activity_hp.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class hpActivity : AppCompatActivity() {

    val db by lazy { AppRoomDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hp)
        setupListener()
    }

    override fun onStart() {
        super.onStart()
        CoroutineScope(Dispatchers.IO).launch {
            val allhp = db.hpDao().getAllhp()
            Log.d("hpActivity", "dbResponse: $allhp")
        }
    }

    fun setupListener() {
        btn_createhp.setOnClickListener {
            startActivity(Intent(this, EdithpActivity::class.java))
        }
    }
}