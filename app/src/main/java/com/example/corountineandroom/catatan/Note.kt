package com.example.corountineandroom.catatan

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
// tempat menampung variabel data
data class Note (
    var title: String,
            var description: String,
                    var priority: Int,
                            var telephone: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}