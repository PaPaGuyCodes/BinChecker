package com.papaguycodes.binchecker.models

data class BinData(
    val scheme: String?,
    val type: String?,
    val brand: String?,
    val country: Country?,
    val bank: Bank?
)

data class Country(
    val name: String?,
    val emoji: String?
)

data class Bank(
    val name: String?,
    val url: String?,
    val phone: String?
)
