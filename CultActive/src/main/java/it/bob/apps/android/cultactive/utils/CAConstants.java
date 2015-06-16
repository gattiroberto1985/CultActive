/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 $user.name
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package it.bob.apps.android.cultactive.utils;

/**
 *
 * This class contains all the constants used by the application.
 *
 * Created by roberto on 14/06/15.
 */
public class CAConstants
{


    /* ********************************************************************* */
    /*                        APPLICATION CONSTANTS                          */
    /* ********************************************************************* */

    public static enum BEAN_TYPES
    {
        BEAN_NOTE,
        BEAN_ARTICLE,
        BEAN_MUSIC_SONG,
        BEAN_MUSIC_ALBUM,
        BEAN_FILM
    }


    /* ********************************************************************* */
    /*                          DATABASE CONSTANTS                           */
    /* ********************************************************************* */

    // names of the tables
    public static final String DB_TABLE_NAME_NOTES = "ca_notes";

    // tables' definitions

    // common values
    public static final String DB_TABLE_COL_DEFAULT_ID = "_id";

    // Notes table
    public static final String DB_TABLE_COL_NOTES_TEXT = "note_text";
    public static final String DB_TABLE_COL_NOTES_BEAN_TYPE = "bean_type";
    public static final String DB_TABLE_COL_NOTES_BEAN_ID   = "bean_id";

}
