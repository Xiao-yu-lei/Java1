public class Main {
         public static void main(String[] args) {
	 Customer customer = new Customer("����");
	 Movie movie = new Movie("��ѩ��Ե2",2);
	 Rental rental =new Rental(movie,8);
	 customer.addRental(rental);
	 System.out.println("�����嵥:\n"+customer.statement());
		    
	}
}
