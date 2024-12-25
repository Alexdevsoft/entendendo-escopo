
public class Main {

	public static void main(String[] args) {
		
		double preco = 30;
		double desconto;
		
		if(preco > 20) {
			desconto = preco * 0.1;
		}
		else {
			desconto = 0;
		}
		
		System.out.println(desconto);

	}

}
