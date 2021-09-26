package com.example.noteapp.feature_note.data.data_source

import androidx.room.*
import com.example.noteapp.feature_note.domain.model.Notes
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    fun getNotes(): Flow<List<Notes>>

    @Query("SELECT * FROM notes WHERE id = :id")
    suspend fun getNoteById(id:Int) : Notes?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(notes:Notes)

    @Delete
    suspend fun deleteNote(notes:Notes)


}
//Dao -> Data access object, define functions to access/insert/delete data on room database