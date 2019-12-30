package dao;

import java.io.*;
import entity.IEntity;
import entity.Student;

import java.util.HashMap;

public class StudentDao implements IDao {
	private static StudentDao instance;
	private HashMap<String, Student> students;
	private Student student;
	
	private StudentDao() throws Exception {
	//˽��ѧ�����ݿ�   //�����ļ�txt�洢ѧ�����ݣ�ֻ�����޲���
		
		students = new HashMap<String, Student>();               // students��ȫ�����ݴ�ŵĵط�
		student = new Student();                                 //newһ��ѧ������
		
		FileInputStream fi = new FileInputStream("student.txt"); //�����ַ������ ������
		ObjectInputStream oi = new ObjectInputStream(fi);        //�����ַ������������
		students = (HashMap<String, Student>)oi.readObject();
		fi.close();
		oi.close();
	}
	public static StudentDao getInstance() throws Exception {
											  	 	//�ṩ����ʵ��������
		if(instance == null) {                	 	//������ݿ�Ϊ��
			synchronized(StudentDao.class) { 	 	//����   ����ʽ
				instance = new StudentDao(); 	 	//����ʵ������
				return instance;             	 	//����ʵ������
			}
		}
		return instance;
	}
	public HashMap<String, Student> getstudents() {
		return students;
	}
	//��
	public void insert(Student student) throws Exception {
		students.put(student.getStudentNo(),student);
        FileOutputStream fs = new FileOutputStream("student.txt");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(students);
        os.close();
        fs.close();
	}

	//ɾ��
	public void delete() {
		
		
		
	}

	//��
	public void update() {
		
	

	}

	
	//���ʵ�廯���� ��ͨ��ID���һ�ø�ѧ�ŵ�ѧ����Ϣ
	public Student getEntity(String Id) {
		
		
		return students.get(Id);
	}

	
	public static void main(String[] args) throws Exception {
		
	}

}
