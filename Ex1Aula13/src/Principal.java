public class Principal {
	public class CaixaEletronico {
		private Painel painel;
		private EmissorNotas emissor_notas;
		private Double valor;
		private Integer operacao;
		private static class Painel {
			public int getOperacao(int operacao) {
				return operacao;
			}
		}
		private static class EmissorNotas{
			public Double getNotas(Double valor) {
				return valor;
			}
		}
		public CaixaEletronico() {
			this.painel = new Painel();
			this.emissor_notas = new EmissorNotas();
			this.valor = 0.0;
			this.operacao = 0;
		}
		public String toString() {
			return this.painel.getOperacao(operacao) + "\n" +
				   this.emissor_notas.getNotas(valor) + "\n";
				 
		}
	}
	public static void main(String[] args) {
		CaixaEletronico c1 = new Principal().new CaixaEletronico();
		System.out.println(c1);
	}
}
