
public class Review01 {

    public static void main(String[] args) {
        //変数の宣言・初期化
        int kakaku = 1500;//商品価格は 1500
        int tax = 10;//税率　10％
        int result;

        //resultにtaxMethoodの結果を代入(戻り値あり）
        result = taxMethod( kakaku , tax );

        //結果の出力;
        System.out.println(kakaku + "円の商品の税込価格は" + (kakaku + result)
        + "円（消費税は" + result + "円）です。");
    }
    public static int taxMethod( int kakaku,int tax) {
        //taxメソッドは消費税額（商品価格の10％）が戻り値とする
        int result = (kakaku/100)*(tax);
        return result;
    }
}

