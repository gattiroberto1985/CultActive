 package it.bob.apps.android.cultactive.beans.relations;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import it.bob.apps.android.cultactive.beans.authors.BeanAuthorSingle;
import it.bob.apps.android.cultactive.beans.base.BaseCABean;
import it.bob.apps.android.cultactive.utils.CAConstants;

/**
 *
 * This class represent an ORMLite relation between an author and a group.
 * The relation is many-to-many, because every single author could
 * actually be in more than a group.
 *
 * Created by roberto on 6/18/15.
 */
@DatabaseTable( tableName = CAConstants.DB_TABLE_NAME_AUTHOR_GROUPS_RELATION)
public class BeanRelAuthorGroup extends BaseCABean
{

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_R_AUTH_GROUP_ID_GROUP, foreign = true, foreignAutoRefresh = true)
    private BeanRelAuthorGroup group;

    @DatabaseField(columnName = CAConstants.DB_TABLE_COL_R_AUTH_GROUP_ID_AUTHOR, foreign = true, foreignAutoRefresh = true)
    private BeanAuthorSingle author;

    /* ********************************************************************* */
    /*                             CONSTRUCTORS                              */
    /* ********************************************************************* */

    public BeanRelAuthorGroup() { }

    /* ********************************************************************* */
    /*                       GETTER AND SETTER METHODS                       */
    /* ********************************************************************* */

    public BeanRelAuthorGroup getGroup() { return group; }

    public void setGroup(BeanRelAuthorGroup group) { this.group = group; }

    public BeanAuthorSingle getAuthor() { return author; }

    public void setAuthor(BeanAuthorSingle author) { this.author = author; }

}
