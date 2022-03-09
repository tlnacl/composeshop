package com.tlnacl.composeshop.data.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("login") val login: String = "",
    @SerializedName("node_id") val nodeId: String = "",
    @SerializedName("avatar_url") val avatarUrl: String = "",
    @SerializedName("html_url") val htmlUrl: String = "",
    @SerializedName("name") val name: String = "",
    @SerializedName("location") val location: String? = "",
    @SerializedName("blog") val blogUrl: String = "",
    @SerializedName("public_repos") val publicRepos: Int = 0,
    @SerializedName("followers") val followers: Int = 0,
    @SerializedName("following") val following: Int = 0,
)

object UserPreview {

    val user: User
        get() = User(
            login = "wellingtoncabral",
            nodeId = "1234567890",
            avatarUrl = "https://avatars.githubusercontent.com/u/24476557?v=4",
            htmlUrl = "https://github.com/wellingtoncabral",
            name = "Wellington Cabral da Silva",
            location = "Brazil",
            publicRepos = 10,
            followers = 6,
            following = 0
        )
}