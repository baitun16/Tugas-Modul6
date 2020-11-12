package com.example.kulinerhitssurabaya

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kulinerhitssurabaya.R
import kotlinx.android.synthetic.main.detail.*

class KulDetail  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            isiTampilan(intentThatStartedThisActivity)
        }
    }
    private fun isiTampilan(intentThatStartedThisActivity: Intent) {
            var imgK = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var nameK = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskK = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)

            image_detail.setImageResource(imgK)
            name_detail.text = nameK
            desc_detail.text = deskK

        }
    }
