package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain07 {

	public static void main(String[] args) throws IOException {

		NumberList numberList = new NumberList(); //インスタンス生成
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		//TODO ここから実装する
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		limit = Integer.parseInt(reader.readLine());
		numberList.addFromOneTo(limit); //入力値を渡す

		try {
			for (int i = 0; i <= numberList.numbers.size(); i++) { //<=にしないと問題通りにならない
				System.out.print("[" + numberList.numbers.get(i) + "]");
				if (i != (numberList.numbers.size() - 1)) {
					System.out.print(",");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("\n****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;
		//TODO ここから実装する
		sum = numberList.calcSumOfList(); //return受け取り

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		//TODO ここから実装する
		numberList.doubleListEachValue(); //2倍にするメソッド呼び出し

		for (int i = 0; i < numberList.numbers.size(); i++) {
			System.out.print("[" + numberList.numbers.get(i) + "]");
			if (i != (numberList.numbers.size() - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		//TODO ここから実装する
		numberList.removeIndexOfFirstHalf(); //前半削除するメソッド呼び出し

		for (int i = 0; i < numberList.numbers.size(); i++) {
			System.out.print("[" + numberList.numbers.get(i) + "]");
			if (i != (numberList.numbers.size() - 1)) {
				System.out.print(",");
			}
		}

	}

}
