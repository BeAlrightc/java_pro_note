package annotation.test1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
@Documented
@Inherited
@Repeatable(myAnnotations1.class)
//自定义的注解
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface myAnnotations {
 //定义一个字符串参数，默认为hello
 String value() default "hello";
}
