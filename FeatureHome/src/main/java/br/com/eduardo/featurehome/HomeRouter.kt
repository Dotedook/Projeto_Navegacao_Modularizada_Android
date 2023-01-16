package br.com.eduardo.featurehome

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import br.com.eduardo.featurepix.PixActivity
import br.com.eduardo.navigation.NavigationRouter

object HomeRouter : NavigationRouter(HomeActivity::class.java) {

    internal fun dismiss(activity : AppCompatActivity) {
        activity.navigateUpTo(lastIntent)
    }

}