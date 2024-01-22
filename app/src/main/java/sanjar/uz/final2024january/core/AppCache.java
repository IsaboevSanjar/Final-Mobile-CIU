package sanjar.uz.final2024january.core;

import android.content.Context;
import android.content.SharedPreferences;

public class AppCache {
    private static AppCache appCache;
    private final SharedPreferences preferences;

    private AppCache(Context context) {
        preferences = context.getSharedPreferences("AppCache", Context.MODE_PRIVATE);
    }

    public static void init(Context context) {
        if (appCache == null) {
            appCache = new AppCache(context);
        }
    }

    public static AppCache getHelper() {
        return appCache;
    }

    public String getUsername() {
        return preferences.getString("USERNAME", "Username");
    }

    public void setUsername(String value) {
        preferences.edit().putString("USERNAME", value).apply();
    }
}
