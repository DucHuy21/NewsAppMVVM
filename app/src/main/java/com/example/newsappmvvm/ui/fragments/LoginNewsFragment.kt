package com.example.newsappmvvm.ui.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newsappmvvm.R
import com.example.newsappmvvm.adapter.NewsAdapter
import com.example.newsappmvvm.ui.NewsActivity
import com.example.newsappmvvm.viewmodel.NewsViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_login_news.*
import kotlinx.android.synthetic.main.fragment_menu_news.*
import kotlinx.coroutines.delay

class LoginNewsFragment : Fragment(R.layout.fragment_login_news) {

    companion object {
        const val EMAIL_LOGIN = "EMAIL"
        const val INFO_USER_LOGIN = "INFO_USER"
        const val PASSWORD_LOGIN = "PASSWORD"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login_button.setOnClickListener {
            val email = email_edittext_login.text.toString()
            val passWord = password_edittext_login.text.toString()
            navigationToBreakingNew(email, passWord)
        }
    }

    private fun navigationToBreakingNew(email: String, passWord: String) {
        if (email.isNullOrBlank() || passWord.isNullOrBlank()) {
            Toast.makeText(
                this@LoginNewsFragment.context,
                "Email Or Password Empty",
                Toast.LENGTH_SHORT
            )
        } else {
            if (email == "huydinh@gmail.com" && passWord == "huydinhduc123") {
                Snackbar.make(this.view ?: requireView(), "Login Success!!!", Snackbar.LENGTH_SHORT)
                    .show()
                Thread.sleep(100)
                findNavController().navigate(
                    LoginNewsFragmentDirections.actionLoginToBreakingnew(
                        email,
                        passWord
                    )
                )
            } else {
                Toast.makeText(
                    this@LoginNewsFragment.context,
                    "Email Or Password Incorrect",
                    Toast.LENGTH_SHORT
                )
            }
        }
    }

}
