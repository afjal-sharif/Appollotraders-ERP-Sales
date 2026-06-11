# APK Signing Guide for Play Store Deployment

To deliver your Cloudflare EPR to the Google Play Store or to generate a Release APK using GitHub Actions, follow these steps to secure your application signature.

### Method 1: Android Studio (Manual Local Release)
1. Open Android Studio -> Top Nav Bar -> **Build**.
2. Select **Generate Signed Bundle / APK**.
3. Choose **APK** or **Android App Bundle (AAB)** (AAB is required for Play Store).
4. Under "Key store path", select **Create New**.
5. Fill in the Key store paths, Passwords, and Certificate info.
6. Remember the passwords and keep the `.jks` file perfectly secure.
7. Click Next -> select `release` -> Submit.

### Method 2: GitHub Actions Automated Signed Release
Using the workflow file provided in `.github/workflows/android.yml`:

1. Generate your KeyStore locally (`Method 1`) and keep the `.jks` file.
2. Convert your `.jks` KeyStore file to a Base64 string.
   - Mac/Linux: `base64 release.jks > release-base64.txt`
3. Go to GitHub -> Your Repository -> **Settings** -> **Secrets and variables** -> **Actions**.
4. Add the following **Repository secrets**:
   - `SIGNING_KEY`: Paste the entire content of `release-base64.txt`
   - `ALIAS`: The alias you used during Key creation.
   - `KEY_STORE_PASSWORD`: Keystore password.
   - `KEY_PASSWORD`: Key password.
5. In `.github/workflows/android.yml` uncomment the Release block at the bottom of the file.
6. Push a commit. Your `release-signed.apk` will now be provided in the GitHub Actions artifacts tab automatically upon pushing successfully.
