package com.husanboy.flowersmarkeronline.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.husanboy.flowersmarkeronline.R
import com.husanboy.flowersmarkeronline.databinding.FragmentHomeBinding
import com.husanboy.flowersmarkeronline.viewBinding


class HomeFragment : Fragment(R.layout.fragment_home) {
    val binding by viewBinding { FragmentHomeBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        binding.apply {


        }
    }

}