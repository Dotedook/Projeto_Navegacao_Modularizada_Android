package br.com.eduardo.featurepix

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity


object PixRouter {

    private lateinit var lastIntent : Intent

    fun initialize (context : Context) {
        start(context)
        val activity = context as Activity
        lastIntent = activity.intent
    }

    private fun start(context : Context) {
        val intent = Intent(context, PixActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(intent)
    }

    internal fun dismiss(activity : AppCompatActivity) {
        activity.navigateUpTo(lastIntent)
    }
}