package com.roynaldi19.gd1_05busschedule

import android.app.Application
import com.roynaldi19.gd1_05busschedule.database.AppDatabase

class BusScheduleApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}
