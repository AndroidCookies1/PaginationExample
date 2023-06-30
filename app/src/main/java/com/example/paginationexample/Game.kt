package com.example.paginationexample

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("data") var games: ArrayList<Game> = arrayListOf(),
)

data class Game(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("date") var date: String? = null,
    @SerializedName("home_team") var homeTeam: Team? = Team(),
    @SerializedName("home_team_score") var homeTeamScore: Int? = null,
    @SerializedName("time") var time: String? = null,
    @SerializedName("visitor_team") var visitorTeam: Team? = Team(),
    @SerializedName("visitor_team_score") var visitorTeamScore: Int? = null
)


data class Team(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("abbreviation") var abbreviation: String? = null,
    @SerializedName("city") var city: String? = null,
    @SerializedName("name") var name: String? = null
)