package com.appollosales.erp

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

class WebAppInterface(private val mContext: Context) {

    /** Show a toast from the web page */
    @JavascriptInterface
    fun showToast(toast: String) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show()
    }
    
    // Add more JS interfaces here if needed to interact natively with your Cloudflare EPR
}
