package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons; //この時点ではまだ抽象フィールド状態（中身がない）
									//つまりint i = 0;じゃなくてint i;だけみたいな
									//でもこの宣言には自分で初期化しない限りデフォルトで0やnullが入る
									//だからコンストラクタ内で初期化しないとぬるぽエラーになる

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	/**
		コンストラクタ
	 */
	Member() {
		//何も書かんでいい
	}

	/**
		コンストラクタ
	 */
	Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;

		this.coupons = new ArrayList<>(); //returnされたArrayListの受け取り代入
		this.coupons.add(new Coupon(1, 0.5, "最初の特典"));
		this.coupons.add(new Coupon(2, 0.25, "今月の特典"));
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", rank=" + rank
				+ ", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(toString());
	}

	public static List<Member> getInstance(int id, String password, String name, int age, int rank) {
		List<Member> members = new ArrayList<>(); //returnする用のArrayList作成

		Member member1 = new Member(id, password, name, age, rank);
		Member member2 = new Member(id, password, name, age, rank);
		//ここでMemberコンストラクタ呼び出しされ、コンストラクタ内でcouponインスタンスが作成される

		members.add(member1);
		members.add(member2);

		return members;
	}
}
