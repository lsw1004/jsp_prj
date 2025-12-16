package day1128;

public class MemberService {
	public void joinMember(ParamDTO pDTO) {
		// 회원 테이블 insert 하는 쿼리 실행하는 DAO method
		System.out.println("Service" + pDTO);
		// 히스토리에 테이블 insert 쿼리를 DAO method
	}// joinMember
}// class
