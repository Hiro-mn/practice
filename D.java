public class D {
    public static void main(String[] args) {
        //if
        int score = 85;
       // if (score > 80) {
         //System.out.println("great");
        //} else if (score > 60) {
           //System.out.println("soso");
       // } else {
            //System.out.println("bad");
        //}
        //もうひとつの書き方もある。下記に記載。
        //返り値 = 条件 ? 条件が真だったときの値 : 条件が偽だったときの値
        String msg = score > 80 ? "great" : "soso";
        System.out.println(msg);
    }
}