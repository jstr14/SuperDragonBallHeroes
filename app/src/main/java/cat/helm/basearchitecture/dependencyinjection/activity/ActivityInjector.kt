package cat.helm.basearchitecture.dependencyinjection.activity

<<<<<<< HEAD
import cat.helm.basearchitecture.dependencyinjection.scope.PerActivity
import cat.helm.basearchitecture.ui.detail.DetailActivity
import cat.helm.basearchitecture.ui.detail.DetailActivityModule
import cat.helm.basearchitecture.ui.discover.DiscoverActivity
import cat.helm.basearchitecture.ui.discover.DiscoverActivityModule
=======
import cat.helm.basearchitecture.ui.main.MainActivity
import cat.helm.basearchitecture.ui.main.MainActivityModule
>>>>>>> scafolding
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
<<<<<<< HEAD
 * Created by Héctor on 06/10/2017.
 */
@Module
abstract class ActivityInjector {

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(DetailActivityModule::class))
    abstract fun contributeDetailActivityInjector(): DetailActivity

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(DiscoverActivityModule::class))
    abstract fun contributeDiscoverActivityInjector(): DiscoverActivity

=======
 * Created by Borja on 17/7/17.
 */

@Module
abstract class ActivityInjector {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun contributeMainActivityInjector(): MainActivity
>>>>>>> scafolding

}