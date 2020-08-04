package com.bestpractices.learning.notes.framework

import android.content.Context
import com.bestpractices.learning.core.data.Note
import com.bestpractices.learning.core.repository.NoteDataSource
import com.bestpractices.learning.notes.framework.db.DatabaseService
import com.bestpractices.learning.notes.framework.db.NoteEntity

class RoomNoteDataSource(context: Context) : NoteDataSource {

    val notedao = DatabaseService.getInstance(context).noteDao()
    override suspend fun add(note: Note) {
        TODO("Not yet implemented")
    }

    override suspend fun get(id: Long): Note? {
        TODO("Not yet implemented")
    }

    override suspend fun getAll(): List<Note> {
        TODO("Not yet implemented")
    }

    override suspend fun remmove(note: Note) {
        TODO("Not yet implemented")
    }

//    override suspend fun add(note: Note) = notedao.addNoteEntity(NoteEntity.fromNote(note))
//
//    override suspend fun get(id: Long): Note? = notedao.getEntity(id)?.toNote()
//
//    override suspend fun getAll(): List<Note> = notedao.getAllNotesEntities().map { it.toNote() }
//
//    override suspend fun remmove(note: Note) = notedao.deleteNoteEntity(NoteEntity.fromNote(note))
}