package com.example.busschedule.database.schedule

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Mewakili satu tabel dalam database. Setiap baris adalah turunan terpisah dari kelas Jadwal.
 * Setiap properti sesuai dengan kolom. Selain itu, ID diperlukan sebagai pengidentifikasi unik untuk
 * setiap baris dalam database.
 */
@Entity
data class Schedule(
    @PrimaryKey val id: Int,
    @NonNull @ColumnInfo(name = "stop_name") val stopName: String,
    @NonNull @ColumnInfo(name = "arrival_time") val arrivalTime: Int
)
