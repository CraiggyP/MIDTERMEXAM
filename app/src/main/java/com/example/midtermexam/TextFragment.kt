package com.example.midtermexam

import android.content.Context
import android.os.Bundle
import android.text.LoginFilter.UsernameFilterGMail
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.midtermexam.databinding.FragmentTextBinding


class TextFragment : Fragment() {
    private lateinit var binding:FragmentTextBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTextBinding.inflate(inflater, container, false)
        val view = binding.root
        val data = arguments
        val sharedPref = requireActivity().getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
        val USERNAME = sharedPref?.getString(USERNAME, null);
        binding.txtText.text = "Hi " +USERNAME
        return view

    }
}
