package com.example.mylivedata

import android.os.SystemClock
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.Timer
import java.util.TimerTask

class MainViewModel : ViewModel() {

    companion object {
        private const val ONE_SECOND = 100
    }

    private val mInitialTime = SystemClock.elapsedRealtime()

    //Objek LiveData yang nanti akan di Subscribe oleh MainActivity
    private val mElapsedTime = MutableLiveData<Long?>()

    //Menjalankan timer di konstruktor
    init {
        val timer = Timer()
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                val newValue = (SystemClock.elapsedRealtime() - mInitialTime) / 1000
                //Objek LiveData yang nanti akan di Subscribe oleh MainActivity
                mElapsedTime.postValue(newValue)
            }
        }, ONE_SECOND.toLong(), ONE_SECOND.toLong())
    }

    fun getElapsedTime(): LiveData<Long?>{
        return mElapsedTime
    }
}