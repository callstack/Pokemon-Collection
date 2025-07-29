package com.example.pokemoncollection.ui.home

import androidx.lifecycle.ViewModel

data class Pokemon(val name: String, val description: String)

class HomeViewModel : ViewModel() {

    val pokemonList: List<Pokemon> = listOf(
        Pokemon("Bulbasaur", "A Grass/Poison-type Pokémon."),
        Pokemon("Charmander", "A Fire-type Pokémon."),
        Pokemon("Squirtle", "A Water-type Pokémon."),
        Pokemon("Pikachu", "An Electric-type Pokémon."),
        Pokemon("Jigglypuff", "A Fairy-type Pokémon. Puts enemies to sleep with its song."),
        Pokemon("Meowth", "A Normal-type Pokémon. Loves shiny things."),
        Pokemon("Psyduck", "A Water-type Pokémon. Has constant headaches."),
        Pokemon("Snorlax", "A Normal-type Pokémon. Sleeps most of the day."),
        Pokemon("Eevee", "A Normal-type Pokémon with unstable genetic makeup."),
        Pokemon("Gengar", "A Ghost/Poison-type Pokémon that hides in shadows."),
        Pokemon("Machop", "A Fighting-type Pokémon with incredible strength."),
        Pokemon("Magikarp", "A Water-type Pokémon that’s weak but evolves powerfully."),
        Pokemon("Vulpix", "A Fire-type Pokémon with a beautiful tail."),
        Pokemon("Abra", "A Psychic-type Pokémon that teleports when threatened.")
    )
}