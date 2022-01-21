package com.codesdk.mobile.hashtagapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Das on 2022-01-21.
 */
@Entity
class Todo {
    @PrimaryKey val id: Int? = null
    val title: String,
    val description: String?,
    val isDone: Boolean,
}