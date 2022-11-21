package com.example.vize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var a = findViewById<TextView>(R.id.a)
        var h = findViewById<TextView>(R.id.h)
        var m = findViewById<TextView>(R.id.m)
        var e = findViewById<TextView>(R.id.e)
        var t = findViewById<TextView>(R.id.t)

        var check1 = findViewById<ImageView>(R.id.check1)
        var check2 = findViewById<ImageView>(R.id.check2)
        var check3 = findViewById<ImageView>(R.id.check3)
        var check4 = findViewById<ImageView>(R.id.check4)
        var check5 = findViewById<ImageView>(R.id.check5)

        var progressBar = findViewById<ProgressBar>(R.id.progressBar)


        a.setOnClickListener{
            check1.visibility = View.VISIBLE
        }

        h.setOnClickListener{
            if (check1.visibility == View.VISIBLE) {
                check2.visibility = View.VISIBLE
            }
        }

        m.setOnClickListener{
            if (check2.visibility == View.VISIBLE) {
                check3.visibility = View.VISIBLE
            }
        }

        e.setOnClickListener{
            if (check3.visibility == View.VISIBLE) {
                check4.visibility = View.VISIBLE
            }
        }

        t.setOnClickListener{
            if (check4.visibility == View.VISIBLE) {
                check5.visibility = View.VISIBLE
                progressBar.visibility = View.VISIBLE

                object : CountDownTimer(3000,1000){
                    override fun onTick(p0: Long) {
                    }
                    override fun onFinish() {
                        var gecis = Intent(applicationContext, Soup::class.java)
                        startActivity(gecis)
                        finish()
                    }
                }.start()

            }
        }















    }
}
