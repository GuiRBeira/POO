package utfpr.edu.br;


public class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String toString() {
		return "Nome: " + getName() + "\nIdade: " + getAge();
	}
}
