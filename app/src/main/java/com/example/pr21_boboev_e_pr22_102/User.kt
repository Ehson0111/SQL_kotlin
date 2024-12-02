package com.example.pr21_boboev_e_pr22_102

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
class User {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "userId")
    var id: Int = 0
    @ColumnInfo(name = "userName")
    var name: String=""
    var age: Int = 0

    constructor() {}

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}