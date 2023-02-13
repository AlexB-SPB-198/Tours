package com.alexbar.tour.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.PagerSnapHelper
import com.alexbar.tour.databinding.FragmentOnBoardBinding


class OnBoardFragment : Fragment() {

private lateinit var binding: FragmentOnBoardBinding
private lateinit var adapter: OnBoardAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvBoard.adapter = adapter
        val pagerSnapHelper = PagerSnapHelper()
        pagerSnapHelper.attachToRecyclerView(binding.rvBoard)

        binding.indicator.attachToRecyclerView(binding.rvBoard,pagerSnapHelper)
        adapter.registerAdapterDataObserver(binding.indicator.adapterDataObserver)
    }
}