package br.com.coupledev.fundamentals

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.coupledev.fundamentals.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)
    }
}