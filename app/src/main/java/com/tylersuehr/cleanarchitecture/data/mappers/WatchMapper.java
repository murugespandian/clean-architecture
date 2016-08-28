package com.tylersuehr.cleanarchitecture.data.mappers;
import android.content.ContentValues;
import android.database.Cursor;
import com.tylersuehr.cleanarchitecture.data.models.Watch;
/**
 * Copyright 2016 Tyler Suehr
 * Created by tyler on 8/28/2016.
 */
public class WatchMapper extends TechnologyMapper<Watch> {
    @Override
    public Watch map(Cursor c) {
        Watch watch = (Watch)mapTechnology(c);
        watch.setCircular(c.getInt(c.getColumnIndex("isCircular")) == 1);
        return watch;
    }

    @Override
    public ContentValues toContentValues(Watch o) {
        ContentValues values = super.toContentValues(o);
        values.put("isCircular", o.isCircular());
        return values;
    }
}