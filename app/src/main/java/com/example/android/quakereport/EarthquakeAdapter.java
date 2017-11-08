package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by 101292 on 08-11-2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<String>{
    public EarthquakeAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @Override
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }
}
