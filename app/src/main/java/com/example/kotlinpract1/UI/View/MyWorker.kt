package com.example.kotlinpract1.UI.View

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import kotlinx.coroutines.delay


class MyWorker(context: Context, workerParams: WorkerParameters) :
    CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result {
        // Здесь выполняется фоновая работа.
        // Например, можете добавить задержку в 5 секунд.
        Log.d("doWork", "Началось выполнение работы")
        delay(5000)
        return Result.success()
    }
}