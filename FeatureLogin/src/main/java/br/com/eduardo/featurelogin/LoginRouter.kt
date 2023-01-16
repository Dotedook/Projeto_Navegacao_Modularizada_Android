package br.com.eduardo.featurelogin

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.eduardo.featurehome.HomeActivity
import br.com.eduardo.featurehome.HomeRouter

object LoginRouter {

    fun initialize (context : Context) {
        start(context)
    }

    private fun start(context : Context) {
        val intent = Intent(context, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(intent)
    }

}