public class SmartTv{
boolean ligada=false;

SmartTv smartTv = new SmartTv();
system.out.println(smartTv.ligada); // false
public void aumentarVolume(){
    System.out.println("Volume aumentado");
    volume++;
    // se volume for maior que 100, volume recebe 100
    if(volume>100){
        volume=100;
    }
    system.out.println(volume);
    int volume=0;
    smartTv.aumentarVolume();
    // Volume aumentado
    public void diminuirVolume(){
        System.out.println("Volume diminuido");
        volume--;
        // se volume for menor que 0, volume recebe 0
        if(volume<0){
            volume=0;
        }
        system.out.println(volume);
        int volume=100;
        smartTv.diminuirVolume();
        // Volume diminuido
        // 99
    }
    public void ligar(){
        System.out.println("Ligando");
        ligada=true;
        system.out.println(ligada);
        smartTv.ligar();
        // Ligando
        // true
    }
    public void desligar(){
        System.out.println("Desligando");
        ligada=false;
        system.out.println(ligada);
        smartTv.desligar();
        // Desligando
        // false
    }
    public void mudarCanal(int canal){
        System.out.println("Canal mudado para "+canal);
        this.canal=canal;
        system.out.println(canal);
        int canal=0;
        smartTv.mudarCanal(10);
        // Canal mudado para 10
        // 10
    }
    public void aumentarCanal(){
        System.out.println("Canal aumentado");
        canal++;
        // se canal for maior que 100, canal recebe 100
        if(canal>100){
            canal=100;
        }
        system.out.println(canal);
        int canal=0;
        smartTv.aumentarCanal();
        // Canal aumentado
        // 1
    }
    public void diminuirCanal(){
        System.out.println("Canal diminuido");
        canal--;
        // se canal for menor que 0, canal recebe 0
        if(canal<0){
            canal=0;
        }
        system.out.println(canal);
        int canal=100;
        smartTv.diminuirCanal();
        // Canal diminuido
        // 99
    }
    public void status(){
        System.out.println("Status da TV");
        System.out.println("Ligada: "+ligada);
        System.out.println("Volume: "+volume);
        System.out.println("Canal: "+canal);
        smartTv.status();
        // Status da TV
        // Ligada: false
        // Volume: 0
        // Canal: 0
    }
    SmartTv smartTv = new SmartTv();
    smartTv.ligar();
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();
    smartTv.mudarCanal(10);
    



}