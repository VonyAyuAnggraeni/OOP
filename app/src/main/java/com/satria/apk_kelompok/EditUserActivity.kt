package com.satria.apk_kelompok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.satria.apk_kelompok.Database.AppRoomDB
import com.satria.apk_kelompok.Database.User
import kotlinx.android.synthetic.main.activity_edit_user.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EditUserActivity : AppCompatActivity() {

    val db by lazy { AppRoomDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_user)
        setupListener()
    }

    fun setupListener(){
        btn_saveUser.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                db.userDao().addUser(
                    User(0, txt_nama.text.toString(), txt_username.text.toString())
                )
                finish()
            }
        }
    }
}