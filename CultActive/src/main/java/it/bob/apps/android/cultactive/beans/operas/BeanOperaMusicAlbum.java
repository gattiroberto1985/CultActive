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
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import it.bob.apps.android.cultactive.utils.CAConstants;

import java.util.Collection;

/**
 * Created by roberto on 16/06/15.
 */
@DatabaseTable( tableName = CAConstants.DB_TABLE_NAME_OPERA_MUSIC_ALBUMS)
public class BeanOperaMusicAlbum extends BeanOpera
{

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_OPERA_MUSIC_ALBUM_TIME)
    private int time = CAConstants.DEFAULT_INT_VALUE;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_OPERA_MUSIC_ALBUM_YEAR)
    private int year = CAConstants.DEFAULT_INT_VALUE;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_OPERA_MUSIC_ALBUM_CATEGORY)
    private String category = CAConstants.DEFAULT_STRING_VALUE;

    @ForeignCollectionField
    private Collection<BeanOperaMusicSong> songs;

    /* ********************************************************************* */
    /*                             CONSTRUCTORS                              */
    /* ********************************************************************* */

    public BeanOperaMusicAlbum(String title, int rate, int time, int year, String category, Collection<BeanOperaMusicSong> songs)
    {
        super(title, CAConstants.OPERA_TYPES.OPERA_MUSIC_ALBUM, rate);
        this.setTime(time);
        this.setYear(year);
        this.setCategory(category);
        this.setSongs(songs);
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Collection<BeanOperaMusicSong> getSongs() {
        return songs;
    }

    public void setSongs(Collection<BeanOperaMusicSong> songs) {
        this.songs = songs;
    }

}
