package com.tlnacl.composeshop.data

import com.tlnacl.composeshop.data.model.Repo
import com.tlnacl.composeshop.data.model.User
import javax.inject.Inject

interface GithubRepository {
    suspend fun getUsers(): List<User>
    suspend fun getUser(userLogin: String): User
    suspend fun getRepos(userLogin: String): List<Repo>
}

class GithubRepositoryImpl @Inject constructor(private val githubApi: GithubApi): GithubRepository {

    override suspend fun getUsers(): List<User> = githubApi.getUsers()

    override suspend fun getUser(userLogin: String): User = githubApi.getUser(userLogin)

    override suspend fun getRepos(userLogin: String): List<Repo> = githubApi.getRepos(userLogin)

}