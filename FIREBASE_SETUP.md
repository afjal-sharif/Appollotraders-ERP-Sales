# Firebase Push Notification Setup

Firebase Cloud Messaging (FCM) is integrated inside the architecture. Because it requires a uniquely generated `google-services.json` tied to your Google Account, it is commented out by default to allow initial compilation.

### Step-by-step Setup
1. Go to your [Firebase Console](https://console.firebase.google.com/).
2. Create a new Android Project and enter `com.appollosales.erp` as the package name.
3. Download the generated `google-services.json` file.
4. Place `google-services.json` inside the `app/` folder.
5. In `app/build.gradle.kts`, UNCOMMENT the following plugins and dependencies:
   - `id("com.google.gms.google-services")`
   - `implementation(platform("com.google.firebase:firebase-bom:32.7.2"))`
   - `implementation("com.google.firebase:firebase-messaging-ktx")`
6. In `build.gradle.kts` (root), UNCOMMENT:
   - `id("com.google.gms.google-services") version "4.4.1" apply false`
7. In `app/src/main/AndroidManifest.xml`, UNCOMMENT the Service block for `.MyFirebaseMessagingService`.
8. In `app/src/main/java/com/appollo/erp/MyFirebaseMessagingService.kt`, UNCOMMENT the file structure to handle messaging callbacks.

### Linking to Your Cloudflare Worker
When `onNewToken()` is fired inside the `MyFirebaseMessagingService`, dispatch a `POST` request to your Cloudflare EPR backend containing the FCM token associated with the currently logged-in user so that the Worker knows where to push notifications.
