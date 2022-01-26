package com.codesdk.mobile.hashtagapp.util

/**
 * Created by Das on 2022-01-26.
 */
sealed class UiEvent {
    object PopBackStack: UiEvent()
    data class Navigate(val route: String): UiEvent()
    data class ShowSnackbar(
        val message: String,
        val action: String? = null
    ): UiEvent()
}