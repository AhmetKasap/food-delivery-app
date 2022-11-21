package com.example.vize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        var nane = findViewById<Switch>(R.id.nane)
        var yag = findViewById<Switch>(R.id.yag)
        var kitir = findViewById<Switch>(R.id.kitir)
        var limon = findViewById<Switch>(R.id.limon)
        var biber = findViewById<Switch>(R.id.biber)
        var krema = findViewById<Switch>(R.id.krema)
        var sarimsak = findViewById<Switch>(R.id.sarimsak)
        var dil = findViewById<Switch>(R.id.dil)
        var sirke = findViewById<Switch>(R.id.sirke)
        var beyin = findViewById<Switch>(R.id.beyin)
        var kasar = findViewById<Switch>(R.id.kasar)
        var terbiye = findViewById<Switch>(R.id.terbiye)

        var siparisVer = findViewById<Button>(R.id.siparisVer)
        var input = findViewById<EditText>(R.id.input)
        var gecis = Intent(this,End::class.java)


        var seekBar1 = findViewById<SeekBar>(R.id.seekBar1)
        var seekBar2 = findViewById<SeekBar>(R.id.seekBar2)

        var alert = AlertDialog.Builder(this)
        alert.setTitle("Uyarı!")
        alert.setMessage("Bu Kadar Tuz İstediğinize Emin Misiniz?")
        alert.setCancelable(false)
        alert.setIcon(R.drawable.salt)

        var alert2 = AlertDialog.Builder(this)
        alert2.setTitle("Uyarı!!")
        alert2.setMessage("Bu Kadar Acı İstediğinize Emin Misiniz?")
        alert2.setCancelable(false)
        alert2.setIcon(R.drawable.pepper)


        seekBar1.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 2){
                    alert.setPositiveButton("Evet"){DialogInterface, i->
                    }
                    alert.setNegativeButton("Hayır"){DialogInterface, i->
                        seekBar1.progress = 1
                    }
                    alert.create().show()
                }
                if (seekBar1.progress == 0){
                    var tuz = "Tuzsuz"
                    gecis.putExtra("tuz",tuz)
                }else if (seekBar1.progress == 1){
                    var tuz = "Orta Tuzlu"
                    gecis.putExtra("tuz",tuz)
                }else if (seekBar1.progress == 2){
                    var tuz = "Bol Tuzlu"
                    gecis.putExtra("tuz",tuz)
                }

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })

        seekBar2.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 2){
                    alert2.setPositiveButton("Evet"){DialogInterface, i->
                    }
                    alert2.setNegativeButton("Hayır"){DialogInterface, i->
                        seekBar2.progress = 1
                    }
                    alert2.create().show()
                }
                else {
                    var x = 10

                }
                if (seekBar2.progress==0){
                    var aci = "Acısız"
                    gecis.putExtra("aci",aci)
                }else if (seekBar2.progress == 1){
                    var aci = "Orta Acılı"
                    gecis.putExtra("aci",aci)
                }else if (seekBar2.progress == 2){
                    var aci = "Bol Acılı"
                    gecis.putExtra("aci",aci)
                }

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })






        var textView0 = findViewById<TextView>(R.id.textView0)
        var alinanCorbaAdi = intent.getStringExtra("corbaIsmi")

        if (alinanCorbaAdi == "Ezogelin Çorbası") {
            textView0.text = alinanCorbaAdi

            nane.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE

        }

        else if (alinanCorbaAdi == "Düğün Çorbası") {
            textView0.text = alinanCorbaAdi

            nane.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE



        } else if (alinanCorbaAdi == "Mercimek Çorbası") {
            textView0.text = alinanCorbaAdi

            nane.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE


        } else if (alinanCorbaAdi == "Brokoli Çorbası") {
            textView0.text = alinanCorbaAdi
            krema.visibility = View.VISIBLE


        }
        else if (alinanCorbaAdi == "Kelle Paça Çorbası" ) {
            textView0.text = alinanCorbaAdi

            sarimsak.visibility = View.VISIBLE
            dil.visibility = View.VISIBLE
            beyin.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE



        }
        else if (alinanCorbaAdi == "Yayla Çorbası" ) {
            textView0.text = alinanCorbaAdi

            nane.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE


        }
        else if (alinanCorbaAdi == "Şehriye Çorbası" ) {
            textView0.text = alinanCorbaAdi

            nane.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE


        }
        else if (alinanCorbaAdi == "Domates Çorbası" ) {
            textView0.text = alinanCorbaAdi

            nane.visibility = View.VISIBLE
            kitir.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE
            terbiye.visibility = View.VISIBLE
            kasar.visibility = View.VISIBLE


        }
        else if (alinanCorbaAdi == "Tarhana Çorbası" ) {
            textView0.text = alinanCorbaAdi

            yag.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE


        }
        else if (alinanCorbaAdi == "Mantar Çorbası" ) {
            textView0.text = alinanCorbaAdi

            krema.visibility = View.VISIBLE



        }
        else if (alinanCorbaAdi == "İşkembe Çorbası" ) {
            textView0.text = alinanCorbaAdi

            sarimsak.visibility = View.VISIBLE
            sirke.visibility = View.VISIBLE
            limon.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            biber.visibility = View.VISIBLE


        }
        else if (alinanCorbaAdi == "Tavuk Çorbası" ) {
            textView0.text = alinanCorbaAdi

            limon.visibility = View.VISIBLE
            yag.visibility = View.VISIBLE
            krema.visibility = View.VISIBLE


        }


        siparisVer.setOnClickListener {

            var alert = AlertDialog.Builder(this)
            alert.setTitle("Siparişinizin Durumu")
            alert.setMessage("Siparişinizin hazırlanacak. Devam etmek istiyor musunuz?")
            alert.setIcon(R.drawable.logo)
            alert.setCancelable(false)
            alert.setPositiveButton("evet"){DialogInterface,i->
                if (alinanCorbaAdi =="Ezogelin Çorbası") {
                    Handler().postDelayed({

                        var corbaIsmi = "Ezogelin Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xNane =""
                        var xKitir =""
                        var xLimon =""
                        var xYag =""
                        var xBiber =""

                        if (nane.isChecked==true) {
                            xNane = "Nane"
                        }
                        if (kitir.isChecked==true) {
                            xKitir = "Kıtır"
                        }
                        if (limon.isChecked==true) {
                            xLimon = "Limon"
                        }
                        if (yag.isChecked==true) {
                            xYag = "Yağ"
                        }
                        if (biber.isChecked==true) {
                            xBiber = "Biber"
                        }

                        gecis.putExtra("xNane",xNane)
                        gecis.putExtra("xKitir",xKitir)
                        gecis.putExtra("xLimon",xLimon)
                        gecis.putExtra("xYag",xYag)
                        gecis.putExtra("xBiber",xBiber)

                        startActivity(gecis)
                        finish()
                    },0)
                }
                else if (alinanCorbaAdi == "Düğün Çorbası") {
                    Handler().postDelayed({

                        var corbaIsmi = "Düğün Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xNane = ""
                        var xKitir = ""
                        var xLimon = ""
                        var xYag = ""
                        var xBiber = ""

                        if (nane.isChecked == true) {
                            xNane = "Nane"
                        }
                        if (kitir.isChecked == true) {
                            xKitir = "Kıtır"
                        }
                        if (limon.isChecked == true) {
                            xLimon = "Limon"
                        }
                        if (yag.isChecked == true) {
                            xYag = "Yağ"
                        }
                        if (biber.isChecked == true) {
                            xBiber = "Biber"
                        }

                        gecis.putExtra("xNane", xNane)
                        gecis.putExtra("xKitir", xKitir)
                        gecis.putExtra("xLimon", xLimon)
                        gecis.putExtra("xYag", xYag)
                        gecis.putExtra("xBiber", xBiber)

                        startActivity(gecis)
                        finish()
                    },0)
                }
                else if (alinanCorbaAdi =="Mercimek Çorbası") {
                    Handler().postDelayed({

                        var corbaIsmi = "Mercimek Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xNane = ""
                        var xKitir = ""
                        var xLimon = ""
                        var xYag = ""
                        var xBiber = ""

                        if (nane.isChecked == true) {
                            xNane = "Nane"
                        }
                        if (kitir.isChecked == true) {
                            xKitir = "Kıtır"
                        }
                        if (limon.isChecked == true) {
                            xLimon = "Limon"
                        }
                        if (yag.isChecked == true) {
                            xYag = "Yağ"
                        }
                        if (biber.isChecked == true) {
                            xBiber = "Biber"
                        }

                        gecis.putExtra("xNane", xNane)
                        gecis.putExtra("xKitir", xKitir)
                        gecis.putExtra("xLimon", xLimon)
                        gecis.putExtra("xYag", xYag)
                        gecis.putExtra("xBiber", xBiber)

                        startActivity(gecis)
                        finish()
                    },0)

                }

                else if (alinanCorbaAdi =="Brokoli Çorbası") {
                    Handler().postDelayed({

                        var corbaIsmi = "Brokoli Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xKrema = ""

                        if (krema.isChecked == true) {
                            xKrema = "Krema"
                        }

                        gecis.putExtra("xKrema", xKrema)

                        startActivity(gecis)
                        finish()
                    },0)

                }
                else if (alinanCorbaAdi =="Kelle Paça Çorbası") {
                    Handler().postDelayed({

                        var corbaIsmi = "Kelle Paça Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xSarimsak =""
                        var xDil =""
                        var xBeyin =""
                        var xYag =""
                        var xSirke =""
                        var xLimon =""


                        if (sarimsak.isChecked==true) {
                            xSarimsak = "Sarımsak"
                        }
                        if (dil.isChecked==true) {
                            xDil = "Dil"
                        }
                        if (beyin.isChecked==true) {
                            xBeyin = "Beyin"
                        }
                        if (yag.isChecked==true) {
                            xYag = "Yağ"
                        }
                        if (sirke.isChecked==true) {
                            xSirke = "Sirke"
                        }
                        if (limon.isChecked==true) {
                            xLimon = "Limon"
                        }

                        gecis.putExtra("xSarimsak",xSarimsak)
                        gecis.putExtra("xDil",xDil)
                        gecis.putExtra("xBeyin",xBeyin)
                        gecis.putExtra("xYag",xYag)
                        gecis.putExtra("xSirke",xSirke)
                        gecis.putExtra("xLimon",xLimon)


                        startActivity(gecis)
                        finish()
                    },0)

                }
                else if (alinanCorbaAdi =="Yayla Çorbası") {
                    Handler().postDelayed({
                        var corbaIsmi = "Yayla Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xNane =""
                        var xKitir =""
                        var xYag =""
                        var xBiber =""

                        if (nane.isChecked==true) {
                            xNane = "Nane"
                        }
                        if (kitir.isChecked==true) {
                            xKitir = "Kıtır"
                        }

                        if (yag.isChecked==true) {
                            xYag = "Yağ"
                        }
                        if (biber.isChecked==true) {
                            xBiber = "Biber"
                        }

                        gecis.putExtra("xNane",xNane)
                        gecis.putExtra("xKitir",xKitir)
                        gecis.putExtra("xYag",xYag)
                        gecis.putExtra("xBiber",xBiber)

                        startActivity(gecis)
                        finish()

                    },0)

                }
                else if (alinanCorbaAdi =="Şehriye Çorbası") {
                    Handler().postDelayed({
                        var corbaIsmi = "Şehriye Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xNane =""
                        var xLimon =""
                        var xYag =""
                        var xBiber =""

                        if (nane.isChecked==true) {
                            xNane = "Nane"
                        }

                        if (limon.isChecked==true) {
                            xLimon = "Limon"
                        }
                        if (yag.isChecked==true) {
                            xYag = "Yağ"
                        }
                        if (biber.isChecked==true) {
                            xBiber = "Biber"
                        }

                        gecis.putExtra("xNane",xNane)
                        gecis.putExtra("xLimon",xLimon)
                        gecis.putExtra("xYag",xYag)
                        gecis.putExtra("xBiber",xBiber)

                        startActivity(gecis)
                        finish()

                    },0)

                }
                else if (alinanCorbaAdi =="Domates Çorbası") {
                    Handler().postDelayed({
                        var corbaIsmi = "Domates Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xNane =""
                        var xKitir =""
                        var xLimon =""
                        var xYag =""
                        var xBiber =""
                        var xTerbiye =""
                        var xKasar =""


                        if (nane.isChecked==true) {
                            xNane = "Nane"
                        }
                        if (kitir.isChecked==true) {
                            xKitir = "Kıtır"
                        }
                        if (limon.isChecked==true) {
                            xLimon = "Limon"
                        }
                        if (yag.isChecked==true) {
                            xYag = "Yağ"
                        }
                        if (biber.isChecked==true) {
                            xBiber = "Biber"
                        }
                        if (terbiye.isChecked==true) {
                            xTerbiye = "Terbiye"
                        }
                        if (kasar.isChecked==true) {
                            xKasar = "Kaşar"
                        }

                        gecis.putExtra("xNane",xNane)
                        gecis.putExtra("xKitir",xKitir)
                        gecis.putExtra("xLimon",xLimon)
                        gecis.putExtra("xYag",xYag)
                        gecis.putExtra("xBiber",xBiber)
                        gecis.putExtra("xTerbiye",xTerbiye)
                        gecis.putExtra("xKasar",xKasar)

                        startActivity(gecis)
                        finish()

                    },0)


                }
                else if (alinanCorbaAdi =="Tarhana Çorbası") {
                    Handler().postDelayed({
                        var corbaIsmi = "Tarhana Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xYag =""
                        var xBiber =""

                        if (yag.isChecked==true) {
                            xYag = "Yağ"
                        }
                        if (biber.isChecked==true) {
                            xBiber = "Biber"
                        }

                        gecis.putExtra("xYag",xYag)
                        gecis.putExtra("xBiber",xBiber)

                        startActivity(gecis)
                        finish()

                    },0)

                }
                else if (alinanCorbaAdi =="Mantar Çorbası") {
                    Handler().postDelayed({
                        var corbaIsmi = "Mantar Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xKrema =""

                        if (krema.isChecked==true) {
                            xKrema = "Krema"
                        }

                        gecis.putExtra("xKrema",xKrema)

                        startActivity(gecis)
                        finish()

                    },0)

                }
                else if (alinanCorbaAdi =="İşkembe Çorbası") {
                    Handler().postDelayed({
                        var corbaIsmi = "İşkembe Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xSarimsak =""
                        var xSirke =""
                        var xLimon =""
                        var xYag =""
                        var xBiber =""


                        if (sarimsak.isChecked==true) {
                            xSarimsak = "Sarımsak"
                        }
                        if (yag.isChecked==true) {
                            xYag = "Yağ"
                        }
                        if (sirke.isChecked==true) {
                            xSirke = "Sirke"
                        }
                        if (limon.isChecked==true) {
                            xLimon = "Limon"
                        }
                        if (biber.isChecked==true) {
                            xBiber = "Biber"
                        }

                        gecis.putExtra("xSarimsak",xSarimsak)
                        gecis.putExtra("xBiber",xBiber)
                        gecis.putExtra("xYag",xYag)
                        gecis.putExtra("xSirke",xSirke)
                        gecis.putExtra("xLimon",xLimon)


                        startActivity(gecis)
                        finish()

                    },0)

                }
                else if (alinanCorbaAdi =="Tavuk Çorbası") {
                    Handler().postDelayed({
                        var corbaIsmi = "Tavuk Çorbası"
                        gecis.putExtra("corbaIsmi", corbaIsmi)

                        var xLimon =""
                        var xYag =""
                        var xKrema =""

                        if (limon.isChecked==true) {
                            xLimon = "Limon"
                        }
                        if (yag.isChecked==true) {
                            xYag = "Yağ"
                        }
                        if (krema.isChecked==true) {
                            xKrema = "xKrema"
                        }

                        gecis.putExtra("xLimon",xLimon)
                        gecis.putExtra("xYag",xYag)
                        gecis.putExtra("xKrema",xKrema)

                        startActivity(gecis)
                        finish()

                    },0)
                }


                var istek = input.text.toString()
                gecis.putExtra("istek", istek)
                startActivity(gecis)
                finish()


            }
            alert.setNeutralButton("Tekrar Kontrol Etmek İstiyorum"){DialogInterface,i->

            }
            alert.create().show()

        }










    }
}