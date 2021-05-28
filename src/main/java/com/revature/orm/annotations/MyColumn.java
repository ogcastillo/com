package com.revature.orm.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyColumn
{
    String name();
    ColumnType type() default ColumnType.VARCHAR;
    int length() default 0;
    boolean nullable() default false;
    boolean unique() default false;
    boolean pk() default false;
    boolean fk() default false;
    String reference();
    String delete() default "cascade";
}
