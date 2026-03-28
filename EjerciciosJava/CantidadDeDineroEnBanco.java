public class CantidadDeDineroEnBanco {
    

    public static void main(String[] args) {
        
        double saldodelbanco = 1000;
        double retirodelbanco = 200;
        int semanasdelmes = 4;

        System.out.println("una persona tiene una cantidad de dinero en el banco y retira una cantidad fija cada semana ¿cuanto dinero quedara en su cuenta a fin de mes?");

        saldodelbanco = saldodelbanco - (retirodelbanco * semanasdelmes);
        
        System.out.println("Saldo total al  final del mes: $" + saldodelbanco);
    }
}