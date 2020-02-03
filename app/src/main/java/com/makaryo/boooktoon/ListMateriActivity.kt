package com.makaryo.boooktoon

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_materi.*
import kotlinx.android.synthetic.main.activity_main.*

class ListMateriActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_materi)

            btnMateri1.setOnClickListener {
                var intent = Intent()
                val data : String =  "1"
                val text : String = btnMateri1.text as String
                intent = Intent(applicationContext, MateriActivity::class.java)
                intent.putExtra("data", data)
                intent.putExtra("dataDes", text)
                startActivity(intent)
            }
            btnMateri2.setOnClickListener {
                var intent1 = Intent()
                val data : String =  "2"
                val text : String = btnMateri2.text as String

                intent1 = Intent(applicationContext, MateriActivity::class.java)
                intent1.putExtra("data", data)
                intent1.putExtra("dataDes", text)
                startActivity(intent1)
            }
            btnMateri3.setOnClickListener {
                var intent2 = Intent()
                val data : String =  "3"
                val text : String = btnMateri2.text as String

                intent2 = Intent(applicationContext, MateriActivity::class.java)
                intent2.putExtra("data", data)
                intent2.putExtra("dataDes", text)
                startActivity(intent2)
            }

            btnMateri4.setOnClickListener {
                var intent3 = Intent()
                val data : String =  "4"
                val text : String = btnMateri4.text as String
                intent3 = Intent(applicationContext, MateriActivity::class.java)
                intent3.putExtra("data", data)
                intent3.putExtra("dataDes", text)
                startActivity(intent3)
            }
            btnMateri5.setOnClickListener {
                var intent4 = Intent()
                val data : String =  "5"
                val text : String = btnMateri5.text as String
                intent4 = Intent(applicationContext, MateriActivity::class.java)
                intent4.putExtra("data", data)
                intent4.putExtra("dataDes", text)
                startActivity(intent4)
            }

            btnMateri6.setOnClickListener {
                var intent5 = Intent()
                val data : String =  "6"
                val text : String = btnMateri6.text as String
                intent5 = Intent(applicationContext, MateriActivity::class.java)
                intent5.putExtra("data", data)
                intent5.putExtra("dataDes", text)
                startActivity(intent5)
            }
            btnMateri7.setOnClickListener {
                var intent6 = Intent()
                val data : String =  "7"
                val text : String = btnMateri7.text as String
                intent6 = Intent(applicationContext, MateriActivity::class.java)
                intent6.putExtra("data", data)
                intent6.putExtra("dataDes", text)
                startActivity(intent6)
            }

            btnMateri8.setOnClickListener {
                var intent7 = Intent()
                val data : String =  "8"
                val text : String = btnMateri8.text as String
                intent7 = Intent(applicationContext, MateriActivity::class.java)
                intent7.putExtra("data", data)
                intent7.putExtra("dataDes", text)
                startActivity(intent7)
            }

    }
}
