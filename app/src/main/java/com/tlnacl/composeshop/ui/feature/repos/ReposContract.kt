package com.tlnacl.composeshop.ui.feature.repos

import com.tlnacl.composeshop.data.model.Repo
import com.tlnacl.composeshop.data.model.User
import com.tlnacl.composeshop.ui.ViewEvent
import com.tlnacl.composeshop.ui.ViewSideEffect
import com.tlnacl.composeshop.ui.ViewState

class ReposContract {

    sealed class Event : ViewEvent {
        object BackButtonClicked : Event()
    }

    data class State(
        val user: User?,
        val reposList: List<Repo>,
        val isUserLoading: Boolean,
        val isReposLoading: Boolean
    ) : ViewState

    sealed class Effect : ViewSideEffect {
        sealed class Navigation : Effect() {
            object Back : Navigation()
        }
    }

}
