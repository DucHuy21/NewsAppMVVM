package com.example.newsappmvvm.ui.fragments

import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.newsappmvvm.R
import kotlinx.android.synthetic.main.fragment_menu_news.*

class MenuNewsFragment : Fragment(R.layout.fragment_menu_news) {
    val args: MenuNewsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        invalidUserLogin()
        invalidUserRegister()
        btnUserLogin.setOnClickListener {
            navigateLoginForm()
        }
        btnUserRegister.setOnClickListener {
            navigateRegisterForm()
        }
        item_one.setOnClickListener {
            navigateItemOneForm()
        }
        item_two.setOnClickListener {
            navigateItemTwoForm()
        }
        item_three.setOnClickListener {
            navigateItemThreeForm()
        }
        item_four.setOnClickListener {
            navigateItemFourForm()
        }
        item_five.setOnClickListener {
            navigateItemFiveForm()
        }
        item_six.setOnClickListener {
            navigateItemSixForm()
        }
        item_seven.setOnClickListener {
            navigateItemSevenForm()
        }
        item_eight.setOnClickListener {
            navigateItemEightForm()
        }
        sport_one.setOnClickListener {
            navigateSportOneForm()
        }
        sport_two.setOnClickListener {
            navigateSportTwoForm()
        }
        sport_three.setOnClickListener {
            navigateSportThreeForm()
        }
        sport_four.setOnClickListener {
            navigateSportFourForm()
        }
        tv_e_one.setOnClickListener {
            navigateEntertainmentOneForm()
        }
        tv_e_two.setOnClickListener {
            navigateEntertainmentTwoForm()
        }
        tv_e_three.setOnClickListener {
            navigateEntertainmentThreeForm()
        }
        tv_e_four.setOnClickListener {
            navigateEntertainmentFourForm()
        }
        tv_vtv.setOnClickListener {
            navigateEntertainmentVTVForm()
        }
        tv_news.setOnClickListener {
            navigateEntertainmentNewsForm()
        }
    }

    private fun navigateEntertainmentNewsForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToNews())
    }


    private fun navigateEntertainmentVTVForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToVtvItem())
    }

    /*life & society*/
    private fun navigateItemEightForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToItemEight())
    }

    private fun navigateItemSevenForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToItemSeven())
    }

    private fun navigateItemSixForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToItemSix())
    }

    private fun navigateItemFiveForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToItemFive())
    }

    private fun navigateItemFourForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToItemFour())
    }

    private fun navigateItemThreeForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToItemThree())
    }

    private fun navigateItemTwoForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToItemTwo())
    }

    private fun navigateItemOneForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToItemOne())
    }


    /*sport*/
    private fun navigateSportFourForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToSportFour())
    }

    private fun navigateSportThreeForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToSportThree())
    }

    private fun navigateSportTwoForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToSportTwo())
    }

    private fun navigateSportOneForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToSportOne())
    }


    /*entertainment*/
    private fun navigateEntertainmentFourForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToEntertainmentFour())
    }

    private fun navigateEntertainmentThreeForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToEntertainmentThree())

    }

    private fun navigateEntertainmentTwoForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToEntertainmentTwo())

    }

    private fun navigateEntertainmentOneForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToEntertainmentOne())

    }

    private fun invalidUserLogin() {
        val email = args.email
        btnUserLogin.text = email
    }

    private fun invalidUserRegister() {
        val emailRegister = args.emailRegister
        btnUserRegister.text = emailRegister
    }

    private fun navigateRegisterForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToRegister())
    }

    private fun navigateLoginForm() {
        findNavController().navigate(MenuNewsFragmentDirections.actionMenuToLogin())
    }

}