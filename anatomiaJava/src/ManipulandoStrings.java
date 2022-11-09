public class ManipulandoStrings {
    public static void main(String[] args) {
        String primeiroNome = "Gustavo";
        String segundoNome = "Henrique";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println("Nome Completo: "+ nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

