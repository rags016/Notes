package com.bestpractices.learning.notes.framework

import com.bestpractices.learning.core.usecase.AddNote
import com.bestpractices.learning.core.usecase.GetAllNotes
import com.bestpractices.learning.core.usecase.GetNote
import com.bestpractices.learning.core.usecase.RemoveNote

data class Usecases(
    val addNote: AddNote,
    val getNote: GetNote,
    val getAllNotes: GetAllNotes,
    val removeNote: RemoveNote
)