package us.buddman.bubblepop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SettingsActivity : BaseActivity() {


    override fun setDefault() {
    }

    override fun onCreateViewId(): Int {
        return R.layout.activity_settings
    }

    override fun onCreateViewToolbarId(): Int {
        return 0
    }
}
