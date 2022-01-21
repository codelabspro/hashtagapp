package com.codesdk.mobile.hashtagapp.data

import kotlinx.coroutines.flow.Flow

/**
 * Created by Das on 2022-01-21.
 */
class TodoRepositoryImpl(
    private val dao: TodoDao
): TodoRepository {
    override suspend fun insertTodo(todo: Todo) {
        dao.insertTodo(todo)
    }

    override suspend fun deleteTodo(todo: Todo) {
        dao.deleteTodo(todo)
    }

    override suspend fun getTodoById(id: Int): Todo? {
        return dao.getTodoById(id)
    }

    override fun getTodos(): Flow<List<Todo>> {
        return dao.getTodos()
    }

}