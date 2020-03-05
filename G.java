public class G {
    public static void main(String[] args) {
        //配列..書き方三通り
        int [] price;
        price = new int[3];

        //int [] price;
        //price = new int [] {100,200,300}; ...上記を少し簡単に書くやり方

        //int [] price = {100,200,300}; ...上記の文を一文にまとめたやり方で一番楽な書き方。

        price[0] = 100;
        price[1] = 200;
        price[2] = 300;
      
        System.out.println(price[0]);

        price[0] = 1000; //値の書き変えはもう一度値を代入してあげる。

        System.out.println(price[0]);



    }
}