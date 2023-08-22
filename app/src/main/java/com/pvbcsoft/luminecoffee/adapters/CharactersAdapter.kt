package com.pvbcsoft.luminecoffee.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pvbcsoft.luminecoffee.model.Characters
import com.pvbcsoft.luminecoffee.databinding.ItemCharactersBinding
import java.util.*

class CharactersAdapter(private val charactersList: List<Characters>) :
    RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>(), Filterable {

    private var filteredCharactersList = charactersList.toMutableList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val binding =
            ItemCharactersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharactersViewHolder(binding)
    }

    override fun getItemCount() = filteredCharactersList.size

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        val character = filteredCharactersList[position]
        holder.bind(character)
    }

    class CharactersViewHolder(private val binding: ItemCharactersBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(character: Characters) {
            binding.nameCharacters.text = character.name

            Glide.with(binding.root.context).load(character.imageUrl)
                .into(binding.imageCharacters)

            Glide.with(binding.root.context).load(character.imageBgUrl)
                .into(binding.imageBackground)

            Glide.with(binding.root.context).load(character.imageRarityUrl)
                .into(binding.imageRarity)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun filter(filterText: String?) {
        filteredCharactersList.clear()

        if (filterText.isNullOrBlank()) {
            filteredCharactersList.addAll(charactersList)
        } else {
            val searchText = filterText.lowercase(Locale.getDefault())
            charactersList.forEach { character ->
                if (character.name.lowercase(Locale.getDefault()).contains(searchText)) {
                    filteredCharactersList.add(character)
                }
            }
        }

        notifyDataSetChanged()
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val filteredList = if (constraint.isNullOrBlank()) {
                    charactersList
                } else {
                    val searchText = constraint.toString().lowercase(Locale.getDefault())
                    charactersList.filter { character ->
                        character.name.lowercase(Locale.getDefault()).contains(searchText)
                    }
                }
                val results = FilterResults()
                results.values = filteredList
                return results
            }

            @SuppressLint("NotifyDataSetChanged")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                filteredCharactersList.clear()
                filteredCharactersList.addAll(results?.values as List<Characters>)
                notifyDataSetChanged()
            }
        }
    }
}