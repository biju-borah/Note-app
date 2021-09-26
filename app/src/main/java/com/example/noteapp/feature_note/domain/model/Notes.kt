package com.example.noteapp.feature_note.domain.model

import android.icu.text.CaseMap
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteapp.ui.theme.Purple200
import com.example.noteapp.ui.theme.Purple500
import com.example.noteapp.ui.theme.Purple700
import com.example.noteapp.ui.theme.Teal200

//Structure for Room database
@Entity
data class Notes(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color:Int,
    @PrimaryKey val id:Int? = null

){
    //There is nothing called static in Kotlin. So, in Kotlin, we use a companion object.
    companion object{
        val noteColor = listOf(Purple200, Purple500, Purple700, Teal200)
    }

    /*if you want to write a function or any member of the class that can be called without having
     the instance of the class then you can write the same as a member of a
     companion object inside the class.*/
}