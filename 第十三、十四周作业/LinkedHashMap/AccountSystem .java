
public class AccountSystem {

	public static void main(String[] args) {
		//实例化一个电信用户类User
		User user = new User("13800138000");
		
		//生成通话记录
		User.generateCommunicateRecord();
		
		
		//打印通话详单
	    User.printDetails();
	}

}
