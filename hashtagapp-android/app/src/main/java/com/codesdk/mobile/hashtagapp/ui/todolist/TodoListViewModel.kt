package com.codesdk.mobile.hashtagapp.ui.todolist

import androidx.lifecycle.ViewModel
import com.codesdk.mobile.hashtagapp.data.TodoRepository
import com.codesdk.mobile.hashtagapp.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

/**
 * Created by Das on 2022-01-26.
 */
@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val repository: TodoRepository
): ViewModel() {
    val todos = repository.getTodos()
    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    fun onEvent(event: TodoListEvent) {
        when (event) {
            is TodoListEvent.OnTodoClick -> {

            }

            is TodoListEvent.OnAddTodoClick -> {

            }

            is TodoListEvent.OnUndoDeleteClick -> {

            }

            is TodoListEvent.OnDeleteTodoClick -> {

            }

            is TodoListEvent.OnDoneChange -> {

            }
        }
    }

}