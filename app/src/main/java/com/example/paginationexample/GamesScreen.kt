package com.example.paginationexample

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment

@Composable
fun GamesScreen(games: List<Game>) {
    Column {
        Text(
            text = "Games:",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(8.dp)
        )

        LazyColumn(
            contentPadding = PaddingValues(
                vertical = 8.dp,
                horizontal = 8.dp
            )
        ) {
            itemsIndexed(games) { index, game ->
                MatchItem(index, game)
            }
        }
    }
}

@Composable
fun MatchItem(index: Int, game: Game) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp),
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Row(
                modifier = Modifier.padding(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = game.homeTeam?.name ?: "",
                    style = MaterialTheme.typography.headlineMedium
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "vs", style = MaterialTheme.typography.headlineSmall)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = game.visitorTeam?.name ?: "",
                    style = MaterialTheme.typography.headlineMedium
                )
            }
            Text(text = "Date: ${game.date?.substring(0,10)}")
            Text(
                text = "Index: $index",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .weight(0.2f)
                    .padding(8.dp)
            )
        }
    }

}