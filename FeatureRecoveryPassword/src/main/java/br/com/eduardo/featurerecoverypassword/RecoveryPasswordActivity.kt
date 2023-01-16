package br.com.eduardo.featurerecoverypassword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecoveryPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery_password)


        findViewById<Button>(R.id.loginButton).setOnClickListener {
            val intent = Intent(this, RecoveryPasswordSuccess::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        findViewById<Button>(R.id.backButton).setOnClickListener {
            RecoveryPasswordRouter.dismiss(this)
        }
    }

    override fun onBackPressed() {
        RecoveryPasswordRouter.dismiss(this)
        super.onBackPressed()
    }


}