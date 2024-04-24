import java.util.ArrayList;

public class SGBike {
	public abstract class Bicicleta{
		public String toString() {
			return this.getClass().getSimpleName() + "\n" +
						getAro();
		}
		public abstract int getAro();
	}
	public class MontainBike extends Bicicleta {
		public int getAro() {
			return 15;
		}
	}
	public class Speed extends Bicicleta {
		public int getAro() {
			return 20;
		}
	}
	public class Ergonomica extends Bicicleta {
		public int getAro() {
			return 25;
		}
	}
	
	public SGBike() {
		ArrayList<Bicicleta> bicicletas = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			if(i == 0) {
				bicicletas.add(new MontainBike());
			}
			if(i > 0 && i % 2 == 0) {
				bicicletas.add(new Speed());
			} else {
				bicicletas.add(new Ergonomica());
			}
		}
		for(Bicicleta a: bicicletas) {
			System.out.println(a);
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		}
		
	}

	public static void main(String[] args) {
		SGBike a = new SGBike();

	}

}
