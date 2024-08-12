# ProGuard rules for the BIN Checker app

# Keep the application's package names
-keep class com.papaguycodes.binchecker.** { *; }

# Keep Room's annotations and classes
-keep class androidx.room.** { *; }
-keep class androidx.room.RoomDatabase { *; }
-keep class androidx.room.Entity { *; }
-keep class androidx.room.Dao { *; }
-keep class androidx.room.Insert { *; }
-keep class androidx.room.Query { *; }
-keep class androidx.room.Update { *; }
-keep class androidx.room.Delete { *; }
-keep class androidx.room.Embedded { *; }

# Keep Kotlin classes and methods
-keep class kotlin.** { *; }
-keepclassmembers class kotlin.** { *; }

# Keep AndroidX classes
-keep class androidx.** { *; }

# Keep Jetpack Compose annotations
-keep @androidx.compose.runtime.* class * { *; }
-keep @androidx.compose.ui.tooling.preview.Preview class * { *; }
-keep class androidx.compose.** { *; }

# General settings
-dontwarn androidx.**
-dontwarn kotlin.**
