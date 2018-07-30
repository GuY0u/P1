
public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1 = new Plane();
		Plane p2 = new Plane("¤¼¤¼Ç×°ø»ç", "C215", 50);
		
		System.out.println(p1.getMaker());
		p2.setMaximum(400);
		System.out.println(p2.getMaximum());

	}

}
