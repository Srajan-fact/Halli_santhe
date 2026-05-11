package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import com.example.myapplication.ui.theme.MyApplicationTheme

// CompositionLocal for language state to pass through the entire app
val LocalLanguage = compositionLocalOf<Language> { Language.ENGLISH }

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val language by LanguageManager.getLanguageFlow(this).collectAsState(initial = Language.ENGLISH)

            MyApplicationTheme {
                CompositionLocalProvider(LocalLanguage provides language) {
                    MarketplaceApp()
                }
            }
        }
    }
}
