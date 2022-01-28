package com.codesdk.mobile.hashtagapp.ui.add_edit_todo

/**
 * Created by Das on 2022-01-27.
 */
sealed class AddEditTodoEvent {
    data class OnTitleChange(val title: String): AddEditTodoEvent()
    data class OnDescriptionChange(val description: String):  AddEditTodoEvent()
    object OnSaveTodoClick: AddEditTodoEvent()
}
