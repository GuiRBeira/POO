public class Principal {
	private static String nome = "Gui";
	public static class ClasseInterna {
		public void imprimir() {
			System.out.println("Ola " + nome);
			System.out.println(testemetodo());
		}
	}
	public static void main(String[] args) {
		// Principal obj = new Principal();
		ClasseInterna obj = new ClasseInterna();
		obj.imprimir();
	}		
	public static String testemetodo() {
		return "Ola " + nome + " Metodo externo";
	}
}
