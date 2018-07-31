
public class BankAccount { //클래스 이름 
	
	private String 이름;
	private long 계좌번호;
	private long 잔액;
	private double 이자율; // 접근제어가 private인 필드 이름들
	
	public String get이름() {  // 이름의 접근자 메소드
		return 이름;
	}

	public void set이름(String 이름) {  //이름의 설정자 메소드
		this.이름 = 이름;
	}

	public long get계좌번호() {
		return 계좌번호;
	}

	public void set계좌번호(long 계좌번호) {
		this.계좌번호 = 계좌번호;
	}

	public long get잔액() {
		return 잔액;
	}

	public void set잔액(long 잔액) {
		this.잔액 = 잔액;
	}

	public double get이자율() {
		return 이자율;
	}

	public void set이자율(double 이자율) {
		this.이자율 = 이자율;
	}

	
	public BankAccount(String 이름, long 계좌번호, long 잔액, double 이자율) { //모든데이터를 받는 생성자
		this.이름 = 이름;
		this.계좌번호 = 계좌번호;
		this.잔액 = 잔액;
		this.이자율 = 이자율;
	}
	
	public BankAccount() { //매개변수 없는 생성자 (생성자 중복정의)
		이름 = "홍길동";
		계좌번호 = 1101234567;
		잔액 = 10000;
		이자율 = 1.5;
	}

}
