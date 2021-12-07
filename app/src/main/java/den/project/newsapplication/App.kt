package den.project.newsapplication

import android.app.Application
import den.project.newsapplication.di.filterNewsModule
import den.project.newsapplication.di.newsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
//            androidLogger()
            androidContext(this@App)
            modules(
                filterNewsModule,
                newsModule
            )

        }
    }
}