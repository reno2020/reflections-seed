package org.throwable.annotation;

import java.lang.annotation.*;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/8/13 17:26
 */
@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Bean {

	String[] name() default {};
}
