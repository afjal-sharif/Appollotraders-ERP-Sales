# EPR WebApp (Android)

A production-ready Android wrapper for the Cloudflare Worker-based EPR/ERP system.
This project uses a modern WebView integration optimized for cookies, sessions, downloading capabilities, file uploading, and offline caching.

## Features Included
- **Advanced WebView:** Supports JavaScript, DOM Storage, Database Storage.
- **Session Support:** Properly configured `CookieManager` integrates perfectly with Cloudflare Worker session IDs / secure signed cookies.
- **Offline Caching:** App intelligently utilizes device cache if not connected to the internet. Uses `LOAD_CACHE_ELSE_NETWORK`.
- **Offline Resilience:** Shows a Premium Material 3 Offline screen if user launches without connection.
- **Camera & File Uploads:** Supports `WebChromeClient.onShowFileChooser` allowing invoices, photos, and file uploads directly to your Cloudflare endpoints.
- **Downloads Support:** Uses Android `DownloadManager`, bypassing WebView restrictions and injecting appropriate user cookies to authenticate protected endpoint downloads.

## Project Structure
- `app/src/main/java/com/appollo/erp/MainActivity.kt` : Core WebView handler.
- `app/src/main/java/com/appollo/erp/OfflineActivity.kt` : Premium offline screen.
- `app/src/main/res/` : App icon, colors, and layout configurations.

## Build Instructions (Local)
1. Export/Download this workspace.
2. Open Android Studio.
3. Import the downloaded folder as a project.
4. Let Gradle Sync (`Android Studio -> File -> Sync Project with Gradle Files`).
5. Run the project in an emulator or connected device.

## GitHub Actions
We have provided automated GitHub action scripts inside: `.github/workflows/android.yml`.
When you push this repository to GitHub, it will automatically compile a `.apk` file for testing.
