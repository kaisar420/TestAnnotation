package testTargetAndRetension;

import java.lang.annotation.*;

/**
 * Created by iparhan on 17-5-11.
 */
//@Retention(RetentionPolicy.RUNTIME)
//@Retention(RetentionPolicy.SOURCE)
//@Retention({RetentionPolicy.SOURCE,RetentionPolicy.CLASS, RetentionPolicy.RUNTIME})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Inherited
@Target(ElementType.TYPE)  //use in class,interface,enum,annotation
//@Target(ElementType.FIELD)  //cant use in annotation and class
//@Target(ElementType.METHOD) //just in method
//@Target(ElementType.PARAMETER) //just in method
//@Target(ElementType.CONSTRUCTOR)  //just in Constructor
//@Target(ElementType.LOCAL_VARIABLE)  //you know
//@Target(ElementType.ANNOTATION_TYPE)  //just use in annotation type
//@Target({ElementType.TYPE,ElementType.METHOD})  //use in package


public @interface MyAnnotation {

    String color() default "green";
    String value();

    int[] array()  default {1,2,3,3};
    Grade grade() default Grade.A;
    MyAnnotation2 myAnnotation2();


}

enum Grade{
    A("99 -100"){
        public String getScore(){
            return "Great";
        }
    },
    B("80-90"){
        public String getScore(){
            return "Good";
        }
    },
    C("70-80"){
        public String getScore(){
            return  "Nice";
        }
    },
    D("60-70"){
        public String getScore(){
            return "OK";
        }
    },
    E("0-59"){
        public String getScore(){
            return "Not Good";
        }
    };
    private String value;

    private Grade(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public abstract String getScore();

    }
