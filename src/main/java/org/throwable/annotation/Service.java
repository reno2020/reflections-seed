package org.throwable.annotation;

import java.lang.annotation.*;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/8/13 17:25
 */
@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {

	String value() default "";
}
