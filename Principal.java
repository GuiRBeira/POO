import java.util.ArrayList;

public class Principal {
	public interface Produto {
		public String toString();
		public abstract String preco();
		public abstract String cor();
	}
	
	public class Borracha implements Produto {
		public String preco() {
			return " 5";
		}
		public String cor() {
			return "Branco";
		}
		public String toString() {
			return this.getClass().getSimpleName();
		}
	}

	public class Lapis implements Produto {
		public String preco() {
			return " 20";
		}
		public String cor() {
			return "Azul";
		}
		public String toString() {
			return this.getClass().getSimpleName();
		}
	}
	
	public class Caderno implements Produto {
		public String preco() {
			return " 45";
		}
		public String cor() {
			return "Preto";
		}
		public String toString() {
			return this.getClass().getSimpleName();
		}
	}
	public Principal() {
		/*Produto produto = new Borracha();
		System.out.println(produto);
		produto = new Lapis();
		System.out.println(produto);
		produto = new Borracha();
		System.out.println(produto);*/
		ArrayList<Produto> lista = new ArrayList<>();
		lista.add(new Borracha());
		lista.add(new Lapis());
		lista.add(new Borracha());
		lista.add(new Caderno());
		for(Produto a: lista) {
			System.out.println(a + ":" + a.preco());
			System.out.println(a.cor());
			System.out.println("----------------------------");
		}
	}
	public static void main(String[] args) {
		Principal principal = new Principal();
	}

}
