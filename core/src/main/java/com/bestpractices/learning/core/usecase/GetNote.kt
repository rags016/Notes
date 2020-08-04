package com.bestpractices.learning.core.usecase

import com.bestpractices.learning.core.repository.NoteRepository

class GetNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(id: Long) = noteRepository.getNote(id)
}