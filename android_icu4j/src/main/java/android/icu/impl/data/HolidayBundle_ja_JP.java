/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 *******************************************************************************
 * Copyright (C) 1996-2010, International Business Machines Corporation and    *
 * others. All Rights Reserved.                                                *
 *******************************************************************************
 */

package android.icu.impl.data;

import java.util.Calendar;
import java.util.ListResourceBundle;

import android.icu.util.Holiday;
import android.icu.util.SimpleHoliday;

/** @hide All android.icu classes are currently hidden */
public class HolidayBundle_ja_JP extends ListResourceBundle {
    static private final Holiday[] fHolidays = {
        new SimpleHoliday(Calendar.FEBRUARY,  11,  0,    "National Foundation Day"),
    };
    static private final Object[][] fContents = {
        {   "holidays",         fHolidays   },
    };
    public synchronized Object[][] getContents() { return fContents; }
}
