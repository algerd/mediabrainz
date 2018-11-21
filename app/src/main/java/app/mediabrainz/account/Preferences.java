package app.mediabrainz.account;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import app.mediabrainz.MediaBrainzApp;

public class Preferences {

    private static final String USER_PREFERENCE_FILE = "user";

    private interface PreferenceName {
        String SUGGESTIONS = "search_suggestions";
    }

    public void clearData() {
        SharedPreferences prefs = getUserPreferences();
        prefs.edit().clear().apply();
    }

    public void setSearchSuggestionsEnabled(boolean enabled) {
        SharedPreferences prefs = getDefaultPreferences();
        prefs.edit().putBoolean(PreferenceName.SUGGESTIONS, enabled).apply();
    }

    public boolean isSearchSuggestionsEnabled() {
        return getDefaultPreferences().getBoolean(PreferenceName.SUGGESTIONS, true);
    }

    private SharedPreferences getDefaultPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(MediaBrainzApp.getContext());
    }

    private SharedPreferences getUserPreferences() {
        return MediaBrainzApp.getContext().getSharedPreferences(USER_PREFERENCE_FILE, Context.MODE_PRIVATE);
    }

}
