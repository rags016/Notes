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

class NoteViewModel(application: Application): AndroidViewModel(application) {

    private val coroutineScope = CoroutineScope(Dispatchers.IO)

    val repository = NoteRepository(RoomNoteDataSource(application))

    val useCases = Usecases(
        AddNote(repository),
        GetNote(repository),
        GetAllNotes(repository),
        RemoveNote(repository)
    )

    val saved = MutableLiveData<Boolean>()

    fun saveNote(note: Note){
        coroutineScope.launch{
            useCases.addNote(note)
            saved.postValue(true)
        }
    }
}