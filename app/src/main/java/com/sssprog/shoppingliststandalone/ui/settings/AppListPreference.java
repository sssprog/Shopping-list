package com.sssprog.shoppingliststandalone.ui.settings;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;

public class AppListPreference extends ListPreference {

    public AppListPreference(final Context context) {
        this(context, null);
    }

    public AppListPreference(final Context context, final AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public CharSequence getSummary() {
        final CharSequence entry = getEntry();
        final CharSequence summary = super.getSummary();
        if (summary == null || entry == null) {
            return null;
        } else {
            return String.format(summary.toString(), entry);
        }
    }

    @Override
    public void setValue(final String value) {
        super.setValue(value);
        notifyChanged();
    }
}
