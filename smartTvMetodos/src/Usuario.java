public class Usuario {
    public static void main(String[] args) throws Exception {
        /*Interagindo com o metodo smartTv */
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? "+ smartTv.ligada);
        System.out.println("Canal Atual : "+ smartTv.canal);
        System.out.println("Volume Atual : "+ smartTv.volume);

        smartTv.ligar();
            System.out.println("Novo Status -> TV Ligada ? "+ smartTv.ligada);
        
        smartTv.desligar();
            System.out.println("Novo Status -> TV Ligada ? "+ smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual :"+ smartTv.volume);

        System.out.println("Canal atual: "+ smartTv.canal);
       
        smartTv.mudarCanal(13);

        System.out.println("Mudando de Canal para : "+ smartTv.canal);

       

        
    }
}
