package es.codigonline.proyecto.tema_10.database.converts

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {


    @TypeConverter
    fun toDate(epoch: Long): Date {
        return Date(epoch)
    }
    @TypeConverter
    fun fromDate(date: Date): Long {
        return date.time
    }
}