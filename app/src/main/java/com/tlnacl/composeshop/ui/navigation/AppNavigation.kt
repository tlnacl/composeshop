package com.tlnacl.composeshop.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.tlnacl.composeshop.ui.feature.repos.composables.ReposScreen
import com.tlnacl.composeshop.ui.feature.users.composables.UsersScreen
import com.tlnacl.composeshop.ui.navigation.Navigation.Args.USER_ID

object Navigation {

    object Args {
        const val USER_ID = "user_id"
    }

    object Routes {
        const val USERS = "users"
        const val REPOS = "$USERS/{$USER_ID}"
    }

}

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Navigation.Routes.USERS
    ) {
        composable(
            route = Navigation.Routes.USERS
        ) {
            UsersScreen { userId ->
                navController.navigate(
                    route = "${Navigation.Routes.USERS}/${userId}"
                )
            }
        }

        composable(
            route = Navigation.Routes.REPOS,
            arguments = listOf(navArgument(name = USER_ID) {
                type = NavType.StringType
            })
        ) { ReposScreen { navController.popBackStack() } }
    }
}
