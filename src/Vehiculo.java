public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String ano;
    protected double precioBase;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String ano, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precioBase = precioBase;
    }

    public String getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }

    public void calcularPrecioFinal(){
        double precioConImpuestos = precioBase * 1.10;
        double precioFinal = precioConImpuestos - (precioConImpuestos*0.15);
        System.out.println("Se le aplica un impuesto del 10% sobre el precio base");
        System.out.println("Precio con impuestos: " + precioConImpuestos);
        System.out.println("Tiene un descuento del 15%");
        System.out.println("Precio final con descuento: " + precioFinal);
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + ano);
        System.out.println("Precio base: " + precioBase);
    }
}
