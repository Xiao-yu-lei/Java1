package view;

import java.sql.SQLException;
import java.util.Scanner;

public class MainUI {
	
	public static void show1() throws Exception{
		//��¼�ɹ������MainUI���빦��ѡ��
		System.out.println("================��ӭʹ��ѧ����Ϣ����ϵͳ=========");
		System.out.println("ѧ������");
		System.out.println("1-�޸����룻2-ѡ�Σ�3-������Ϣ��0-�˳�");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();  //����ѡ��������
		switch (option) {
		case "1":   //�޸�����
			ModifyPasswordUI.show();
			break;
		case "2":   //ѡ��
			//new CourseSelection().show();
			break;
		case "3":   //������Ϣ
			//new StudentSelection().show();
			break;
		case "0":   //�˳�
			break;
		default:
			System.out.println("��������������������룡");
		}
		System.out.println("========��лʹ��ѧ����Ϣ����ϵͳ=======");
	}
	public static void show2() throws Exception{
		//��¼�ɹ������MainUI���빦��ѡ��
		System.out.println("================��ӭʹ��ѧ����Ϣ����ϵͳ=========");
		System.out.println("����Ա����");
		System.out.println("1-�鿴ѧ����Ϣ��2-�鿴�γ���Ϣ��3-�鿴ѧ��ѡ����Ϣ��0-�˳�");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();  //����ѡ��������
		switch (option) {
		case "1":   //ѧ����Ϣ����ɾ�Ĳ�
			
			break;
		case "2":   //�γ���Ϣ����ɾ�Ĳ�
			
			break;
		case "3":   //ѧ��ѡ����Ϣ����ɾ�Ĳ�
			//new CourseSelection().show();
			break;
		case "0":   //�˳�
			break;
		default:
			System.out.println("��������������������룡");
		}
		System.out.println("========��лʹ��ѧ����Ϣ����ϵͳ=======");
	}
}
