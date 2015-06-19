package it.bob.apps.android.cultactive.exceptions;

/**
 * Created by roberto on 6/19/15.
 */
public class BaseCAException extends Throwable
{

    /* ********************************************************************* */
    /*                             CONSTRUCTORS                              */
    /* ********************************************************************* */

    public BaseCAException()
    {
        super("ERROR: a generic error has occurred!");
    }

    public BaseCAException(String message, Throwable inner) { super(message, inner); }


}
