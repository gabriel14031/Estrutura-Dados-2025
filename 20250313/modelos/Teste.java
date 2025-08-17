// Using Static variables
import java.io.*;

class Test{
      // static variable in Test class
      static int var = 10;
}

class TesteTest 
{
    public static void main (String[] args) {
          // accessing the static variable
          System.out.println("Variável estática : "+Test.var);
    }
}
