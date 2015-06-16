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

package it.bob.apps.android.cultactive.beans.base;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import it.bob.apps.android.cultactive.utils.CAConstants;

import java.io.Serializable;

/**
 *
 * This class represents a generic note for an object. A string object is
 * defined to store an information and an Object field is used for
 * attached (e. g. pitcures, audio, ...).
 *
 * Created by roberto on 14/06/15.
 */
@DatabaseTable( tableName = CAConstants.DB_TABLE_NAME_NOTES )
public class BeanNote implements Serializable
{

    @DatabaseField(generatedId = true, columnName = CAConstants.DB_TABLE_COL_DEFAULT_ID)
    private int id;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_NOTES_BEAN_TYPE)
    private CAConstants.BEAN_TYPES type;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_NOTES_BEAN_ID, foreign = true )
    private BaseCABean bean;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_NOTES_TEXT)
    private String note;

    private Object attached;

    /* ********************************************************************* */
    /*                             CONSTRUCTORS                              */
    /* ********************************************************************* */

    public BeanNote() { }

    public BeanNote(String note)
    {
        this.setNote(note);
    }

    public BeanNote(String note, Object attached)
    {
        this.setNote(note);
        this.setAttached(attached);
    }

    /* ********************************************************************* */
    /*                       GETTER AND SETTER METHODS                       */
    /* ********************************************************************* */

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNote() { return note; }

    public void setNote(String note) { this.note = note; }

    public Object getAttached() { return this.attached; }

    public void setAttached(Object attached) { this.attached = attached; }
}
