package com.superplusgames.hosandr

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superplusgames.hosandr.databinding.FragmentRestartttttrrfrBinding


class RestartttttrrfrFragment : Fragment() {

    private var fragmentRestartttttrrfrBinding: FragmentRestartttttrrfrBinding? = null
    private val binding
        get() = fragmentRestartttttrrfrBinding
            ?: throw RuntimeException("FragmentRestartttttrrfrBinding = null")


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
        fragmentRestartttttrrfrBinding =
            FragmentRestartttttrrfrBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.btnNormal.setOnClickListener {
                findNavController().navigate(R.id.action_restartttttrrfrFragment_to_gaaaameFragment)
            }
            binding.btnEasy.setOnClickListener {
                findNavController().navigate(R.id.action_restartttttrrfrFragment_to_gaaaameFragment)
            }
            binding.btnHard.setOnClickListener {
                findNavController().navigate(R.id.action_restartttttrrfrFragment_to_gaaaameFragment)
            }

        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        fragmentRestartttttrrfrBinding = null
        super.onDestroy()
    }
}