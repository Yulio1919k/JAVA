package Estructuras_de_control;
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        double enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, dicienbre;
        Scanner ingresos = new Scanner(System.in);
        System.out.print("Ingrese el ingreso para Enero: ");
        enero = ingresos.nextDouble();
        enero = (enero >= 100 && enero <= 150) ? enero + (enero * 5) / 100 : enero;
        {
            System.out.println("La ganacia de Enero es de: " + enero);
        }
        System.out.print("Ingrese el ingreso para Febrero: ");
        febrero = ingresos.nextDouble();
        febrero = (febrero >= 200 && febrero <= 250) ? febrero + (febrero * 10) / 100 : febrero;
        {
            System.out.println("La ganacia de Febrero es de: " + febrero);
        }
        System.out.print("Ingrese el ingreso para Marzo: ");
        marzo = ingresos.nextDouble();
        marzo = (marzo >= 300 && marzo <= 350) ? marzo + (marzo * 15) / 100 : marzo;
        {
            System.out.println("La ganacia de Marzo es de: " + marzo);
        }
        System.out.print("Ingrese el ingreso para Abril: ");
        abril = ingresos.nextDouble();
        abril = (abril >= 400 && abril <= 450) ? abril + (abril * 20) / 100 : abril;
        {
            System.out.println("La ganacia de Abril es de: " + abril);
        }
        System.out.print("Ingrese el ingreso para Mayo: ");
        mayo = ingresos.nextDouble();
        mayo = (mayo >= 500 && mayo <= 550) ? mayo + (mayo * 25) / 100 : mayo;
        {
            System.out.println("La ganacia de Mayo es de: " + mayo);
        }
        System.out.print("Ingrese el ingreso para Junio: ");
        junio = ingresos.nextDouble();
        junio = (junio >= 600 && junio <= 650) ? junio + (junio * 30) / 100 : junio;
        {
            System.out.println("La ganacia de Junio es de: " + junio);
        }
        System.out.print("Ingrese el ingreso para Julio: ");
        julio = ingresos.nextDouble();
        julio = (julio >= 700 && julio <= 750) ? julio + (julio * 35) / 100 : julio;
        {
            System.out.println("La ganacia de Julio es de: " + julio);
        }
        System.out.print("Ingrese el ingreso para Agosto: ");
        agosto = ingresos.nextDouble();
        agosto = (agosto >= 800 && agosto <= 850) ? agosto + (agosto * 40) / 100 : agosto;
        {
            System.out.println("La ganacia de Agosto es de: " + agosto);
        }
        System.out.print("Ingrese el ingreso para Septiembre: ");
        septiembre = ingresos.nextDouble();
        septiembre = (septiembre >= 900 && septiembre <= 950) ? septiembre + (septiembre * 45) / 100 : septiembre;
        {
            System.out.println("La ganacia de Septiembre es de: " + septiembre);
        }
        System.out.print("Ingrese el ingreso para Octubre: ");
        octubre = ingresos.nextDouble();
        octubre = (octubre >= 1000 && octubre <= 1050) ? octubre + (octubre * 50) / 100 : octubre;
        {
            System.out.println("La ganacia de Octubre es de: " + octubre);
        }
        System.out.print("Ingrese el ingreso para Noviembre: ");
        noviembre = ingresos.nextDouble();
        noviembre = (noviembre >= 1100 && noviembre <= 1150) ? noviembre + (noviembre * 55) / 100 : noviembre;
        {
            System.out.println("La ganacia de Noviembre es de: " + noviembre);
        }
        System.out.print("Ingrese el ingreso para Diciembre: ");
        dicienbre = ingresos.nextDouble();
        dicienbre = (dicienbre >= 1200 && dicienbre <= 1250) ? dicienbre + (dicienbre * 60) / 100 : dicienbre;
        {
            System.out.println("La ganacia de Diciembre es de: " + dicienbre);
        }
    }
}