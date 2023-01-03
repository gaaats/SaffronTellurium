package com.superplusgames.hosandr

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.superplusgames.hosandr.databinding.FragmentEnnnnttttBinding
import com.superplusgames.hosandr.databinding.FragmentGaaaameBinding
import com.superplusgames.hosandr.khyohykhy.Tiiiimer


class GaaaameFragment : Fragment() {

    var one = 0
    var tvo = 0
    var three = 0
    var four = 0
    var five = 0
    var six = 0
    var seven = 0
    var eight = 0
    var nine = 0
    var ten = 0

    var ttti = "ggg"

    private var fragmentEnnnnttttBinding: FragmentGaaaameBinding? = null
    private val binding
        get() = fragmentEnnnnttttBinding ?: throw RuntimeException("FragmentGaaaameBinding = null")


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
        fragmentEnnnnttttBinding = FragmentGaaaameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            ttti = "jjj"

            if (ttti == "ok"){
                val tiiimer = Tiiiimer().also {
                    it.startTimer()
                }
            }

            binding.imgTr1.setOnClickListener {
                if (one == 10) {
                    it.visibility = View.INVISIBLE
                    it.isEnabled = false
                    makeCheck()
                }
                one += 1
            }
            binding.imgTr2.setOnClickListener {
                if (tvo == 10) {
                    it.visibility = View.INVISIBLE
                    it.isEnabled = false
                    makeCheck()
                }
                tvo += 1
            }
            binding.imgTr3.setOnClickListener {
                if (three == 10) {
                    it.visibility = View.INVISIBLE
                    it.isEnabled = false
                    makeCheck()
                }
                three += 1
            }
            binding.imgTr4.setOnClickListener {
                if (four == 10) {
                    it.visibility = View.INVISIBLE
                    it.isEnabled = false
                    makeCheck()
                }
                four += 1
            }
            binding.imgTr5.setOnClickListener {
                if (five == 10) {
                    it.visibility = View.INVISIBLE
                    it.isEnabled = false
                    makeCheck()
                }
                five += 1
            }
            binding.imgTr6.setOnClickListener {
                if (six == 10) {
                    it.visibility = View.INVISIBLE
                    it.isEnabled = false
                    makeCheck()
                }
                six += 1
            }
            binding.imgTr7.setOnClickListener {
                if (seven == 10) {
                    it.visibility = View.INVISIBLE
                    it.isEnabled = false
                    makeCheck()
                }
                seven += 1
            }
            binding.imgTr8.setOnClickListener {
                if (eight == 10) {
                    it.visibility = View.INVISIBLE
                    it.isEnabled = false
                    makeCheck()
                }
                eight += 1
            }
            binding.imgTr9.setOnClickListener {
                if (nine == 10) {
                    it.visibility = View.INVISIBLE
                    it.isEnabled = false
                    makeCheck()
                }
                nine += 1
            }
            binding.imgTr10.setOnClickListener {
                if (ten == 10) {
                    it.visibility = View.INVISIBLE
                    it.isEnabled = false
                    makeCheck()
                }
                ten += 1
            }

        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun makeCheck() {
        if (binding.imgTr1.visibility == View.INVISIBLE &&
            binding.imgTr2.visibility == View.INVISIBLE &&
            binding.imgTr3.visibility == View.INVISIBLE &&
            binding.imgTr4.visibility == View.INVISIBLE &&
            binding.imgTr5.visibility == View.INVISIBLE &&
            binding.imgTr6.visibility == View.INVISIBLE &&
            binding.imgTr7.visibility == View.INVISIBLE &&
            binding.imgTr8.visibility == View.INVISIBLE &&
            binding.imgTr9.visibility == View.INVISIBLE &&
            binding.imgTr10.visibility == View.INVISIBLE
        ) {
            findNavController().navigate(R.id.action_gaaaameFragment_to_restartttttrrfrFragment)
        }
    }

    override fun onDestroy() {
        fragmentEnnnnttttBinding = null
        super.onDestroy()
    }
}