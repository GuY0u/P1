
public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount a1 = new BankAccount("��浿", 111101010, 10, 0.1); //ù��° �����ڿ� ���� �������ش�
		BankAccount a2 = new BankAccount();
		
		System.out.println(a1.get���¹�ȣ());
		System.out.println(a2.get���¹�ȣ());
		
		System.out.println(a2.get�̸�()); // ����Ʈ �����ڿ����� �̸��� 'ȫ�浿'
		
		a2.set�̸�("��ö��"); //�̸��� ������ �޼ҵ�� �̸��� '��ö��'�� ����
		
		System.out.println(a2.get�̸�()); //�����ڷ� ����� �ʵ尪�� ��ȯ�Ͽ� '��ö��'�� ��ȯ
		
		


	}

}
