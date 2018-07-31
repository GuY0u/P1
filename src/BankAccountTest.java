
public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount a1 = new BankAccount("고길동", 111101010, 10, 0.1); //첫번째 생성자에 값을 저장해준다
		BankAccount a2 = new BankAccount();
		
		System.out.println(a1.get계좌번호());
		System.out.println(a2.get계좌번호());
		
		System.out.println(a2.get이름()); // 디폴트 생성자에서의 이름은 '홍길동'
		
		a2.set이름("김철수"); //이름의 설정자 메소드로 이름을 '김철수'로 변경
		
		System.out.println(a2.get이름()); //접근자로 변경된 필드값을 반환하여 '김철수'를 반환
		
		


	}

}
