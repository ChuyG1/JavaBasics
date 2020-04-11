package ReplHomeworks;

public class ReplHW138 {
	
	String label;
	double price;
	String category;
	boolean hasExpiration;
	int stock;
	
	ReplHW138(String label, double price, String category, boolean hasExpiration, int stock){
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
	ReplHW138(String label, double price, int stock){
		String category="misc";
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
	ReplHW138(String label, double price){
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
}
