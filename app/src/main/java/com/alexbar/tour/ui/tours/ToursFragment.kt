package com.alexbar.tour.ui.tours

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.coordinatorlayout.widget.ViewGroupUtils
import androidx.core.view.marginStart
import com.alexbar.tour.R
import com.alexbar.tour.databinding.FragmentToursBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import java.util.*
import kotlin.time.Duration.Companion.hours


class ToursFragment : Fragment() {

    private lateinit var binding: FragmentToursBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentToursBinding.inflate(inflater, container, false)
        return binding.root

    }

    @SuppressLint("InflateParams")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clalendar()
        seekBar()


    }

    private fun clalendar() {

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        binding.etDate.setOnClickListener {
            val dpd = DatePickerDialog(requireContext(),
                DatePickerDialog.OnDateSetListener { view, mYear, mMonth, mDay ->
                    binding.etDate.setText("" + mYear + "/" + mMonth + "/" + mDay)
                }, year, month, day
            )
            dpd.show()
        }
    }

    private fun seekBar() {
        binding.seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // here, you react to the value being set in seekBar
                when (seekBar.progress) {
                    0 -> {
                        binding.tvPrice.setText("3000").toString()
                        binding.price3000.setBackgroundColor(Color.GREEN)
                    }
                    1 -> {
                        binding.tvPrice.setText("5000").toString()
                        binding.price5000.setBackgroundColor(Color.GREEN)
                    }
                    2 -> {
                        binding.tvPrice.setText("7000").toString()
                        binding.price7000.setBackgroundColor(Color.GREEN)
                    }
                    3 -> {
                        binding.tvPrice.setText("10000").toString()
                        binding.price10000.setBackgroundColor(Color.GREEN)
                    }
                    4 -> {
                        binding.tvPrice.setText("20000").toString()
                        binding.price20000.setBackgroundColor(Color.GREEN)
                    }
                    else -> binding.tvPrice.setText("").toString()
                }
                if (seekBar.progress != 4) {
                    binding.price20000.setBackgroundColor(Color.YELLOW)
                }
                if (seekBar.progress != 3) {
                    binding.price10000.setBackgroundColor(Color.YELLOW)
                }
                if (seekBar.progress != 2) {
                    binding.price7000.setBackgroundColor(Color.YELLOW)
                }
                if (seekBar.progress != 1) {
                    binding.price5000.setBackgroundColor(Color.YELLOW)
                }
                if (seekBar.progress != 0) {
                    binding.price3000.setBackgroundColor(Color.YELLOW)
                }

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
    }


}