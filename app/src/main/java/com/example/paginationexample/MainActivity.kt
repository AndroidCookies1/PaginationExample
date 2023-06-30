package com.example.paginationexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.paginationexample.ui.theme.PaginationExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaginationExampleTheme {
                val vm: GamesVM = viewModel()
                val games = vm.games.value
                GamesScreen(games)
            }
        }
    }
}
