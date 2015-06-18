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

package it.bob.apps.android.cultactive.beans.authors;

import com.j256.ormlite.field.DatabaseField;
import it.bob.apps.android.cultactive.beans.base.BaseCABean;
import it.bob.apps.android.cultactive.beans.operas.BeanOpera;
import it.bob.apps.android.cultactive.utils.CAConstants;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by roberto on 16/06/15.
 */
public abstract class BeanAuthor extends BaseCABean
{

    @DatabaseField( columnName = CAConstants.DB_TABLE_COL_DEFAULT_ID, generatedIdSequence = CAConstants.DB_SEQUENCE_NAME_AUTHOR)
    private int id;

    private char authorType;

    private String authorName;

    /* ********************************************************************* */
    /*                            CLASS METHODS                              */
    /* ********************************************************************* */

    public Collection<BeanOpera> getOperas()
    {
        Collection<BeanOpera> operas = new ArrayList<BeanOpera>();

        return operas;
    }

    /* ********************************************************************* */
    /*                             CONSTRUCTORS                              */
    /* ********************************************************************* */

    public BeanAuthor() { }

    /* ********************************************************************* */
    /*                       GETTER AND SETTER METHODS                       */
    /* ********************************************************************* */

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public char getAuthorType() { return authorType; }

    public void setAuthorType(char authorType) { this.authorType = authorType; }

    @Override
    public int getId() { return id; }

    @Override
    public void setId(int id) { this.id = id; }
}
