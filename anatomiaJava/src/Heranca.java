public class Heranca {
    
    public static void main(String[] args) {

       Funcionario funcionario = new Funcionario();

       Funcionario gerente = new Gerente();
       Funcionario vendedor = new Vendedor();
       Funcionario fachineiro = new Fachineiro();

       System.out.println(gerente);
       System.out.println(vendedor);
       System.out.println(fachineiro);
       System.out.println(funcionario);

    }
}
