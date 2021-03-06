package com.octo.mob.octomeuh.transversal.injection

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.octo.mob.octomeuh.transversal.AnalyticsManager
import com.octo.mob.octomeuh.transversal.AnswersAnalyticsManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val application: Application) {

    @Provides
    @Singleton
    fun providesAppManager() : AnalyticsManager = AnswersAnalyticsManager(application)

    @Provides
    @Singleton
    fun providesSharedPreferences() : SharedPreferences = PreferenceManager.getDefaultSharedPreferences(application)

}