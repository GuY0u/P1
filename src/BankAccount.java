
public class BankAccount { //Ŭ���� �̸� 
	
	private String �̸�;
	private long ���¹�ȣ;
	private long �ܾ�;
	private double ������; // ������� private�� �ʵ� �̸���
	
	public String get�̸�() {  // �̸��� ������ �޼ҵ�
		return �̸�;
	}

	public void set�̸�(String �̸�) {  //�̸��� ������ �޼ҵ�
		this.�̸� = �̸�;
	}

	public long get���¹�ȣ() {
		return ���¹�ȣ;
	}

	public void set���¹�ȣ(long ���¹�ȣ) {
		this.���¹�ȣ = ���¹�ȣ;
	}

	public long get�ܾ�() {
		return �ܾ�;
	}

	public void set�ܾ�(long �ܾ�) {
		this.�ܾ� = �ܾ�;
	}

	public double get������() {
		return ������;
	}

	public void set������(double ������) {
		this.������ = ������;
	}

	
	public BankAccount(String �̸�, long ���¹�ȣ, long �ܾ�, double ������) { //��絥���͸� �޴� ������
		this.�̸� = �̸�;
		this.���¹�ȣ = ���¹�ȣ;
		this.�ܾ� = �ܾ�;
		this.������ = ������;
	}
	
	public BankAccount() { //�Ű����� ���� ������ (������ �ߺ�����)
		�̸� = "ȫ�浿";
		���¹�ȣ = 1101234567;
		�ܾ� = 10000;
		������ = 1.5;
	}

}
