package com.example.kulinerhitssurabaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.setHasFixedSize(true)
        rv_list.adapter = KulAdapter(data, { onItem: KulData -> onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: KulData) {
        val showDetailActivityIntent = Intent(this, KulDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgKu)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameKu)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descKu)

        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<KulData> {
        val rvList = ArrayList<KulData>()
        rvList.add(
            KulData(
                R.drawable.bakso,
                "Bakso Kwetiau - Jl.Dharmawangsa No.142",
                "Apa rasanya bakso yang disajikan kwetiau?\n" +
                        "Di Surabaya traveler bisa mencicipi bakso dengan isian bakso, pangsit goreng, tahu, dan kwetiau.\n"+
                        "Harganya mulai Rp 10.000 hingga Rp 20.000"
            )
        )
        rvList.add(
            KulData(
                R.drawable.odeng,
                "Mix Odeng Tokkochi - Royal Plaza",
                "Odeng merupakan kudapan khas\n" +
                        "Korea Selatan yang berupa ikan\n" +
                        "rebus. Harganya cuma Rp 18.000"
            )
        )
        rvList.add(
            KulData(
                R.drawable.pentol,
                "Pentol Jumbo - Jl.Nginden Semolo",
                "Jika pentol biasanya berukuran kecil di Surabaya ada pentol dengan ukuran jumbo.\n" +
                        "Uniknya terdapat beragam jenis pentol jumbo, pentol cabe, pentol jamur, pentol puyuh, dan pentol urat.\n"+
                        "Harganya mulai Rp 5.00 hingga Rp 2.000"
            )
        )
        rvList.add(
            KulData(
                R.drawable.waffle,
                "Waffle Pocoyo - Transmart Rungkut",
                "Waffle satu ini menjadi jajanan yang sering ditemukan di Surabaya.\n"+
                        "Pocoyo menawarkan rasa waffle yang beraneka rasa dengan isian yang variatif.\n"+
                        "Jajanan ini cocok bagi yang suka camilan mengenyangkan.\n"+
                        "Ada selai coklat, krim keju, nuttela,dsb.\n"+
                        "Seporsi waffle dihargai mulai dari Rp 21.000"
            )
        )
        rvList.add(
            KulData(
                R.drawable.sate,
                "Sate Cumi Bakar - Lapangan Kodam",
                "Cumi-cumi yang digoreng tepung dan dimasak dengan saus asam manis memang sudah biasa.\n"+
                        "Bagaimana dengan cumi-cumi yang dibakar layaknya sate?\n"+
                        "Dengan Rp 15.000 traveler bisa mencicipi kuliner ini"
            )
        )
        rvList.add(
            KulData(
                R.drawable.takoyaki,
                "Takoyaki Pak Totok - Lapangan Kodam",
                "Takoyaki merupakan street food khas Jepang berbentuk bola-bola yang diisi dengan potongan gurita.\n"+
                        "Di Surabaya Traveler bisa mencicipi takoyaki dengan isian rice crispy yang gurih.\n"+
                        "Takoyaki unik ini dibanderol dengan harga Rp 10.000 (isi 4) dan Rp 12.000 (isi 5)"
            )
        )
        return rvList
    }
}
