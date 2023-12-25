package annotation.test1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE})
public @interface myAnnotations1 {
    //声明一个myAnnotations的数组变量。
    myAnnotations[] value();
}
