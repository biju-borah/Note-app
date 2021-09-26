package com.example.noteapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteapp.feature_note.domain.model.Notes

@Database(
    entities = [Notes::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase(){

    abstract val noteDao : NoteDao
    // Room will do the rest for us
}