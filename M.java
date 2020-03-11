class M extends N { //クラスの継承
 M(String name) {
     super(name);  //子クラスのコンストラクタを作ると自動的に親クラスのコンストラクタが呼ばれる。親クラスに引数がない場合省略出来る。
 }
 public void sayhello() {
     System.out.println("こんばんは" + this.name + "です");
 }
}