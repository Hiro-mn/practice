class N {
   public String name;

   N(String name) { //コンストラクタ　インスタンスが生成された直後に実行されるメソッド。　注意　①コンストラクタ名はクラス名と同じにする、②戻り値を書いてはいけない
    this.name = name;
   }
   public void hello() {
       System.out.println("こんにちは" + this.name + "です");
   }
}