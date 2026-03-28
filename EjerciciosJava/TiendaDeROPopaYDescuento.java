public class TiendaDeROPopaYDescuento { 
    public static void main(String[] args) {
        
        double camiseta = 25;
        double pantalon = 30;
        double descuento = 0.15;

        System.out.println("decuento del 15%");
       
        camiseta = camiseta - (camiseta * descuento);
        pantalon = pantalon - (pantalon * descuento);
        
        double total = camiseta + pantalon;
        
        System.out.println("Total con una camiseta y un pantalon: $" + total);

        System.out.println("descuento si se compra una segunda camiseta del 5%");

        double segundaCamiseta = camiseta - (camiseta * 0.05);
        
        total = total + segundaCamiseta;
        
        System.out.println("Total junto con una segunda camiseta: $" + total);
    }
}
