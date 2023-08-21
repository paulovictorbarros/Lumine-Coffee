package com.pvbcsoft.luminecoffee.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pvbcsoft.luminecoffee.Characters
import com.pvbcsoft.luminecoffee.databinding.ItemCharactersBinding

class CharactersAdapter(private val charactersList: List<Characters>) :
    RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val binding = ItemCharactersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharactersViewHolder(binding)
    }

    override fun getItemCount() = charactersList.size

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        val character = charactersList[position]
        holder.bind(character)
    }

    class CharactersViewHolder(private val binding: ItemCharactersBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(character: Characters) {
            binding.nameCharacters.text = character.name

            Glide.with(binding.root.context)
                .load(character.imageUrl)
                .into(binding.imageCharacters)

            Glide.with(binding.root.context)
                .load(character.imageBgUrl)
                .into(binding.imageBackground)

            Glide.with(binding.root.context)
                .load(character.imageRarityUrl)
                .into(binding.imageRarity)
        }
    }
}