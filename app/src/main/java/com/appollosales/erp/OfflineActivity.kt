package com.appollosales.erp

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import com.appollosales.erp.databinding.ActivityOfflineBinding

class OfflineActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOfflineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOfflineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRetry.setOnClickListener {
            if (NetworkUtils.isNetworkAvailable(this)) {
                returnToMain()
            } else {
                android.widget.Toast.makeText(this, getString(R.string.no_internet), android.widget.Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnSettings.setOnClickListener {
            startActivity(Intent(Settings.ACTION_WIFI_SETTINGS))
        }

        binding.btnOfflineContinue.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("FORCE_OFFLINE", true)
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        if (NetworkUtils.isNetworkAvailable(this)) {
            returnToMain()
        }
    }

    private fun returnToMain() {
        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        }
        startActivity(intent)
        finish()
    }
}
