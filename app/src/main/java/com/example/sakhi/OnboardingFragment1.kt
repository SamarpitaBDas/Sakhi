package com.example.sakhi

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.transition.Fade
import androidx.transition.TransitionManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.FragmentTransaction

class OnboardingFragment1 : Fragment(R.layout.fragment_onboarding1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nextButton = view.findViewById<Button>(R.id.btn_next)
        nextButton.setOnClickListener {

            Log.d("OnboardingFragment1", "Next Button Clicked")

            // Start fragment transaction
            val fragmentTransaction = parentFragmentManager.beginTransaction()

            // Optional: You can apply a fade transition if needed
            val fade = Fade()
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)

            // Replace current fragment with the next
            fragmentTransaction.replace(R.id.frame_layout, OnboardingFragment2())

            // Add transaction to back stack
            fragmentTransaction.addToBackStack(null)

            // Commit transaction
            fragmentTransaction.commit()
        }
    }
}
