/* Copyright (c) 2012,2013, Oracle and/or its affiliates. All rights reserved.  */
package de.fsuj.urz.iss.sr.oracle.sr3_10249511261.cdi.interceptor;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

/**
 * InterceptorBinding Class
 */
@InterceptorBinding
@Target({ TYPE, METHOD })
@Retention(RUNTIME)
public @interface OnDeposit {
}
