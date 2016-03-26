package fun.n.learn.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// We need this annotation only till before compilation.
@Retention(RetentionPolicy.SOURCE)
// This is a simple custom annotation.
public @interface LogMeCustomAnnotation {

}
