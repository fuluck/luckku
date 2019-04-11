import org.junit.Test;

import java.math.BigDecimal;

public class MyTest {
    public static void main(String[] args) {
        double result = 1.0 - 0.9;
        System.out.println(result);
        BigDecimal bigDecimal = new BigDecimal(0.1);
    }









    @Test
    public void testMain(){
        double rawAccout = 64.60;

        int t =(int)(rawAccout * 100);

//        解决double转int精度丢失
//        int t2 = BigDecimal.valueOf(rawAccout).multiply(BigDecimal.valueOf(100)).intValue();

//          System.out.println(rawAccout);
          System.out.println(t);
//        System.out.println(t2);

//        不能通过BigDecimal的构造方法直接将double作为参数获得BigDecimal对象
//        BigDecimal bigDecimal = new BigDecimal(rawAccout);
//        System.out.println(bigDecimal);

        //应作为字符串传入 或 通过BigDecimal自带的方法传入
//          BigDecimal bigDecimal = new BigDecimal(Double.toString(rawAccout));
//        BigDecimal bigDecimal=BigDecimal.valueOf(rawAccout);
//        System.out.println(bigDecimal);
    }

}
