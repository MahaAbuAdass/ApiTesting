package com.example.newsroomtesting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.newsroomtesting.presentation.news_screen.NewsScreen
import com.example.newsroomtesting.presentation.theme.NewsroomTestingTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsroomTestingTheme {
            NewsScreen()
            }
        }
    }
}

