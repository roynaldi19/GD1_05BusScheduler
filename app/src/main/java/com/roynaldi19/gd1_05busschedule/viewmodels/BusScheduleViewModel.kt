package com.roynaldi19.gd1_05busschedule.viewmodels

import androidx.lifecycle.ViewModel
import com.roynaldi19.gd1_05busschedule.database.Schedule
import com.roynaldi19.gd1_05busschedule.database.ScheduleDao
import kotlinx.coroutines.flow.Flow

class BusScheduleViewModel(private val scheduleDao: ScheduleDao): ViewModel() {

    fun fullSchedule(): Flow<List<Schedule>> = scheduleDao.getAll()

    fun scheduleForStopName(name: String): Flow<List<Schedule>> = scheduleDao.getByStopName(name)
}