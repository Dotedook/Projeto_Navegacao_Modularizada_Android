package br.com.eduardo.featurepix

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import br.com.eduardo.navigation.NavigationRouter


object PixRouter : NavigationRouter(PixActivity::class.java) {

    internal fun dismiss(activity : AppCompatActivity) {
        activity.navigateUpTo(lastIntent)
    }
}