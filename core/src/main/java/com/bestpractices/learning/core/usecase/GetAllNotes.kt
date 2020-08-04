package com.bestpractices.learning.core.usecase

import com.bestpractices.learning.core.repository.NoteRepository

class GetAllNotes(private val noteRepository: NoteRepository) {
    suspend operator fun invoke() = noteRepository.getAllNotes()
}