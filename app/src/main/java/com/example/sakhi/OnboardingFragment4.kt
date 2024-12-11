package com.example.sakhi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
class OnboardingFragment4 : Fragment(R.layout.fragment_onboarding4) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the next button and set its click listener
        val nextButton = view.findViewById<Button>(R.id.btn_next)
        nextButton.setOnClickListener {
            Log.d("OnboardingFragment4", "Next Button Clicked")

            val fragmentTransaction = parentFragmentManager.beginTransaction()
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)

            // Replace the current fragment with FirstMenuFragment
            fragmentTransaction.replace(R.id.frame_layout, FirstMenuFragment())

            // Add transaction to the back stack
            fragmentTransaction.addToBackStack(null)

            // Commit the transaction
            fragmentTransaction.commit()
        }
    }
}
