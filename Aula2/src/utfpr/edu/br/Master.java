package utfpr.edu.br;

public class Master {
	public static void main(String[] args) {
		Student Joao = new Student("João", 23);
		Student Maria = new Student("Maria", 18);
		System.out.println(Joao);
		System.out.println(Maria);
		int diferenca = Math.abs(Joao.getAge() - Maria.getAge());
		System.out.println(diferenca);
	}
}
