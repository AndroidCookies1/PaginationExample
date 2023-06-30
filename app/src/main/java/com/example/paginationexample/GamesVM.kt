package com.example.paginationexample

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class GamesVM(
    private val apiService: GamesApiService = DependencyContainer.apiService
): ViewModel() {
    val games = mutableStateOf(emptyList<Game>())

    init {
        viewModelScope.launch {
            games.value = apiService.getData().games
        }
    }
}