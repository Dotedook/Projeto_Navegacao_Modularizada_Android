package br.com.eduardo.featurelogin

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import br.com.eduardo.featurehome.HomeRouter
import br.com.eduardo.featurerecoverypassword.RecoveryPasswordRouter


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.loginButton).setOnClickListener {
            HomeRouter.initialize(this)
        }

        findViewById<Button>(R.id.buttonRecovery).setOnClickListener {
            RecoveryPasswordRouter.initialize(this)
        }
    }

}
