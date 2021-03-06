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

    public static enum OPERA_TYPES
    {
        OPERA_DEFAULT,
        OPERA_ARTICLE,
        OPERA_MUSIC_SONG,
        OPERA_MUSIC_ALBUM,
        OPERA_FILM
    }

    /* ********************************************************************* */
    /*                             DEFAULT VALUES                            */
    /* ********************************************************************* */

    // integer default value
    public static final int DEFAULT_INT_VALUE = -1;
    // string default value
    public static final String DEFAULT_STRING_VALUE = "";
    // char default value
    public static final char DEFAULT_CHAR_VALUE = 'x';


    /* ********************************************************************* */
    /*                          DATABASE CONSTANTS                           */
    /* ********************************************************************* */

    // names of the tables
    public static final String DB_TABLE_NAME_NOTES                  = "ca_notes";
    public static final String DB_TABLE_NAME_AUTHOR_SINGLES         = "ca_authors";
    public static final String DB_TABLE_NAME_AUTHOR_GROUPS          = "ca_groups";
    public static final String DB_TABLE_NAME_AUTHOR_GROUPS_RELATION = "ca_group_author";
    public static final String DB_TABLE_NAME_AUTHOR_OPERAS_RELATION = "ca_opera_author";
    public static final String DB_TABLE_NAME_OPERA_FILMS            = "ca_films";
    public static final String DB_TABLE_NAME_OPERA_ARTICLES         = "ca_articles";
    public static final String DB_TABLE_NAME_OPERA_MUSIC_SONGS      = "ca_music_songs";
    public static final String DB_TABLE_NAME_OPERA_MUSIC_ALBUMS     = "ca_music_albums";

    // names of the sequences
    public static final String DB_SEQUENCE_NAME_AUTHOR = "seq_author";
    public static final String DB_SEQUENCE_NAME_OPERAS = "seq_operas";
    public static final String DB_SEQUENCE_NAME_REL_AUTH_GROUP = "seq_rel_auth_group";
    public static final String DB_SEQUENCE_NAME_REL_AUTH_OPERA = "seq_rel_auth_opera";


    // tables' definitions

    // common values
    public static final String DB_TABLE_COL_DEFAULT_ID = "_id";

    // Notes table
    public static final String DB_TABLE_COL_NOTES_TEXT      = "note_text";
    public static final String DB_TABLE_COL_NOTES_BEAN_TYPE = "bean_type";
    public static final String DB_TABLE_COL_NOTES_BEAN_ID   = "bean_id";

    // Single Author table
    public static final String DB_TABLE_COL_SINGLE_AUTHOR_NAME    = "auth_name";
    public static final String DB_TABLE_COL_SINGLE_AUTHOR_SURNAME = "auth_surname";

    // Group author table
    public static final String DB_TABLE_COL_GROUP_AUTHOR_YEAR_BORN = "group_year_born";

    // Group-author relation
    public static final String DB_TABLE_COL_R_AUTH_GROUP_ID_GROUP  = "group_id";
    public static final String DB_TABLE_COL_R_AUTH_GROUP_ID_AUTHOR = "author_id";

    // Opera-author relation
    public static final String DB_TABLE_COL_R_AUTH_OPERA_ID_AUTH  = "author_id";
    public static final String DB_TABLE_COL_R_AUTH_OPERA_ID_OPERA = "opera_id";

    // Operas table
    public static final String DB_TABLE_COL_OPERA_TITLE  = "opera_title";
    public static final String DB_TABLE_COL_OPERA_TYPE   = "opera_type";
    public static final String DB_TABLE_COL_OPERA_RATING = "opera_rating";

    // Opera Articles table
    public static final String DB_TABLE_COL_ARTICLES_LINK = "opera_article_httplink";

    // Opera Music song table
    public static final String DB_TABLE_COL_OPERA_MUSIC_SONG_TIME     = "opera_song_time";
    public static final String DB_TABLE_COL_OPERA_MUSIC_SONG_CATEGORY = "opera_song_category";
    public static final String DB_TABLE_COL_OPERA_MUSIC_SONG_LYRIC    = "opera_song_lyric";
    public static final String DB_TABLE_COL_OPERA_MUSIC_SONG_ALBUM    = "opera_song_album";

    // Opera Music album song table
    public static final String DB_TABLE_COL_OPERA_MUSIC_ALBUM_TIME     = "opera_album_time";
    public static final String DB_TABLE_COL_OPERA_MUSIC_ALBUM_YEAR     = "opera_album_year";
    public static final String DB_TABLE_COL_OPERA_MUSIC_ALBUM_CATEGORY = "opera_album_category";

}
