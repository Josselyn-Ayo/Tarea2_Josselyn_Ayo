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
        Jugador jugador2 = new Jugador("Pedri Gonzalez","Centrocampista",22,8);
            System.out.println("Ingrese el nombre del tercer jugador: ");
            String nombre3 = input.nextLine();
            System.out.println("Ingrese la  posicion del tercer jugador: ");
            String posicion3 = input.nextLine();
            System.out.println("Ingrese la edad del tercer jugador: ");
            int edad3 = input.nextInt();
            System.out.println("Ingrese el numero del tercer jugador ");
            int numeroCamiseta3 = input.nextInt();
            Jugador jugador3 = new Jugador(nombre3,posicion3,edad3,numeroCamiseta3);
            jugador1.informacion();
            jugador2.informacion();
            jugador3.informacion();

    }

}