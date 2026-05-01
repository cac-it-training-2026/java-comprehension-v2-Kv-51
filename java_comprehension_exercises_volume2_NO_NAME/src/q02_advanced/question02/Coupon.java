package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class Coupon {
	private int id;
	private double discountRate;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
		コンストラクタ
	 */
	public Coupon() {
	}

	/**
		コンストラクタ
	 */
	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", description=" + description + "]";
	}

	public static List<Coupon> getInstance(int id, double discountRate, String description) {
		List<Coupon> list = new ArrayList<>(); //returnする用のリスト作成

		list.add(new Coupon(id, discountRate, description));
		list.add(new Coupon(id, discountRate, description));

		return list; //メソッドの戻り値が<型>なのでここでArrayListの変数を返せる
	}
}
