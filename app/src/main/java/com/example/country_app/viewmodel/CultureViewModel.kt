package com.example.country_app.viewmodel

import androidx.lifecycle.ViewModel
import com.example.country_app.data.CultureCategory
import com.example.country_app.data.CultureRepository


class CultureViewModel : ViewModel() {
    private val repository = CultureRepository()
    val categories: List<CultureCategory> = repository.getCategories()
    val horizontalCategories: List<CultureCategory> = repository.getCategories().take(3) // First 5 items
    val verticalCategories: List<CultureCategory> = repository.getCategories().drop(3)
}



