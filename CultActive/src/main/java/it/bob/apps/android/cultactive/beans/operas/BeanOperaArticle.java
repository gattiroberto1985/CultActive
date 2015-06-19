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
@DatabaseTable( tableName = CAConstants.DB_TABLE_NAME_OPERA_ARTICLES )
public class BeanOperaArticle extends BeanOpera
{

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_ARTICLES_LINK)
    private String httpLink = CAConstants.DEFAULT_STRING_VALUE;

    /* ********************************************************************* */
    /*                             CONSTRUCTORS                              */
    /* ********************************************************************* */

    public BeanOperaArticle(String title, int rate, String httpLink)
    {
        super(title, CAConstants.OPERA_TYPES.OPERA_ARTICLE, rate);
        this.setHttpLink(httpLink);
    }


    /* ********************************************************************* */
    /*                       GETTER AND SETTER METHODS                       */
    /* ********************************************************************* */

    public String getHttpLink() {
        return httpLink;
    }

    public void setHttpLink(String httpLink) {
        this.httpLink = httpLink;
    }
}
