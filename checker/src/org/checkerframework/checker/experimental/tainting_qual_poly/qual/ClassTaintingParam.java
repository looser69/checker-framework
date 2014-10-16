package org.checkerframework.checker.experimental.tainting_qual_poly.qual;

import org.checkerframework.checker.experimental.tainting_qual_poly.TaintingAnnotationConverter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Repeatable(MultiClassTaintingParam.class)
public @interface ClassTaintingParam {
    String value() default TaintingAnnotationConverter.PRIMARY_TARGET;
}
