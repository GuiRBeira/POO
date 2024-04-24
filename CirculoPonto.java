import java.util.ArrayList;

public class CirculoPonto {
	
	public abstract class Ponto {
		protected float x;
		protected float y;
		public Ponto(float x, float y) {
			this.x = x;
			this.y = y;
		}
		public String toString() {
			return this.getClass().getSimpleName();
		}
		public abstract float getRaio();
	}
	public class Circulo extends Ponto {
		private float raio;
		public Circulo(float x, float y, float raio) {
			super(x,y);
			this.raio = raio;
		}
		public float getRaio() {
			return this.raio;
		}
	}
	public class Esfera extends Ponto {
		private float raio;
		public Esfera(float x, float y, float raio) {
			super(x,y);
			this.raio = raio;
		}
		public float getRaio() {
			return this.raio;
		}
	}
	public CirculoPonto() {
		Ponto a = new Circulo(0, 0, 0);
		Ponto b = new Esfera(0, 0, 0);
		ArrayList<Ponto> lista = new ArrayList<>();
		lista.add(new Circulo (1f,1f,1f));
		lista.add(new Esfera (1f,1f,1f));
		for(Ponto c: lista) {
			System.out.println(c + "\n" + c.getRaio());
		}
		
	}
	public static void main(String[] args) {
		CirculoPonto a = new CirculoPonto();
	}

}
