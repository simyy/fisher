package cn.simyy.jfisher.annotion;

import java.lang.annotation.*;

/**
 * mark viewer
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface View {
    String value() default "";
}
