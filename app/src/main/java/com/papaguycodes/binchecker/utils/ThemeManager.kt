package com.papaguycodes.binchecker.utils

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatDelegate

object ThemeManager {

    private const val PREF_NAME = "theme_pref"
    private const val THEME_KEY = "theme_key"

    fun applyTheme(theme: String, context: Context) {
        val mode = when (theme) {
            "light" -> AppCompatDelegate.MODE_NIGHT_NO
            "dark" -> AppCompatDelegate.MODE_NIGHT_YES
            else -> AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
        }
        AppCompatDelegate.setDefaultNightMode(mode)
        saveThemePreference(context, theme)
    }

    private fun saveThemePreference(context: Context, theme: String) {
        val preferences: SharedPreferences =
            context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        val editor = preferences.edit()
        editor.putString(THEME_KEY, theme)
        editor.apply()
    }

    fun getSavedTheme(context: Context): String? {
        val preferences: SharedPreferences =
            context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        return preferences.getString(THEME_KEY, "system")
    }
}
