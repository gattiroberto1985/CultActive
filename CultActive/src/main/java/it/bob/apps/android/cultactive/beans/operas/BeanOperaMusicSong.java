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
package it.bob.apps.android.cultactive.beans.operas;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import it.bob.apps.android.cultactive.utils.CAConstants;

/**
 * Created by roberto on 16/06/15.
 */
@DatabaseTable( tableName = CAConstants.DB_TABLE_NAME_OPERA_MUSIC_SONGS )
public class BeanOperaMusicSong extends BeanOpera
{
    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_OPERA_MUSIC_SONG_TIME)
    private int time = CAConstants.DEFAULT_INT_VALUE;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_OPERA_MUSIC_SONG_CATEGORY)
    private String category = CAConstants.DEFAULT_STRING_VALUE;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_OPERA_MUSIC_SONG_LYRIC)
    private String lyric = CAConstants.DEFAULT_STRING_VALUE;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_OPERA_MUSIC_SONG_ALBUM, foreign = true, foreignAutoRefresh = true )
    private BeanOperaMusicAlbum album;

    /* ********************************************************************* */
    /*                             CONSTRUCTORS                              */
    /* ********************************************************************* */

    public BeanOperaMusicSong(String title, int rate, int time, String category, String lyric, BeanOperaMusicAlbum album)
    {
        super(title, CAConstants.OPERA_TYPES.OPERA_MUSIC_SONG, rate);
        this.setTime(time);
        this.setCategory(category);
        this.setLyric(lyric);
        this.setAlbum(album);
    }


    /* ********************************************************************* */
    /*                       GETTER AND SETTER METHODS                       */
    /* ********************************************************************* */


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public BeanOperaMusicAlbum getAlbum() { return this.album; }

    public void setAlbum(BeanOperaMusicAlbum album) { this.album = album; }

}
