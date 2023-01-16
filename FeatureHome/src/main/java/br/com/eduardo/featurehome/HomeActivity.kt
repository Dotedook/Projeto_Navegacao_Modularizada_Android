package br.com.eduardo.featurehome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.eduardo.featurepix.PixRouter

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.pixButton).setOnClickListener {
            PixRouter.initialize(this)
        }

        findViewById<Button>(R.id.exitButton).setOnClickListener {
            HomeRouter.dismiss(this)
        }
    }

    override fun onBackPressed() {
        HomeRouter.dismiss(this)
        super.onBackPressed()
    }
}