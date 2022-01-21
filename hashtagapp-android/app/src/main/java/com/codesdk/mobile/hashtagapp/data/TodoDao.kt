package com.codesdk.mobile.hashtagapp.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

/**
 * Created by Das on 2022-01-21.
 */
@Dao
interface TodoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: Todo)

    @Delete
    suspend fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM todo WHERE id = :id")
    suspend fun getTodoById(id: Int): Todo?

    @Query("SELECT * FROM todo")
    fun getTodos(): Flow<List<Todo>>
}