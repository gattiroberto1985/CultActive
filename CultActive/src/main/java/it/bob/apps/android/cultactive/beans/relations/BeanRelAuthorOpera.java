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
package it.bob.apps.android.cultactive.beans.relations;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import it.bob.apps.android.cultactive.beans.authors.BeanAuthor;
import it.bob.apps.android.cultactive.beans.base.BaseCABean;
import it.bob.apps.android.cultactive.beans.operas.BeanOpera;
import it.bob.apps.android.cultactive.utils.CAConstants;

/**
 * Created by roberto on 16/06/15.
 */
@DatabaseTable(tableName = CAConstants.DB_TABLE_NAME_AUTHOR_OPERAS_RELATION )
public class BeanRelAuthorOpera extends BaseCABean
{

    @DatabaseField( columnName = CAConstants.DB_TABLE_COL_DEFAULT_ID, generatedIdSequence = CAConstants.DB_SEQUENCE_NAME_REL_AUTH_OPERA)
    private int id;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_R_AUTH_OPERA_ID_AUTH, foreign = true, foreignAutoRefresh = true)
    private BeanAuthor author;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_R_AUTH_OPERA_ID_OPERA, foreign = true, foreignAutoRefresh = true)
    private BeanOpera opera;

    /* ********************************************************************* */
    /*                             CONSTRUCTORS                              */
    /* ********************************************************************* */

    public BeanRelAuthorOpera() { }

    /* ********************************************************************* */
    /*                       GETTER AND SETTER METHODS                       */
    /* ********************************************************************* */

    public BeanOpera getGroup() { return this.opera; }

    public void setGroup(BeanOpera group) { this.opera = opera; }

    public BeanAuthor getAuthor() { return author; }

    public void setAuthor(BeanAuthor author) { this.author = author; }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
