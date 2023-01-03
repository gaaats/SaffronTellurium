package com.superplusgames.hosandr

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import com.superplusgames.hosandr.koko.gtgtgttg.ConstanceAppClassggtgt.osNalfrrf
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Maaainnnner:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(osNalfrrf)
        ggtgtgtgtgtgt()
    }

    private fun ggtgtgtgtgtgt() {
        Hawk.init(this).build()
    }
}