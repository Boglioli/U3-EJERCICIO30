public class Main {
    public static void main(String[] args) {
        TarjetaGold gold = new TarjetaGold("123456789", "Juan Perez", 1000000, 5);
        TarjetaBlack black = new TarjetaBlack("987654321", "Maria Lopez", 200000, true);
        System.out.println("estado de tarjetas");
        System.out.println("-------------------------");
        System.out.println("tarjeta gold");
        System.out.println("titular: " + gold.titular);
        if (gold.realizarCompra(20000)) {
            System.out.println("compra realiza correctamente");
            System.out.println("millas acumulados: " + gold.calcularMillas(20000));
        } else {
            System.out.println("compra rechazada");
        }
        System.out.println("saldo utilizado: $" + gold.saldoUtilzado);
        System.out.println("saldo disponible: $" + gold.calcularSaldoDisponible());
        System.out.println("--------------------------");
        System.out.println("tarjeta black");
        System.out.println("titular: " + black.titular);
        if (black.realizarCompra(30000)) {
            System.out.println("compra realizada correctamente");
        } else
            System.out.println("compra rechazada");

        System.out.println("seguro de viaje: " + black.seguroViaje);
        System.out.println("saldo utilizado: $" + black.saldoUtilzado);
        System.out.println("saldo disponibles: $" + black.calcularSaldoDisponible());
    }
}






































































































