package com.example.busschedule.database.schedule

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/**
 * Menyediakan akses ke operasi baca/tulis pada tabel jadwal.
 * Digunakan oleh model tampilan untuk memformat hasil kueri untuk digunakan di UI.
 */
@Dao
interface ScheduleDao {

    @Query("SELECT * FROM schedule ORDER BY arrival_time ASC")
    fun getAll(): Flow<List<Schedule>>

    @Query("SELECT * FROM schedule WHERE stop_name = :stopName ORDER BY arrival_time ASC")
    fun getByStopName(stopName: String): Flow<List<Schedule>>

}
