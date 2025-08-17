public class EscopoMetodoEParametro {
     // Escopo de classe 
     static int x = 11;
  
     // Escopo de instância - variável de instância
     private int y = 33;
 
     // Escopo de parâmetro - (x)
     public void testaFuncao(int x) {
         // Escopo de método (t) só existe durante a execução do método
         EscopoMetodoEParametro t = new EscopoMetodoEParametro(); 
         this.x = 22; 
         y = 44; 
 
         // Printing variables with different scopes
         System.out.println("EscopoMetodoEParametro.x: " + EscopoMetodoEParametro.x); 
         System.out.println("t.x: " + t.x); 
         System.out.println("t.y: " + t.y); 
         System.out.println("y: " + y); 
     }
 
     // Main Method
     public static void main(String args[]) {
         EscopoMetodoEParametro t = new EscopoMetodoEParametro();
         t.testaFuncao(5); 
     }
}
