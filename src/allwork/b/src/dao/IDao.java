package dao;
import java.util.HashMap;
import entity.Student;

public interface IDao {
	void insert(Student student) throws Exception;         //����
	void delete();                                         //ɾ��
	void update();                                         //�����޸�
	public HashMap<String, Student> getstudents();         //˫�м��� 
	public Student getEntity(String Id);                   //����
}
