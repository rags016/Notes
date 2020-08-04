package com.bestpractices.learning.notes.framework

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.bestpractices.learning.core.data.Note
import com.bestpractices.learning.core.repository.NoteRepository
import com.bestpractices.learning.core.usecase.AddNote
import com.bestpractices.learning.core.usecase.GetAllNotes
import com.bestpractices.learning.core.usecase.GetNote
import com.bestpractices.learning.core.usecase.RemoveNote
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListViewModel(application: Application) : AndroidViewModel(application) {
    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    val repository = NoteRepository(RoomNoteDataSource(application))

    val usecases = Usecases(
        AddNote(repository),
        GetNote(repository),
        GetAllNotes(repository),
        RemoveNote(repository)
    )

    val notes = MutableLiveData<List<Note>>()

    fun getNotes() {
        coroutineScope.launch {
            val noteList = usecases.getAllNotes()
            notes.postValue(noteList)
        }
    }
}