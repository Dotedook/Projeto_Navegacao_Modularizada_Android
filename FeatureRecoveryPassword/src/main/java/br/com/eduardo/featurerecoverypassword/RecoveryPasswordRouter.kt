package br.com.eduardo.featurerecoverypassword

import androidx.appcompat.app.AppCompatActivity
import br.com.eduardo.navigation.NavigationRouter

object RecoveryPasswordRouter : NavigationRouter(RecoveryPasswordActivity::class.java) {

    internal fun dismiss(activity : AppCompatActivity) {
        activity.navigateUpTo(lastIntent)
    }
}