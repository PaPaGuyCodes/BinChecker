package com.papaguycodes.binchecker.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.papaguycodes.binchecker.models.BinData
import com.papaguycodes.binchecker.repository.BinRepository
import kotlinx.coroutines.launch

class BinViewModel(private val repository: BinRepository) : ViewModel() {

    val binInfo: BinData? = null

    fun fetchBinInfo(bin: String) {
        viewModelScope.launch {
            val info = repository.getBinInfo(bin)
            // TODO: Update UI with the fetched BIN info
        }
    }
}
