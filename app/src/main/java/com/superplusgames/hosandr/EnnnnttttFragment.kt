package com.superplusgames.hosandr

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superplusgames.hosandr.databinding.FragmentEnnnnttttBinding


class EnnnnttttFragment : Fragment() {

    private var fragmentEnnnnttttBinding: FragmentEnnnnttttBinding? = null
    private val binding
        get() = fragmentEnnnnttttBinding ?: throw RuntimeException("FragmentEnnnnttttBinding = null")


    private fun eeeeeeee() {
        Snackbar.make(
            binding.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentEnnnnttttBinding = FragmentEnnnnttttBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.lotieLoadMain.setOnClickListener {
                findNavController().navigate(R.id.action_ennnnttttFragment_to_gaaaameFragment)
            }



        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        fragmentEnnnnttttBinding = null
        super.onDestroy()
    }
}