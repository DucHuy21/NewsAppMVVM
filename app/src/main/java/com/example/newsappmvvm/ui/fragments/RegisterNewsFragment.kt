package com.example.newsappmvvm.ui.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newsappmvvm.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_register_news.*

class RegisterNewsFragment : Fragment(R.layout.fragment_register_news) {

    companion object {
        const val EMAIL_REGISTER = "EMAIL_REGISTER"
        const val INFO_USER_REGISTER = "INFO_USER_REGISTER"
        const val PASSWORD_REGISTER = "PASSWORD_REGISTER"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        register_button.setOnClickListener {
            val user = user_edittext_register.text.toString()
            val emailRegister = email_edittext_register.text.toString()
            val passWordRegister = password_edittext_register.text.toString()
            navigationToBreakingNew(user, emailRegister, passWordRegister)
        }
    }

    private fun navigationToBreakingNew(
        user: String,
        emailRegister: String,
        passWordRegister: String
    ) {
        if (user.isNullOrBlank() || emailRegister.isNullOrBlank() || passWordRegister.isNullOrBlank()) {
            Toast.makeText(
                this@RegisterNewsFragment.context,
                "User or Password is empty",
                Toast.LENGTH_SHORT
            )
        } else {
            if (user == "DinhDucHuy" && emailRegister == "huydinh@gmail.com" && passWordRegister == "huydinhduc123") {
                Snackbar.make(
                    this.view ?: requireView(),
                    "Register Submit!!!",
                    Snackbar.LENGTH_SHORT
                ).show()
                Thread.sleep(100)
                findNavController().navigate(
                    RegisterNewsFragmentDirections.actionRegisterToBreakingnew(
                        user,
                        emailRegister,
                        passWordRegister
                    )
                )
            } else {
                Toast.makeText(
                    this@RegisterNewsFragment.context,
                    "Email Or Password Incorrect",
                    Toast.LENGTH_SHORT
                )
            }
        }
    }
}