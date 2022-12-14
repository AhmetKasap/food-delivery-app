package com.example.vize

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class Soup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soup)

        var ezogelin = findViewById<RadioButton>(R.id.ezogelin)
        var dugun = findViewById<RadioButton>(R.id.dugun)
        var mercimek = findViewById<RadioButton>(R.id.mercimek)
        var brokoli = findViewById<RadioButton>(R.id.brokoli)
        var kelle = findViewById<RadioButton>(R.id.kelle)
        var yayla = findViewById<RadioButton>(R.id.yayla)
        var sehriye = findViewById<RadioButton>(R.id.sehriye)
        var domates = findViewById<RadioButton>(R.id.domates)
        var tarhana = findViewById<RadioButton>(R.id.tarhana)
        var mantar = findViewById<RadioButton>(R.id.mantar)
        var iskembe = findViewById<RadioButton>(R.id.iskembe)
        var tavuk = findViewById<RadioButton>(R.id.tavuk)

        var radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        var checkBox = findViewById<CheckBox>(R.id.checkBox)
        var devamBtn = findViewById<Button>(R.id.devam)


        checkBox.setOnClickListener {
            if (checkBox.isChecked == true){
                radioGroup.visibility = View.VISIBLE
                devamBtn.visibility = View.VISIBLE

            }else if (checkBox.isChecked == false){
                radioGroup.visibility = View.INVISIBLE
                devamBtn.visibility = View.INVISIBLE
            }
        }




        devamBtn.setOnClickListener{

            var design = layoutInflater.inflate(R.layout.private_toast,null)
            var tostId = design.findViewById<TextView>(R.id.tostId)
            var tost = Toast(applicationContext)
            tost.view = design
            tost.setGravity(Gravity.BOTTOM,0,0)
            tost.duration = Toast.LENGTH_SHORT

            if (ezogelin.isChecked){
                tostId.text="Ezogelin ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "Ezogelin ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)

            }
            else if (dugun.isChecked){
                tostId.text="D??????n ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "D??????n ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)
            }
            else if (mercimek.isChecked){
                tostId.text="Mercimek ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "Mercimek ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)
            }
            else if (brokoli.isChecked){
                tostId.text="Brokoli ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "Brokoli ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)
            }
            else if (kelle.isChecked){
                tostId.text="Kelle Pa??a ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "Kelle Pa??a ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)
            }
            else if (yayla.isChecked){
                tostId.text="Yayla ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "Yayla ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)
            }
            else if (sehriye.isChecked){
                tostId.text="??ehriye ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "??ehriye ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)
            }
            else if (domates.isChecked){
                tostId.text="Domates ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "Domates ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)
            }
            else if (tarhana.isChecked){
                tostId.text="Tarhana ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "Tarhana ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)
            }
            else if (mantar.isChecked){
                tostId.text="Mantar ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "Mantar ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)
            }
            else if (iskembe.isChecked){
                tostId.text="????kembe ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "????kembe ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)
            }
            else if (tavuk.isChecked){
                tostId.text="Tavuk ??orbas?? G??zel Se??im. L??tfen Bekleyiniz"
                tost.show()
                Handler().postDelayed({
                    var gecis = Intent(this,Order::class.java)
                    var corbaIsmi = "Tavuk ??orbas??"
                    gecis.putExtra("corbaIsmi",corbaIsmi)
                    startActivity(gecis)
                    finish()

                },3000)
            }
            else{
                Toast.makeText(applicationContext,"L??tfen bir ??orba se??iniz.",Toast.LENGTH_LONG).show()
                var alert = AlertDialog.Builder(this)
                alert.setTitle("UYARI")
                alert.setMessage("L??tfen Se??iminizi Yap??n")
                alert.setIcon(R.drawable.logo)
                alert.setCancelable(false)

                alert.setPositiveButton("Tekrar Dene"){dialog,which->

                }
                alert.show()

            }


            }


    }
}


