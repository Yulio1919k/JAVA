package Practica.Ejercicio6;

public class Padre {
        /*
        * Diseñe un programa en Java que permita el ingreso 
        * de los datos personales de 5 personas, estos datos son: 
        * Nombres, apellidos, edad y dirección, 
        * finalmente muestre los datos ingresados ordenados de forma 
        * descendente de acuerdo a la edad.
        */
    public String Nombres;
    public String Apellidos;
    public String Direccion;
    public int Edad;
    public Padre(String nomb, String apelli, String direcc, int edad) {
        this.Nombres = nomb;
        this.Apellidos = apelli;
        this.Direccion = direcc;
        this.Edad = edad;
    }
    public String Imprimir() {
        return "Nombre: " + Nombres + "\n" +"Apellidos: " + Apellidos + "\n" + "Edad: " + Edad + "\n" + "Dirección: " + Direccion + "\n";
    }
}