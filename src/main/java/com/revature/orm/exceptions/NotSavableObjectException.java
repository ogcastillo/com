package com.revature.orm.exceptions;

public class NotSavableObjectException extends RuntimeException
{
    public NotSavableObjectException(String message)
    {
        super(message);
    }
}
