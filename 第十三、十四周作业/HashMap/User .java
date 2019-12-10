import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.*;
class TelcomUser {
	private String phoneNumber;//主叫
	private String callTo;     //被叫
	
 HashMap communicationRecords;
	public User(String phoneNumber) {
		this.phoneNumber = phoneNumber;
this.communicationRecords=new HashMap();
	}
	void generateCommunicateRecord() {
		int recordNum = new User().nextInt(10);
		for(int i = 0; i <= recordNum; i++) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.HOUR, - new User().nextInt(10));
			long timeStart = cal.getTimeInMillis();
			long timeEnd = timeStart + 60000 + new User().nextInt(600000);
			//被叫号码
			this.callTo = getCallToPhoneNumber();
			//插入通话记录
			this.communicationRecords.put(this.callTo,
					 timeStart + 
					";" + timeEnd + 
					";" + this.phoneNumber+
					";");
		}
	}
	
	//随机生成被叫号码（后四位随机）并返回
	private String getCallToPhoneNumber() {
		return "1380372" + String.valueOf(new User().nextInt(10))
			 + String.valueOf(new User().nextInt(10))
			 + String.valueOf(new User().nextInt(10))
			 + String.valueOf(new User().nextInt(10));
	}
	
	//模拟计费办法，以字符串的形式返回保留4位小数的计费结果
	private String accountFee(long timeStart, long timeEnd) {
		//每分钟收费*元
		double feePerMinute = 0.2;
		//通话分钟数按四舍五入计算
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double feeTotal = feePerMinute * minutes;
		return String.format("%.4f", feeTotal);
	}
	
	//打印通话记录
	void printDetails() {
		//获取全部通话记录
		Set keySet=communicationRecords.keySet();
		Iterator it=keySet.iterator();
		//循环分割记录内的每一项并输出
		while(it.hasNext()){
			System.out.println("---------通话记录分割线---------");
			//Map.Entry entry=(Map.Entry) (it.next());
			Object key=it.next();
			Object value=communicationRecords.get(key);
			//System.out.println(value);
			//System.out.println();
			String [] recordField = ((String) value).split(";");
			System.out.println("主叫：" + recordField[2]);
			//System.out.println("被叫：" + recordField[3]);
			Date timeStart = new Date(Long.parseLong(recordField[0]));
			Date timeEnd = new Date(Long.parseLong(recordField[1]));
	
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
					
			System.out.println("通话开始时间：" + simpleDateFormat.format(timeStart));
			System.out.println("通话结束时间：" + simpleDateFormat.format(timeEnd));
			
			System.out.println("计费：" 
					+ accountFee(Long.parseLong(recordField[0]), Long.parseLong(recordField[1]))
					+ " 元。");
		}
	}
}
