public class TarjetaGold extends TarjetaCredito {
    protected double bonificacion;
    public TarjetaGold(String numero, String titular, double limiteCredito, double bonificacion) {
        super(numero, titular, limiteCredito);
        this.bonificacion = 5;
    }
    @Override
    public boolean realizarCompra(double monto) {
        if (monto > 0 && saldoUtilzado + monto <= limiteCredito) {
            saldoUtilzado = saldoUtilzado + monto;
            return true;
        }
        return false;
    }
    public double calcularMillas(double monto) {
        return monto * bonificacion / 100;
    }
}
