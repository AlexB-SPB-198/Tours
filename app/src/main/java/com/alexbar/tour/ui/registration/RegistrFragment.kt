package com.alexbar.tour.ui.registration



import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import com.alexbar.tour.databinding.FragmentRegistrBinding
import java.util.Calendar


class RegistrFragment : Fragment() {
    private lateinit var binding: FragmentRegistrBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegistrBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        binding.etData.setOnClickListener {
            val dpd = DatePickerDialog(requireContext(),DatePickerDialog.OnDateSetListener {view,mYear,mMonth,mDay ->
                binding.etData.setText(""+mYear+"/"+mMonth+"/"+mDay)
            },year,month,day)
            dpd.show()
        }
    }


}






