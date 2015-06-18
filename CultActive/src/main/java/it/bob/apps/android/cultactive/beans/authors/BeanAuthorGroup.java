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
import com.j256.ormlite.table.DatabaseTable;
import it.bob.apps.android.cultactive.utils.CAConstants;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by roberto on 16/06/15.
 */
@DatabaseTable( tableName = CAConstants.DB_TABLE_NAME_AUTHOR_GROUPS )
public class BeanAuthorGroup extends BeanAuthor
{

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_GROUP_AUTHOR_YEAR_BORN)
    private int yearBorn = CAConstants.DEFAULT_INT_VALUE;

    /* ********************************************************************* */
    /*                            CLASS METHODS                              */
    /* ********************************************************************* */

    /**
     * The methods retrieves the members of the group via the
     * {@see it.bob.apps.android.cultactive.beans.relations.BeanRelAuthorGroup}.
     *
     * @return
     */
    public Collection<BeanAuthorSingle> retrieveMembers()
    {
        Collection<BeanAuthorSingle> members = new ArrayList<BeanAuthorSingle>();

        return members;
    }

    /* ********************************************************************* */
    /*                             CONSTRUCTORS                              */
    /* ********************************************************************* */

    public BeanAuthorGroup() { }


    /* ********************************************************************* */
    /*                       GETTER AND SETTER METHODS                       */
    /* ********************************************************************* */

    public int getYearBorn() { return yearBorn; }

    public void setYearBorn(int yearBorn) { this.yearBorn = yearBorn; }

}
