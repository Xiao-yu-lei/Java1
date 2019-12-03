public class Main {
         public static void main(String[] args) {
	 Customer customer = new Customer("李四");
	 Movie movie = new Movie("冰雪奇缘2",2);
	 Rental rental =new Rental(movie,8);
	 customer.addRental(rental);
	 System.out.println("租用清单:\n"+customer.statement());
		    
	}
}
