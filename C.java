public class C {
    public static void main (String[] args) {
        //他のデータに変換する事をキャストと呼ぶ。下記が例
     double d = 777.77;

     int i = (int)d;

     int e = 10;

     double g = e / 4;
     //上記の場合、右辺のeがint型なので10/4で余りが切り捨てられて２になり、左辺でdouble型になるので2.0になる。
     //2.5にしたい場合、下記の式

     double f = (double)e / 4;

     System.out.println(i);
     System.out.println(g);
     System.out.println(f);
    }
    
    
}