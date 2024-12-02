package com.example.pr21_boboev_e_pr22_102

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getUsers(): LiveData<List<User>>

    @Insert
    fun addUser(user: User)

    @Query("DELETE FROM users WHERE userId = :id")
    fun deleteUser(id:Int)
}