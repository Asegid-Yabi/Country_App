package com.example.country_app.data

data class CultureCategory(
    val id: Int,
    val title: String,
    val description: String,
    val introImageRes: Int? = null,
    val contentSections: List<ContentSection> = emptyList()
)

data class ContentSection(
    val title: String? = null,
    val content: String,
    val imageRes: Int? = null
)

