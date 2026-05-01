package q01_basic.question07;

import java.util.ArrayList;
import java.util.List;

/**
 * 整数リストを制御するクラス
 * 
 */
class NumberList {

	/**
	 * 整数のList
	 * 
	 */
	List<Integer> numbers = new ArrayList<>();

	/**
	 * 1から引数までの整数をListに代入する
	 * 
	 * @param limit（Listの最終要素）
	 */
	public void addFromOneTo(Integer limit) {
		for (int i = 1; i <= limit; i++) { //<=にしないと問題通りにならない
			numbers.add(i);
		}
	}

	/**
	 * Listの各要素整数を合計する
	 * 
	 * @return Listの要素の合計値
	 */

	public Integer calcSumOfList() {
		int sum = 0;
		for (int listNum : numbers) {
			sum += listNum;
		}
		return sum;
	}

	/**
	 * Listの各要素を2倍にする
	 * 
	 */
	public void doubleListEachValue() {
		for (int i = 0; i < numbers.size(); i++) {
			numbers.set(i, numbers.get(i) * 2); //set(インデックス,値)
		}
	}

	/**
	 * Listの要素の前半部分を削除する
	 * 要素数が奇数の場合、中央値は残す
	 */
	public void removeIndexOfFirstHalf() {
		int mid = numbers.size() / 2; //インデックス/2で
										//偶数の場合はインデックスの中央値がmidに代入される
										//奇数の場合は、Javaでは自動的に「中央値を後半扱い」する＝midには中央値の一歩手前が代入される

		numbers.subList(0, mid).clear();
		//numbers.remove(0); ←iにするとArrayListは値がずれるから変な穴抜けになっちゃう
	}

	/**
	 * @return numbers
	 */
	public List<Integer> getNumbers() {
		return numbers;
	}

	/**
	 * @param numbers セットする numbers
	 */
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

}
