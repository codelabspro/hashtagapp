package com.codesdk.mobile.hashtagapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by Das on 2022-01-21.
 */
@Database(
    entities = [Todo::class],
    version = 1
)

abstract class TodoDatabase: RoomDatabase() {
    abstract val dao: TodoDao

}
