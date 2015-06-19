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
import it.bob.apps.android.cultactive.beans.authors.BeanAuthor;
import it.bob.apps.android.cultactive.beans.base.BaseCABean;
import it.bob.apps.android.cultactive.utils.CAConstants;

/**
 * Created by roberto on 16/06/15.
 */
public abstract class BeanOpera extends BaseCABean
{

    @DatabaseField( generatedIdSequence = CAConstants.DB_SEQUENCE_NAME_OPERAS, columnName = CAConstants.DB_TABLE_COL_DEFAULT_ID)
    protected int id;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_OPERA_TITLE)
    private String title = CAConstants.DEFAULT_STRING_VALUE;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_OPERA_TYPE)
    private CAConstants.OPERA_TYPES type = CAConstants.OPERA_TYPES.OPERA_DEFAULT;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_OPERA_RATING)
    private int rate = CAConstants.DEFAULT_INT_VALUE;

    /* ********************************************************************* */
    /*                             CONSTRUCTORS                              */
    /* ********************************************************************* */

    public BeanOpera() { }

    public BeanOpera(String title, CAConstants.OPERA_TYPES type, int rate)
    {
        this.setTitle(title);
        this.setType(type);
        this.setRate(rate);
    }


    /* ********************************************************************* */
    /*                       GETTER AND SETTER METHODS                       */
    /* ********************************************************************* */

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public CAConstants.OPERA_TYPES getType() { return type; }

    public void setType(CAConstants.OPERA_TYPES type) { this.type = type; }

    public int getRate() { return rate; }

    public void setRate(int rate) { this.rate = rate; }

}
