package com.pvbcsoft.luminecoffee

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.pvbcsoft.luminecoffee.adapters.CharactersAdapter
import com.pvbcsoft.luminecoffee.databinding.FragmentCharactersBinding

class CharactersFragment : Fragment() {

    private lateinit var binding: FragmentCharactersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCharactersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val charactersList = DataSourceCharacters.characterDataSet()

        val recyclerView = binding.recyclerViewCharacters
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 3)

        val adapter = CharactersAdapter(charactersList)
        recyclerView.adapter = adapter
    }
}

