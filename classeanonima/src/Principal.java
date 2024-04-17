public class Principal {

      public class CaixaEletronico {
    	  	private Painel painel;
      		private EmissorNotas emissorNotas;
      		private float valor;
      		private int operacao;

            public CaixaEletronico(){ //Construtor padrao
                    painel = new Painel(){
                         public void getOperacao(int operacao){
                                   System.out.println(operacao);
                         }
                    };
                    emissorNotas = new EmissorNotas(){
                            public void getNotas(float valor){
                                  System.out.println(valor);
                            }
                   };
                    valor = 10;
                    operacao = 10;
            }
            public String toString(){
                  painel.getOperacao(operacao);
                  emissorNotas.getNotas(valor);
                  return "15110";
            }
          }//fim classe

      public abstract class Painel {
            public abstract void getOperacao(int operacao);
      }//fim Painel


      public abstract class EmissorNotas {
          public abstract void getNotas(float valor);
      }//fim EmissorNotas

          public static void main(String [ ] args ){
                 
                  CaixaEletronico caixa = new Principal().new CaixaEletronico();
                  System.out.println(caixa);
          }

}
