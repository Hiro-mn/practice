public class H {
    public static void main(String[] args) {
        //配列とfor文の組み合わせ
        int[] price = {77, 121,777};

        //for (int i = 0; i < 3; i++) {
         // for (int i = 0; i < price.length; i++) { //... 配列.lengthで配列の中の要素を取り出せる。配列の中身が変わってもいちいち数字を変えなくて済む為、覚えておくと便利。

            //System.out.println(price[i]);
        //}
             //System.out.println(price[i]);
           //}
        
           for (int data : price) { // 拡張for文ともいい、上記の式をすっきりさせるやり方でfor(データ型　変数　: 配列の変数名)という形になる
               System.out.println(data);
           }

    }
}