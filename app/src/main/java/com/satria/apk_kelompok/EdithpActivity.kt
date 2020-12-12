package com.satria.apk_kelompok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.satria.apk_kelompok.Database.AppRoomDB
import com.satria.apk_kelompok.Database.hp
import kotlinx.android.synthetic.main.activity_edit_hp.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EdithpActivity : AppCompatActivity() {

    val db by lazy { AppRoomDB(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_hp)
        setupListener()
    }

    fun setupListener(){
        btn_savehp.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                db.hpDao().addHp(
                    hp(0, txt_merk.text.toString(), Integer.parseInt(txt_stok.text.toString()), Integer.parseInt(txt_harga.text.toString()) )
                )
                finish()
            }
        }
    }
}