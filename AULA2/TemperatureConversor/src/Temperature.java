import java.util.Scanner;

public class Temperature {
	public Temperature() {
		System.out.print("Insira a temperatura em Farenheit: ");
		Scanner reader = new Scanner(System.in);	
		float f = reader.nextFloat();
		System.out.print("Insira a temperatura em Celsius: ");
		float c = reader.nextFloat();
		reader.close();
		float celsius = conversorFC(f);
		float farenheit = conversorCF(c);
		System.out.println("A temperatura em Celsius é igual a " + celsius);
		System.out.println("A temperatura em Farenheit é igual a " + farenheit);
	}
	public String toString() {
		return "Objeto da conversão";
	}
	public float conversorCF(float temp) {
		return (1.8f*temp) + 32.0f;
	}
	public float conversorFC(float temp) {
		return (temp -32.0f) / 1.8f;
	}
}
