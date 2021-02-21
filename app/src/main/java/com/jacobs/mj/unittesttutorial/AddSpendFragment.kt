package com.jacobs.mj.unittesttutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jacobs.mj.unittesttutorial.databinding.FragmentAddSpendBinding

/**
 * A simple [Fragment] subclass.
 * Use the [AddSpendFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddSpendFragment : Fragment(R.layout.fragment_add_spend) {
    private var _binding: FragmentAddSpendBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAddSpendBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}