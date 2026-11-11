public class TarjetaCredito {
    protected String numero;
    protected String titular;
    protected double limiteCredito;
    protected double saldoUtilzado;
    public TarjetaCredito(String numero, String titular, double limiteCredito) {
        this.numero = numero;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldoUtilzado = 0;
    }
    public boolean realizarCompra(double monto) {
        if (monto > 0 && monto <= limiteCredito) {
            saldoUtilzado= saldoUtilzado + monto;
            return true;
        } else {
            return false;
        }
    }
    public double calcularSaldoDisponible() {
        return limiteCredito - saldoUtilzado;
    }
}
