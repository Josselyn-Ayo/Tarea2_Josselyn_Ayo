import java.util.Scanner;
class Jugador{
    String nombre;
    String posicion;
    int edad;
    int numeroCamiseta;
    public Jugador (String nombre,String posicion, int edad,int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }
    public void informacion() {
            System.out.println("Nombre: "+ nombre);
            System.out.println("Posicion: "+ posicion);
            System.out.println("Edad: "+ edad);
            System.out.println("Numero de camiseta: "+numeroCamiseta);
            System.out.println("---------------------------------------");
        }
}

public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jugador jugador1 = new Jugador("Lionel Messi","delantero",37,10);
            System.out.println("Ingrese el nombre del segundo jugador: ");
            String nombre2 = input.nextLine();
            System.out.println("Ingrese la  posicion del segundo jugador: ");
            String posicion2 = input.nextLine();
            System.out.println("Ingrese la edad del segundo jugador: ");
            int edad2 = input.nextInt();
            System.out.println("Ingrese el numero del segundo jugador ");
            int numeroCamiseta2 = input.nextInt();
            Jugador jugador2 = new Jugador(nombre2, posicion2, edad2, numeroCamiseta2);
            Jugador jugador3 = new Jugador("Pedri Gonzales", "centrocampista", 22,8);
            jugador1.informacion();
            jugador2.informacion();
            jugador3.informacion();

    }

}