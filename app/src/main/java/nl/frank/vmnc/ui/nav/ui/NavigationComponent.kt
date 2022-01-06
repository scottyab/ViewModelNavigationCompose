package nl.frank.vmnc.ui.nav.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.navArgument
import nl.frank.vmnc.ui.main.KEY_MAIN_PAGE_INDEX
import nl.frank.vmnc.ui.main.MainPageRoute

@Composable
fun NavigationComponent(navHostController: NavHostController, paddingValues: PaddingValues) {
    NavHost(
        navController = navHostController,
        startDestination = MainPageRoute.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        MainPageRoute.composable(
            this, navHostController,
            arguments = listOf(navArgument(KEY_MAIN_PAGE_INDEX) {
                defaultValue = 0
            }) // arguments are only added here to set a default for the app's start destination
        )
    }
}