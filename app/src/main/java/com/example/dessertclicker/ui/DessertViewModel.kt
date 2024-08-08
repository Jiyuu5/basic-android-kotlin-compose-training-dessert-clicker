package com.example.dessertclicker.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class DessertViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(DessertUiState())
    var uiState: StateFlow<DessertUiState> = _uiState.asStateFlow()


}