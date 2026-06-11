/**
 * @license
 * SPDX-License-Identifier: Apache-2.0
 */

import { Download, Smartphone, CheckCircle, Code } from "lucide-react";

export default function App() {
  return (
    <div className="min-h-screen bg-neutral-950 text-neutral-200 flex flex-col items-center justify-center p-6 font-sans">
      <div className="max-w-2xl w-full bg-neutral-900 border border-neutral-800 rounded-2xl p-10 shadow-2xl space-y-8">
        <div className="flex flex-col items-center text-center space-y-4">
          <div className="h-20 w-20 bg-emerald-500/20 text-emerald-400 rounded-full flex items-center justify-center animate-pulse">
            <Smartphone className="h-10 w-10" />
          </div>
          <h1 className="text-3xl font-medium tracking-tight text-white">
            Android Project Generated
          </h1>
          <p className="text-neutral-400 max-w-md">
            Your production-ready Android WebView project for the Cloudflare EPR system has been successfully configured.
          </p>
        </div>

        <div className="bg-neutral-950 rounded-xl p-6 border border-neutral-800">
          <h3 className="text-sm font-medium text-neutral-300 uppercase tracking-wider mb-4">What's Included</h3>
          <ul className="space-y-3">
            {[
              "Kotlin Android Studio Project with Gradle Kotlin DSL",
              "Advanced WebView with CookieManager & DOM Storage",
              "File Uploads, Camera, & Geolocation support",
              "Offline Mode with Caching & Fallback Activity",
              "Material 3 UI, Swipe-to-Refresh & Splash Screen",
              "Firebase Cloud Messaging (FCM) Integration",
              "GitHub Actions CI/CD for Automated Release Builds"
            ].map((item, i) => (
              <li key={i} className="flex items-start space-x-3">
                <CheckCircle className="h-5 w-5 text-emerald-500 shrink-0" />
                <span className="text-neutral-300">{item}</span>
              </li>
            ))}
          </ul>
        </div>

        <div className="bg-blue-900/20 border border-blue-800/50 rounded-xl p-6 text-center">
          <Code className="h-8 w-8 text-blue-400 mx-auto mb-3" />
          <h3 className="text-blue-100 font-medium mb-2">How to access the code</h3>
          <p className="text-sm text-blue-300/80 mb-4">
            The Android source files have been generated in the workspace. To build the APK, export this project using the platform's export or download features, and open it in Android Studio.
          </p>
          <div className="inline-flex items-center space-x-2 text-sm text-blue-300 font-mono bg-blue-950/50 px-4 py-2 rounded-lg">
            <span>Look in: /app/src/main/</span>
          </div>
        </div>
      </div>
    </div>
  );
}
