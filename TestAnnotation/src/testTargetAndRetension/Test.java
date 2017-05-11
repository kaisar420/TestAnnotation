package testTargetAndRetension;

/**
 * Created by iparhan on 17-5-11.
 */

@MyAnnotation(color = "blue",value = "hello",array = {1,2,2},grade = Grade.A,myAnnotation2 = @MyAnnotation2(value = "Haha"))
public class Test {
    public static void main(String[] args) {
        //if its use Annotation
        if(Test.class.isAnnotationPresent(MyAnnotation.class)){
            //use reflect get the object of testTargetAndRetension.MyAnnotation class
            MyAnnotation  myAnnotation = Test.class.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.color());
            System.out.println(myAnnotation.value());
            System.out.println(myAnnotation.array().length);
            System.out.println(myAnnotation.array().toString().length());
            //System.out.println(myAnnotation.grade());
            System.out.println(myAnnotation.myAnnotation2());
            System.out.println(myAnnotation.annotationType());
            System.out.println(myAnnotation.myAnnotation2().value());


            int[] arr = new int[3];
            System.out.println(arr.length);//使用length获取数组的程度

            String str = "abc";
            System.out.println(str.length());

            int[][] a=new int[3][];
            System.out.println(a.length);//3
            int[][] b=new int[3][5];
            System.out.println(b.length);//3

        }
    }
}
