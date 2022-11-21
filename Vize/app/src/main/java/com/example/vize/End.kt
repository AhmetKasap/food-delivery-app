package com.example.vize

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text
import kotlin.system.exitProcess

class End : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        var textView1 = findViewById<TextView>(R.id.textView1)
        var textView2 = findViewById<TextView>(R.id.textView2)
        var textView3 = findViewById<TextView>(R.id.textView3)

        var alinanTuz = intent.getStringExtra("tuz")
        var alinanAci = intent.getStringExtra("aci")


        var textView6 = findViewById<TextView>(R.id.textView6)


        var alinanCorbaAdi = intent.getStringExtra("corbaIsmi")

        var krema = intent.getStringExtra("xKrema")
        var nane = intent.getStringExtra("xNane")
        var kitir = intent.getStringExtra("xKitir")
        var limon = intent.getStringExtra("xLimon")
        var yag = intent.getStringExtra("xYag")
        var biber = intent.getStringExtra("xBiber")
        var sarimsak = intent.getStringExtra("xSarimsak")
        var sirke = intent.getStringExtra("xSirke")
        var dil = intent.getStringExtra("xDil")
        var beyin = intent.getStringExtra("xBeyin")
        var kasar = intent.getStringExtra("xKasar")
        var terbiye = intent.getStringExtra("xTerbiye")

        var textView4 = findViewById<TextView>(R.id.textView4)
        var istek = intent.getStringExtra("istek")




        if (alinanCorbaAdi == "Brokoli Çorbası") {
            textView1.text = "$alinanCorbaAdi  Çeeek"
            textView2.text = "İçinde $krema olsun"
            textView3.text = "$alinanTuz " + "$alinanAci olsun"

            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }

        }
        else if(alinanCorbaAdi == "Ezogelin Çorbası") {
            textView1.text = "$alinanCorbaAdi Çeeek"
            textView2.text = "İçinde $nane" + " $kitir" + " $yag" +" $limon"+ " $biber olsun"
            textView3.text = "$alinanTuz " + "$alinanAci olsun"

            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }
        }
        else if(alinanCorbaAdi == "Düğün Çorbası") {
            textView1.text = "$alinanCorbaAdi Çeeek"
            textView2.text = "İçinde $nane" + " $kitir" + " $yag" +" $limon"+ " $biber olsun"
            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }
        }
        else if(alinanCorbaAdi == "Mercimek Çorbası") {
            textView1.text = "$alinanCorbaAdi Çeeek"
            textView2.text = "İçinde $nane" + " $kitir" + " $yag" +" $limon"+ " $biber olsun"

            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }
        }
        else if(alinanCorbaAdi == "Kelle Paça Çorbası") {
            textView1.text = "$alinanCorbaAdi Çeeek"
            textView2.text = "İçinde $sarimsak" + " $dil" + " $beyin" +" $yag"+ " $limon"+ " $sirke olsun"

            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }
        }
        else if(alinanCorbaAdi == "Yayla Çorbası") {
            textView1.text = "$alinanCorbaAdi Çeeek"
            textView2.text = "İçinde $nane" + " $kitir" + " $yag" + " $biber olsun"

            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }
        }
        else if(alinanCorbaAdi == "Şehriye Çorbası") {
            textView1.text = "$alinanCorbaAdi Çeeek"
            textView2.text = "İçinde $nane" + " $limon" + " $yag" + " $biber olsun"

            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }
        }
        else if(alinanCorbaAdi == "Domates Çorbası") {
            textView1.text = "$alinanCorbaAdi Çeeek"
            textView2.text = "İçinde $nane" + " $kitir" + " $limon" + " $yag" + " $biber" + " $terbiye" + " $kasar olsun"

            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }
        }
        else if(alinanCorbaAdi == "Tarhana Çorbası") {
            textView1.text = "$alinanCorbaAdi Çeeek"
            textView2.text = "İçinde $yag" + " $biber olsun"

            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }
        }
        else if (alinanCorbaAdi == "Mantar Çorbası") {
            textView1.text = "$alinanCorbaAdi Çeeek"
            textView2.text = "İçinde $krema olsun"

            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }
        }
        else if(alinanCorbaAdi == "İşkembe Çorbası") {
            textView1.text = "$alinanCorbaAdi Çeeek"
            textView2.text = "İçinde $sarimsak" + " $sirke" + " $limon" +" $yag"+ " $biber olsun"

            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }
        }
        else if(alinanCorbaAdi == "Tavuk Çorbası") {
            textView1.text = "$alinanCorbaAdi  Çeeek"
            textView2.text = "İçinde $limon" + " $krema" + " $yag olsun"

            if (alinanTuz == null && alinanAci == null) {
                textView3.text = "Tuzsuz ve Acısız olsun."
            }
            else {
                textView3.text = "$alinanTuz " + "$alinanAci olsun"
            }

            if (istek != "") {
                textView4.visibility = View.VISIBLE
                textView4.text= "Ekstra $istek lütfen."
            }
        }

        else {
            finish()
        }








        textView6.animation(50)
        textView6.setOnClickListener{
            Handler().postDelayed({
                var gecis = Intent(this,Soup::class.java)
                startActivity(gecis)
                finish()



            },0)
        }


        var close = findViewById<ImageView>(R.id.close)

        close.setOnClickListener{
            var alert = AlertDialog.Builder(this)
            alert.setTitle("Çıkış")
            alert.setMessage("Çıkmak istediğinize emin misiniz?")
            alert.setIcon(R.drawable.close)
            alert.setCancelable(false)
            alert.setPositiveButton("Evet"){DialogInterface,i->
                finish()

            }
            alert.setNegativeButton("Hayır"){DialogInterface,i->

            }
            alert.create().show()


        }







    }


}

fun View.animation(
    times: Int = Animation.INFINITE,
    duration: Long = 220L,
    offset: Long = 90L,
    minAlpha: Float = 0.0f,
    maxAlpha: Float = 1.0f,
    repeatMode: Int = Animation.REVERSE
) {
    startAnimation(AlphaAnimation(minAlpha, maxAlpha).also {
        it.duration = duration
        it.startOffset = offset
        it.repeatMode = repeatMode
        it.repeatCount = times
    })
}