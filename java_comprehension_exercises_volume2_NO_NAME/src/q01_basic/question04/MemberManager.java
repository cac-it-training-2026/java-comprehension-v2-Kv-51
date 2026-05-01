package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する
	public static void showAllMembers(Member[] members) { //戻り値はMember型
		for (Member member : members) {
			member.showMember(); //配列（が入った変数）memberがループしてて各値でshowMemberが呼び出される
		}
	}

}
