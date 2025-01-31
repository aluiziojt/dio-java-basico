public class SmartTv {
    boolean ligada = false;
    int volume = 0;
    int canal = 1;

    public void aumentarVolume() {
        System.out.println("Volume aumentado");
        volume++;
        if (volume > 100) {
            volume = 100;
        }
        System.out.println(volume);
    }

    public void diminuirVolume() {
        System.out.println("Volume diminuído");
        volume--;
        if (volume < 0) {
            volume = 0;
        }
        System.out.println(volume);
    }

    public void ligar() {
        System.out.println("Ligando");
        ligada = true;
        System.out.println(ligada);
    }

    public void desligar() {
        System.out.println("Desligando");
        ligada = false;
        System.out.println(ligada);
    }

    public void mudarCanal(int canal) {
        System.out.println("Canal mudado para " + canal);
        this.canal = canal;
        System.out.println(canal);
    }

    public void aumentarCanal() {
        System.out.println("Canal aumentado");
        canal++;
        if (canal > 100) {
            canal = 100;
        }
        System.out.println(canal);
    }

    public void diminuirCanal() {
        System.out.println("Canal diminuído");
        canal--;
        if (canal < 0) {
            canal = 0;
        }
        System.out.println(canal);
    }

    public void status() {
        System.out.println("Status da TV");
        System.out.println("Ligada: " + ligada);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(10);
        smartTv.status();
    }
}