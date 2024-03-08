public class Main {
	public Main() {
		Temperature temp = new Temperature();
		System.out.println(temp);
	}
	public static void main(String[] args) {
		Main master = new Main();
		System.out.println(master);
	}
	public String toString() {
		return "Objeto principal";
	}
}