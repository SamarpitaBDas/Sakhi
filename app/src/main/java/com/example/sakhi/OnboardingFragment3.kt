package com.example.sakhi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class OnboardingFragment3 : Fragment(R.layout.fragment_onboarding3) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the next button and handle its click event
        val nextButton = view.findViewById<Button>(R.id.btn_next)
        nextButton.setOnClickListener {

            Log.d("OnboardingFragment3", "Next Button Clicked")

            // Start fragment transaction to navigate to the next fragment (OnboardingFragment4)
            val fragmentTransaction = parentFragmentManager.beginTransaction()

            // Optional: Apply a fade transition or any other transition if desired
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)

            // Replace the current fragment with OnboardingFragment4
            fragmentTransaction.replace(R.id.frame_layout, OnboardingFragment4())

            // Add transaction to back stack (so the user can navigate back)
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }

        // Find the skip button and handle its click event
        val skipButton = view.findViewById<Button>(R.id.btn_skip)
        skipButton.setOnClickListener {
            // Start fragment transaction to skip onboarding and navigate to HomeFragment
            val fragmentTransaction = parentFragmentManager.beginTransaction()

            // Optional: Apply a fade transition or any other transition if desired
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)

            // Replace the current fragment with HomeFragment
            fragmentTransaction.replace(R.id.frame_layout, FirstMenuFragment())

            // Add transaction to back stack (optional)
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }
    }
}
