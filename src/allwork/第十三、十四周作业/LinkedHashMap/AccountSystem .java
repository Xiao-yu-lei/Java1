
public class AccountSystem {

	public static void main(String[] args) {
		//ʵ����һ�������û���User
		User user = new User("13800138000");
		
		//����ͨ����¼
		User.generateCommunicateRecord();
		
		
		//��ӡͨ���굥
	    User.printDetails();
	}

}
