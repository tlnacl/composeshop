package com.tlnacl.composeshop.ui.feature.repos.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tlnacl.composeshop.data.model.Repo
import com.tlnacl.composeshop.data.model.RepoPreview

@Composable
fun ReposList(
    header: @Composable () -> Unit,
    reposList: List<Repo>,
) {
    LazyColumn {
        item { header() }
        items(reposList) { repo ->
            ReposListItem(repo = repo)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReposListPreview() {
    val repos = List(3) { RepoPreview.repo }
    ReposList(header = {}, reposList = repos)
}