package com.alexbar.tour.ui.onboarding

import java.io.Serializable

data class OnBoardModel(
    var image:Int,
    var title:String,
    var description:String
): Serializable
