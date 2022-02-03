public class Programa {
 public static void main(String[] args){
      Listaligada lista = new Listaligada();
     lista.adicionar("AC");
     lista.adicionar("BA");
     lista.adicionar("CE");
     lista.adicionar("DF");
     System.out.println("Tamanho: " + lista.getTamanho());
     System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
     System.out.println("Ultimo: " + lista.getUltimo().getValor());

     for (int i=0;i < lista.getTamanho();i++) {
         System.out.println(lista.get(i).getValor());
     }

     lista.remover("CE");
     System.out.println("Removeu o estado CE");
     lista.adicionar("SP");
     System.out.println("Adicionou o estado SP");
     System.out.println("Tamanho: " + lista.getTamanho());
     for (int i=0;i < lista.getTamanho();i++) {
         System.out.println(lista.get(i).getValor());
     }
 }
}
