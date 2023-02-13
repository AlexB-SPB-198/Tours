package com.alexbar.tour.ui.onboarding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.alexbar.tour.databinding.ItemBoardingBinding

class OnBoardAdapter(private val onClick: () -> Unit) :
    RecyclerView.Adapter<OnBoardAdapter.ViewHolder>() {
    private val arrayListBoarding = arrayListOf<OnBoardModel>()
    init {
        arrayListBoarding.add(
            OnBoardModel(com.airbnb.lottie.R.id.image,"qwer","qwert")
        )
        OnBoardModel(androidx.appcompat.R.id.image,"asdf","qwer")
    }

    inner class ViewHolder(private val binding: ItemBoardingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(onBoard: OnBoardModel) {
            binding.btnStart.setOnClickListener { onClick() }
            binding.btnStart.isVisible = adapterPosition == arrayListBoarding.size - 1
            binding.tvTitle.text = onBoard.title
            binding.tvDescription.text = onBoard.description
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemBoardingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(arrayListBoarding[position])
    }

    override fun getItemCount(): Int = arrayListBoarding.size


}