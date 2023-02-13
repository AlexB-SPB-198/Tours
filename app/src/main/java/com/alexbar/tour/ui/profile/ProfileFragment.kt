package com.alexbar.tour.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alexbar.tour.R
import com.alexbar.tour.databinding.FragmentProfileBinding
import com.alexbar.tour.ui.registration.RegistrFragment


class ProfileFragment : Fragment() {

lateinit var binding:FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnReg.setOnClickListener {
            findNavController().navigate(R.id.nav_registr)

        }
    }


}