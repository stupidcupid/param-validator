package com.validator.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * date
 *
 * @author nanzhou
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
public @interface Date {

    /**
     * min date
     */
    String min();

    /**
     * max date
     */
    String max();

    /**
     * date pattern
     */
    String pattern() default "yyyy-MM-dd HH:mm:ss";

    /**
     * message
     */
    String message() default "this param cannot be null";
}
