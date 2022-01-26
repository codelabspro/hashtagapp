package com.codesdk.mobile.hashtagapp.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.codesdk.mobile.hashtagapp.data.TodoDatabase
import com.codesdk.mobile.hashtagapp.data.TodoRepository
import com.codesdk.mobile.hashtagapp.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Das on 2022-01-25.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase {
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideToDoRepository(db: TodoDatabase): TodoRepository {
        return TodoRepositoryImpl(db.dao)
    }

}