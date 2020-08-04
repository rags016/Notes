package com.bestpractices.learning.core.repository

import com.bestpractices.learning.core.data.Note

interface NoteDataSource {
    suspend fun add(note: Note)
    suspend fun get(id: Long): Note?
    suspend fun getAll(): List<Note>
    suspend fun remmove(note: Note)

}