import java.util.Scanner;

public class ValidacaoDeParenteses {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
        
        if(s.isBlank()) 
          return true;
    		                
    	  else {
    		char inicio = s.charAt(0);
            char fim = s.charAt(s.length()-1);
            
    		if(inicio == '(' && fim == ')')
    			return true;
    		if(inicio == '[' && fim == ']')
    			return true;
    		if(inicio == '{' && fim == '}')
    			return true;  
    	  }
    	    return false;
        }

}
