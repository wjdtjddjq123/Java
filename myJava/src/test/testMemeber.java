package model;

public class testMemeber {
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberDO member = new MemberDO();
	
		System.out.printf("아이디: %s", member.getId());
		System.out.printf("패스워드: %s", member.getPasswd());
		System.out.printf("이름: %s", member.getName());
		System.out.printf("등록일: %s", member.getRegdate());
		System.out.printf("등급: %s", member.getGrade());
	}
}
