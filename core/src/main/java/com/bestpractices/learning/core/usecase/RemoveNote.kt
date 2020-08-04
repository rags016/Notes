package com.bestpractices.learning.core.usecase

import com.bestpractices.learning.core.data.Note
import com.bestpractices.learning.core.repository.NoteRepository

class RemoveNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}