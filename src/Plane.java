
public class Plane {
	private String maker;
	private String model;
	private int maximum;
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public Plane(String maker, String model, int maximum) {
		this.maker = maker;
		this.model = model;
		this.maximum = maximum;
	}
	
	public Plane() {
		maker = "에어버스";
		model = "A20";
		maximum = 600;
	}
	

}
