package com.codesdk.mobile.hashtagapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Das on 2022-01-21.
 */
@Entity
data class Todo (
    val title: String,
    val description: String?,
    val isDone: Boolean,
    @PrimaryKey val id: Int? = null
)