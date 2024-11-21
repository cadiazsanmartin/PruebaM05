package com.desafiolatam.coroutines.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/** NO MODIFICAR */
@Entity(tableName = "task")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String? = null,
    var isCompleted: Boolean = false
)
