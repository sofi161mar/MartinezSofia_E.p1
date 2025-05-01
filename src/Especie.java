public class Especie {
    private String nombre;
    private int vidaPromedio;
    private String claseAnimal;
    private double precioVenta;
    private int cantidadDisponible;
    private int totalVendidas;
    public Especie(String nombre, int vidaPromedio, String claseAnimal, double precioVenta, int cantidadDisponible) {
        this.nombre = nombre;
        this.vidaPromedio = vidaPromedio;
        this.claseAnimal = claseAnimal;
        this.precioVenta = precioVenta;
        this.cantidadDisponible = cantidadDisponible;
        this.totalVendidas = 0;
    }
}
public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Vida promedio: " + vidaPromedio + " años");
    System.out.println("Clase de animal: " + claseAnimal);
    System.out.println("Precio de venta: $" + precioVenta);
    System.out.println("Cantidad disponible: " + cantidadDisponible);
    System.out.println("Cantidad total vendidas: " + totalVendidas);
    System.out.println("--------------------------------");
}

public boolean vender(int cantidad) {
    if (cantidad <= cantidadDisponible) {
        cantidadDisponible -= cantidad;
        totalVendidas += cantidad;
        System.out.println("Venta realizada con éxito: " + cantidad + " " + nombre);
        return true;
    } else {
        System.out.println("No hay suficientes " + nombre + " disponibles para la venta.");
        return false;
    }
}

public boolean comprar(int cantidad){
    if (cantidadDisponible<Cantidad){
        cantidadDisponible -= cantidad;
        totalVendidas += cantidad;
        System.out.println("Compra: " + cantidad + " " + nombre);
        return true;
    } else {
        System.out.println("No hay suficientes " + nombre);
        return false;
    }
}


public Especie buscarEspecie (String pNombreEspecie){
    Especie buscado= null;
    if (pNombresEspecie.equals (especie1.darNombre()))
    {
    buscado=especie1;
    }
    else if (pNombreEspecie.equals(especie2.darNombre()))
    {   buscado=especie2;
    }
    else if  (pNombreEspecie.equals(especie3.darNombre()))
    {
    buscado=especie3;
    }
    else if  (pNombreEspecie.equals(especie4.darNombre()))
    { 
    buscado=especie4;
    }
return buscado;
