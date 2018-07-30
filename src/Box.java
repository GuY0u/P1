
public class Box {
	
	private int 가로;
	private int 세로;
	private int 높이;
	private boolean 유무;
	public int get가로() {
		return 가로;
	}
	public void set가로(int 가로) {
		this.가로 = 가로;
	}
	public int get세로() {
		return 세로;
	}
	public void set세로(int 세로) {
		this.세로 = 세로;
	}
	public int get높이() {
		return 높이;
	}
	public void set높이(int 높이) {
		this.높이 = 높이;
	}
	public boolean is유무() {
		return 유무;
	}
	public void set유무(boolean 유무) {
		this.유무 = 유무;
	}
	
	public Box(int 가로, int 세로, int 높이, boolean 유무) {
		this.가로 = 가로;
		this.높이 = 높이;
		this.세로 = 세로;
		this.유무 = 유무;
		
	}

}
