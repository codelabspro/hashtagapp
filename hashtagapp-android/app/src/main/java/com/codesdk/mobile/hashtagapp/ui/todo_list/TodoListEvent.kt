package com.codesdk.mobile.hashtagapp.ui.todo_list

import com.codesdk.mobile.hashtagapp.data.Todo

/**
 * Created by Das on 2022-01-26.
 */
sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todo: Todo): TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}