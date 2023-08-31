package org.secuso.privacyfriendlypausinghealthily.database.columns;

import android.database.Cursor;

import org.secuso.privacyfriendlypausinghealthily.database.data.Exercise;


public final class ExerciseColumns {

    public static final String TABLE_NAME = "exercises";

    public static final String _ID = "exercise_id";
    public static final String SECTION = "section";
    public static final String IMAGE_ID = "image_id";

    public static final String[] PROJECTION = {
            _ID,
            SECTION,
            IMAGE_ID,
    };

    public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public static Exercise fromCursor(Cursor c) {
        Exercise e = ExerciseLocalColumns.fromCursor(c);

        e.setId(c.getInt(c.getColumnIndexOrThrow(ExerciseColumns._ID)));
        e.setSection(c.getString(c.getColumnIndexOrThrow(ExerciseColumns.SECTION)));
        e.setImageID(c.getString(c.getColumnIndexOrThrow(ExerciseColumns.IMAGE_ID)));

        return e;
    }

    private ExerciseColumns() {}
}
