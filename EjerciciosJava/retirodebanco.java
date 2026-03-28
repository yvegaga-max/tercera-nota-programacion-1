public class retirodebanco {
    

    public static void main(String[] args) {
        
        double saldodelbanco = 1000;
        double retirodedinero = 200;
        int semanasdelmes = 4;

//persona retira del banco una cantidad fija cada semana 

        saldodelbanco = saldodelbanco - (retirodedinero * semanasdelmes);
        
        System.out.println("Saldo total al  final del mes: $" + saldodelbanco);
    }
}