package com.example.cw2_v1.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.cw2_v1.databinding.FragmentPromotionBinding

class PromotionFragment : Fragment() {

    private var _binding: FragmentPromotionBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val promotionViewModel =
            ViewModelProvider(this).get(AboutViewModel::class.java)

        _binding = FragmentPromotionBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPromotion
        promotionViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}