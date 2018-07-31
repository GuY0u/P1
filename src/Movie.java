
public class Movie {//영화 클래스
	
	private String 제목;
	private String 감독;
	private String 제작사; //접근제어 private인 필드의 이름들
	
	public Movie(String 제목, String 감독, String 제작사) { //
		this.제목 = 제목;
		this.감독 = 감독;
		this.제작사 = 제작사;
	}
	
	public Movie() { //매개변수가 없는 디폴트 생성자
		제목 = "무서운이야기";
		감독 = "김아무개";
		제작사 = "C제이";
	}

}
