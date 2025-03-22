public class Auto extends Vehiculo{
    private String numeroPuertas;

    public Auto(String marca, String modelo, String ano, double precioBase, String numeroPuertas) {
        super(marca, modelo, ano, precioBase);
        this.numeroPuertas = numeroPuertas;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", precioBase=" + precioBase +
                "numeroPuertas='" + numeroPuertas + '\'' +
                '}';
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Tipo de vehiculo: Auto");
        System.out.println("-----------------------------");
        System.out.println("Numero de puertas: " + numeroPuertas);
        super.mostrarInfo();
        super.calcularPrecioFinal();
    }
}
