package br.com.eduardo.featurehome

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import br.com.eduardo.featurepix.PixActivity

object HomeRouter {

    private lateinit var lastIntent : Intent

    fun initialize (context : Context) {
        start(context)
        val activity = context as Activity
        lastIntent = activity.intent
    }

    private fun start(context : Context) {
        val intent = Intent(context, HomeActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(intent)
    }

    internal fun dismiss(activity : AppCompatActivity) {
        activity.navigateUpTo(lastIntent)
    }
}