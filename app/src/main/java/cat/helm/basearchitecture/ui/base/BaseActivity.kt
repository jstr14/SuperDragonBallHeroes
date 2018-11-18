package cat.helm.basearchitecture.ui.base

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
<<<<<<< HEAD
import android.view.View
import dagger.android.AndroidInjection
import org.jetbrains.anko.design.longSnackbar
=======
import android.widget.TextView
import dagger.android.AndroidInjection
>>>>>>> scafolding

/**
 * Created by Borja on 21/12/16.
 */

abstract class BaseActivity : AppCompatActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(onRequestLayout())
        onViewLoaded()
    }

    abstract fun onRequestLayout(): Int

<<<<<<< HEAD
    abstract fun onViewLoaded()

    override fun showException(exceptionMessage: String) {

        longSnackbar(findViewById<View>(android.R.id.content), exceptionMessage)

    }


}
=======

    abstract fun onViewLoaded()

    override fun showException(exceptionMessage: String) {
        val snack = Snackbar.make(findViewById(android.R.id.content), exceptionMessage, Snackbar.LENGTH_LONG)
        val view = snack.view
        val tv = view.findViewById<TextView>(android.support.design.R.id.snackbar_text)
        tv.setTextColor(Color.WHITE)
        snack.show()
    }

}
>>>>>>> scafolding
