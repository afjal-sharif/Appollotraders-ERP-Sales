package com.appollosales.erp

import android.content.Intent
import android.util.Log

// import com.google.firebase.messaging.FirebaseMessagingService
// import com.google.firebase.messaging.RemoteMessage

// Uncomment and extend FirebaseMessagingService when Firebase is configured
/*
class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("FCM", "New Token: $token")
        // Send this token to your Cloudflare Worker backend to subscribe the user
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        
        Log.d("FCM", "Message Data payload: ${remoteMessage.data}")
        
        // Handle Cloudflare generic notifications here
        // If the payload contains a "url" or "route" parameter, you can broadcast an intent
        // and catch it in MainActivity to load specific EPR pages natively.
        
        remoteMessage.notification?.let {
            Log.d("FCM", "Message Notification Body: ${it.body}")
        }
    }
}
*/
