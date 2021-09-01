package com.example.notes

import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note:Note)

    @Delete
    suspend fun delete(note:Note)

    @Query("Select * from Notes_table order by id ASC")
    fun getAllNotes(): List<Note>

}