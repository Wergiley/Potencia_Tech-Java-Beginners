public class InfoCarro {
    public static void main(String[] args) {

        ClassCarro carro1 = new ClassCarro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW");
        carro1.setCapacidadeTanque(59);

        System.out.println("Informações do carro:");

        System.out.println("Cor: "+carro1.getCor());
        System.out.println("Modelo: "+carro1.getModelo());
        System.out.println("Capacidade do Tanque: "+carro1.getCapacidadeTanque()+"L");
        System.out.println("Tanque Completo: R$"+carro1.totalValorTanque(5.59)+" Reais");

        ClassCarro carro2 = new ClassCarro("Vermelho", "Audi", 66);

        System.out.println("\nInformações do carro:");

        System.out.println("Cor: "+carro2.getCor());
        System.out.println("Modelo: "+carro2.getModelo());
        System.out.println("Capacidade do Tanque: "+carro2.getCapacidadeTanque()+"L");
        System.out.println("Tanque Completo: R$"+carro2.totalValorTanque(5.59));

    }
}
