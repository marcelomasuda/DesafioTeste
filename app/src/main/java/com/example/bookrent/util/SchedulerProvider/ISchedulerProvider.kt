package com.example.bookrent.util.SchedulerProvider

import io.reactivex.Scheduler

interface ISchedulerProvider {

    fun computation(): Scheduler
    fun io(): Scheduler
    fun ui(): Scheduler

}