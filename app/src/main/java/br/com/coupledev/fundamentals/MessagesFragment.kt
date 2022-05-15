package br.com.coupledev.fundamentals

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.coupledev.fundamentals.databinding.FragmentMessagesBinding

class MessagesFragment : Fragment(R.layout.fragment_messages) {

    private lateinit var binding: FragmentMessagesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMessagesBinding.bind(view)
    }
}