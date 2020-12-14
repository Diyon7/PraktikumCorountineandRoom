package com.example.corountineandroom.catatan

import androidx.lifecycle.LiveData
import androidx.room.*

// tempat menampung query
@Dao
interface NoteDao {
    // masukkan data ke database
    @Insert
    fun insert(note: Note)
    // memperbaharui data didatabase
    @Update
    fun update(note: Note)
    // menghapus data ke database
    @Delete
    fun delete(note: Note)
    @Query("DELETE FROM note_table")
    // melihat data kedatabase
    fun deleteAllNotes()
    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    fun getAllNotes(): LiveData<List<Note>>
}