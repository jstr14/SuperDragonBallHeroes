package cat.helm.basearchitecture

import android.app.Activity
import android.app.Application
<<<<<<< HEAD

=======
>>>>>>> scafolding
import cat.helm.basearchitecture.dependencyinjection.application.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

<<<<<<< HEAD
=======

>>>>>>> scafolding
/**
 * Created by Borja on 21/12/16.
 */
class BaseApplication : Application(), HasActivityInjector {
    @Inject lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

<<<<<<< HEAD
=======

>>>>>>> scafolding
    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingActivityInjector
    }

<<<<<<< HEAD
=======

>>>>>>> scafolding
    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }
}