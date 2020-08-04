package com.bestpractices.learning.core.usecase

import com.bestpractices.learning.core.data.Note
import com.bestpractices.learning.core.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}