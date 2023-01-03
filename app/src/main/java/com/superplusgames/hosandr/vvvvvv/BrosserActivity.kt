package com.superplusgames.hosandr.vvvvvv

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.superplusgames.hosandr.R
import com.superplusgames.hosandr.databinding.ActivityBrosserBinding
import com.superplusgames.hosandr.koko.ConstansUsage.jujujuju
import com.superplusgames.hosandr.koko.ConstansUsage.af_idffggg
import com.superplusgames.hosandr.koko.ConstansUsage.bnnjkkkk
import com.superplusgames.hosandr.koko.ConstansUsage.vvcddfff
import com.superplusgames.hosandr.koko.ConstansUsage.dpOne
import com.superplusgames.hosandr.koko.ConstansUsage.kiokjjlikjhmkij
import com.superplusgames.hosandr.koko.ConstansUsage.linkAB
import com.superplusgames.hosandr.koko.ConstansUsage.mainIdffff
import com.superplusgames.hosandr.koko.ConstansUsage.bbbbnnn
import com.superplusgames.hosandr.koko.ConstansUsage.hhyhyhy
import com.superplusgames.hosandr.koko.ConstansUsage.loloolkkkkk
import com.superplusgames.hosandr.koko.ConstansUsage.sub5
import com.superplusgames.hosandr.koko.ConstansUsage.sub6
import com.superplusgames.hosandr.koko.ConstansUsage.hhyhyyh
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class BrosserActivity : AppCompatActivity() {

    var gtgtgtgt = ""
    var hfgjrtgjhkh: ValueCallback<Array<Uri>>? = null
    var bnnmmkl: String? = null
    private var exitexitexitexittggt = false

    lateinit var jgidhgjdkjujuju: WebView
    lateinit var hrfghrdssxccccc: ActivityBrosserBinding

    private val ofjpeorjfperjg = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hrfghrdssxccccc = ActivityBrosserBinding.inflate(layoutInflater)
        setContentView(hrfghrdssxccccc.root)

        jgidhgjdkjujuju = hrfghrdssxccccc.vvvviviiv
        gtkgtokgtkk()

        val cmngcmng = CookieManager.getInstance()
        cmngcmng.setAcceptCookie(true)
        cmngcmng.setAcceptThirdPartyCookies(jgidhgjdkjujuju, true)
        sssssssss()
        webviewClient()
        webchrome()

    }

    private fun gtkgtokgtkk() {
        Snackbar.make(
            hrfghrdssxccccc.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()
    }

    private fun sssssssss() {
        val juujuj = jgidhgjdkjujuju.settings
        juujuj.javaScriptEnabled = true

        juujuj.useWideViewPort = true

        juujuj.loadWithOverviewMode = true
        juujuj.allowFileAccess = true
        juujuj.domStorageEnabled = true
        juujuj.userAgentString = juujuj.userAgentString.replace("; wv", "")

        juujuj.javaScriptCanOpenWindowsAutomatically = true
        juujuj.setSupportMultipleWindows(false)

        juujuj.displayZoomControls = false
        juujuj.builtInZoomControls = true
        juujuj.setSupportZoom(true)

        juujuj.pluginState = WebSettings.PluginState.ON
        juujuj.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        juujuj.setAppCacheEnabled(true)

        juujuj.allowContentAccess = true
    }

    private fun webviewClient(){
        val vfvfvfvf: Activity = this
        jgidhgjdkjujuju.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (appInstalledOrNot(url)) {

                        val intenttttt = Intent(Intent.ACTION_VIEW)
                        intenttttt.data = Uri.parse(url)
                        startActivity(intenttttt)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)

                hyhyhyhyhy(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(vfvfvfvf, description, Toast.LENGTH_SHORT).show()
            }

        }

    }


    private fun webchrome(){
        jgidhgjdkjujuju.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                hfgjrtgjhkh?.onReceiveValue(null)
                hfgjrtgjhkh = filePathCallback
                var tttttt: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (tttttt!!.resolveActivity(packageManager) != null) {

                    var photoFileeee: File? = null
                    try {
                        photoFileeee = ggtgtgt()
                        tttttt.putExtra("PhotoPath", bnnmmkl)
                    } catch (ex: IOException) {

                    }


                    if (photoFileeee != null) {
                        bnnmmkl = "file:" + photoFileeee.absolutePath
                        tttttt.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(photoFileeee)
                        )
                    } else {
                        tttttt = null
                    }
                }
                val ccdcdcdcd = Intent(Intent.ACTION_GET_CONTENT)
                ccdcdcdcd.addCategory(Intent.CATEGORY_OPENABLE)
                ccdcdcdcd.type = "image/*"
                val intentArraygtgtgt: Array<Intent?> =
                    tttttt?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val hyhyhyhyhy = Intent(Intent.ACTION_CHOOSER)
                hyhyhyhyhy.putExtra(Intent.EXTRA_INTENT, ccdcdcdcd)
                hyhyhyhyhy.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                hyhyhyhyhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArraygtgtgt)
                startActivityForResult(
                    hyhyhyhyhy, ofjpeorjfperjg
                )
                return true
            }

            @Throws(IOException::class)
            private fun ggtgtgt(): File {
                var imageStorageDir = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!imageStorageDir.exists()) {
                    imageStorageDir.mkdirs()
                }


                imageStorageDir =
                    File(imageStorageDir.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return imageStorageDir
            }

        }

        jgidhgjdkjujuju.loadUrl(urururururururur())

    }


    private fun pushToOneSignalllll(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val kikloololo = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $kikloololo"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val bgbbggbbg =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $bgbbggbbg"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val hhyhyhyhy = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $hhyhyhyhy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    private fun urururururururur(): String {

        val spoon = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)


        val afId = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        var bgbgbg = ""
        if (bnnjkkkk != "null"){
            bgbgbg = "$linkAB$hhyhyyh$bnnjkkkk&$af_idffggg$afId&$jujujuju$mainIdffff&$loloolkkkkk$hhyhyhy&$sub5$kiokjjlikjhmkij&$sub6$bbbbnnn"
            pushToOneSignalllll(afId.toString())
        } else {
            bgbgbg = "$linkAB$hhyhyyh$dpOne&$af_idffggg$afId&$jujujuju$mainIdffff&$loloolkkkkk$hhyhyhy&$sub5$kiokjjlikjhmkij&$sub6$vvcddfff"
            pushToOneSignalllll(afId.toString())
        }

        Log.d("TESTAG", "Test Result $bgbgbg")
        return spoon.getString("SAVED_URL", bgbgbg).toString()
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != ofjpeorjfperjg || hfgjrtgjhkh == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                results = arrayOf(Uri.parse(bnnmmkl))
            } else {
                val hhyhyhyhy = data.dataString
                if (hhyhyhyhy != null) {
                    results = arrayOf(Uri.parse(hhyhyhyhy))
                }
            }
        }
        hfgjrtgjhkh?.onReceiveValue(results)
        hfgjrtgjhkh = null
    }



    override fun onBackPressed() {

        if (jgidhgjdkjujuju.canGoBack()) {
            if (exitexitexitexittggt) {
                jgidhgjdkjujuju.stopLoading()
                jgidhgjdkjujuju.loadUrl(gtgtgtgt)
            }
            this.exitexitexitexittggt = true
            jgidhgjdkjujuju.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                exitexitexitexittggt = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    fun hyhyhyhyhy(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {
            if (gtgtgtgt == "") {
                gtgtgtgt = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }

    private fun appInstalledOrNot(uri: String): Boolean {

        val hyhyhyhyhy = packageManager
        try {

            hyhyhyhyhy.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

}