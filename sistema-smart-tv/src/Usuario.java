public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv =  new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume TV: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume TV: " + smartTv.volume);

        System.out.println("Canal Inicial: " + smartTv.canal);        
        smartTv.aumentarCanal();
        System.out.println("Canal Depois: " + smartTv.canal);
       
        smartTv.diminuirCanal();
        System.out.println("Canal Depois: " + smartTv.canal);       

        smartTv.chamarCanal(30);
        System.out.println("Canal alterado para: " + smartTv.canal);

    }
}