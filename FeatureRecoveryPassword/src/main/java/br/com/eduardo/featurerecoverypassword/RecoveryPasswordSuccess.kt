package br.com.eduardo.featurerecoverypassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecoveryPasswordSuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery_password_success)

        findViewById<Button>(R.id.exitButton).setOnClickListener {
            RecoveryPasswordRouter.dismiss(this)
        }
    }

    override fun onBackPressed() {
        RecoveryPasswordRouter.dismiss(this)
        super.onBackPressed()
    }
}