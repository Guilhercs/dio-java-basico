public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println(smartTv.ligada);

        smartTv.desligar();
        System.out.println(smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println(smartTv.volume); // 26

        smartTv.mudarCanal(20);
        System.out.println(smartTv.canal); // 20
    }
}
