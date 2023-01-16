package br.com.eduardo.featurepix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PixSuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pix_success)
        findViewById<Button>(R.id.exitButton).setOnClickListener {
            PixRouter.dismiss(this)
        }
    }

    override fun onBackPressed() {
        PixRouter.dismiss(this)
        super.onBackPressed()
    }
}