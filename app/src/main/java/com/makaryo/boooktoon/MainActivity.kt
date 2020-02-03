package com.makaryo.boooktoon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(btnPet.isClickable){
        btnPet.setOnClickListener {
             val intent = Intent(applicationContext, PetunjukActivity::class.java)
             startActivity(intent)
         }}
        if(btnEval.isClickable){
        btnEval.setOnClickListener {
            val intent = Intent(applicationContext, SoalActivity::class.java)
            startActivity(intent)
        }
        }
        if(btnDes.isClickable){
            btnDes.setOnClickListener {
                val intent = Intent(applicationContext, DeskripsiActivity::class.java)
                startActivity(intent)
            }
        }

        if(btnMateri.isClickable){
            btnMateri.setOnClickListener {
                val intent = Intent(applicationContext, ListMateriActivity::class.java)
                startActivity(intent)
            }
        }
        if(btnIden.isClickable){
            btnIden.setOnClickListener {
                val intent = Intent(applicationContext, IdentitasActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
