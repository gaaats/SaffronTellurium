package com.superplusgames.hosandr.koko

import com.superplusgames.hosandr.koko.gtgtgttg.HostInterfacefrrrrrr
import com.superplusgames.hosandr.koko.tgtgt.Repositorygtggttg
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DiModule {
    private val gtgtttg = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    private val hyhyhhyhy = OkHttpClient.Builder().addInterceptor(gtgtttg)
    @Provides
    @Singleton
    fun provideRetrofitApi() : ApiInterface{
       return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .client(hyhyhhyhy.build())
            .build()
           .create(ApiInterface::class.java)
    }


    @Provides
    @Singleton
    fun provideRetrofitHosting() : HostInterfacefrrrrrr {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://saffrontellurium.xyz/")
            .client(hyhyhhyhy.build())
            .build()
            .create(HostInterfacefrrrrrr::class.java)
    }


    @Singleton
    @Provides
    fun providesRepository(apiService: ApiInterface,hostInterface: HostInterfacefrrrrrr) = Repositorygtggttg(apiService,hostInterface)
    }





