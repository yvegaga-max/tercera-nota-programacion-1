public class TiendaDeROPopaYDescuento2 { 
    public static void main(String[] args) {
        
        double camiseta = 25;
        double pantalon = 30;
        double descuento = 0.15;

        System.out.println("decuento del 15% sobre el precio original de cada prenda ");
       
        camiseta = camiseta - (camiseta * descuento);
        pantalon = pantalon - (pantalon * descuento);
        
        double total = camiseta + pantalon;
        
        System.out.println("Total con una camiseta y un pantalon: $" + total);

        System.out.println(" si se compra una segunda camiseta se brinda un descuento del  5% ");

        double segundaCamiseta = camiseta - (camiseta * 0.05);
        
        total = total + segundaCamiseta;
        
        System.out.println("Total de compra con una segunda camiseta: $" + total);
    }
}
