package com.example.sakhi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class FirstMenuFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("FirstMenuFragment", "Opened")

        super.onViewCreated(view, savedInstanceState)

        // Find the next button and handle its click event
        val nextButton = view.findViewById<Button>(R.id.btn_login)
        nextButton.setOnClickListener {
            // Start fragment transaction to navigate to the next fragment (OnboardingFragment3)
            val fragmentTransaction = parentFragmentManager.beginTransaction()

            // Optional: Apply a fade transition or any other transition if desired
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)

            // Replace the current fragment with OnboardingFragment3
            fragmentTransaction.replace(R.id.frame_layout, LoginFragment())

            // Add transaction to back stack (so the user can navigate back)
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }

        // Find the skip button and handle its click event
        val skipButton = view.findViewById<Button>(R.id.btn_register)
        skipButton.setOnClickListener {
            // Start fragment transaction to skip onboarding and navigate to HomeFragment
            val fragmentTransaction = parentFragmentManager.beginTransaction()

            // Optional: Apply a fade transition or any other transition if desired
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)

            // Replace the current fragment with HomeFragment
            fragmentTransaction.replace(R.id.frame_layout, RegisterFragment())

            // Add transaction to back stack (optional)
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }
    }
}