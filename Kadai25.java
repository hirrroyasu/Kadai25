package kadai;

public class Kadai25 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*	整数を10回入力させ、一行に表示し、同じ数字があればその数字が何回出現しているかを表示し、
		 *	ない場合は重複なし、と表示する。
		 */
		int count; //重複カウント用変数
		boolean duplicate = false; //重複有無判定用変数
		int num [] = new int [10];
		System.out.println("整数値を10回入力し同じ数字があるか調べるプログラムです");
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "回目");
			num[i] = input();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("");

		for (int i = 9; i >= 0 ; i--) { //外側ループ。配列の後ろからチェック
			count = 0; //countに初期値0を代入
			for (int j = i-1; j >= 0; j--) { //内側ループ。外側ループの1個前の要素からスタート
				if (num[i] != 0 && num[i] == num[j]) { //iが0のときは既にjのループが終わっているので0でないという条件をつける
					count++;
					num[j] = 0; //チェック済みのしるしに0を代入
				}
			}
			if (count != 0) { //重複あり
				duplicate = true;
				System.out.println(num[i] + "が" + (count + 1) + "回出現しました");
			}
		}
		if (duplicate == false) { //重複なし
			System.out.println("重複なし");
		}
		System.out.println("これでプログラムを終了します");
	}
	//数字入力値メソッド
	public static int input() {
		while (true) {
			try {
				int num = new java.util.Scanner(System.in).nextInt();
				return num;
			} catch (Exception e) {
				System.out.println("数字以外が入力されました\n入力しなおしてください");
			}
		}
	}
}
