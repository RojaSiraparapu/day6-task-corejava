public class Product
{
	static String category="Electronics";
	String productName;
	public static void main(String [] args)
	{
		Product product1=new Product();
		Product product2=new Product();
		product1.productName="laptop";
		product2.productName="smartphone";
		System.out.println("category:" +category);
		System.out.println("product1:" +product1.productName);
		System.out.println("product2:" +product2.productName);
}
}
