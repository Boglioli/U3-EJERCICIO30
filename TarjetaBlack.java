public class TarjetaBlack extends TarjetaCredito {
    protected boolean seguroViaje;

    public TarjetaBlack(String numero, String titular, double limiteCredito, boolean seguroViaje) {
        super(numero, titular, limiteCredito);
        this.seguroViaje = true;
    }

    @Override
    public boolean realizarCompra(double monto) {
        double comision = monto * 2 / 100;
        double total = monto + comision;
        if (monto > 0 && saldoUtilzado + total <= limiteCredito) {
            saldoUtilzado = saldoUtilzado + total;
            return true;
        } else {
            return false;
        }
    }
}