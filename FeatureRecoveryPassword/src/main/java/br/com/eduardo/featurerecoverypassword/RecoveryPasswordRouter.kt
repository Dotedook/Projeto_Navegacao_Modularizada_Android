package br.com.eduardo.featurerecoverypassword

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.io.Serializable
import kotlin.reflect.KFunction0

object RecoveryPasswordRouter {

    private lateinit var lastIntent : Intent

    fun initialize (context : Context) {
        start(context)
        val activity = context as Activity
        lastIntent = activity.intent
    }

    private fun start(context : Context) {
        val intent = Intent(context, RecoveryPasswordActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(intent)
    }

    internal fun dismiss(activity : AppCompatActivity) {
        activity.navigateUpTo(lastIntent)
    }
}