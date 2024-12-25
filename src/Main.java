
public class Main {

	public static void main(String[] args) {
		// A variável não pode ficar fora do escopo ou deve ser inicializada.
		double preco = 30;
		double desconto;
		
		if(preco > 20) {
			desconto = preco * 0.2;
		}
		else {
			desconto = 0;
		}
		
		System.out.println(desconto);

	}

}
