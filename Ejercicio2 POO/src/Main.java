class Empleado{
    public String nombre;
    public String cargo;
    public double salario;
    public String fechaIngreso;

    public Empleado(String nombre, String cargo, double salario, String fechaIngreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;

    }
    public void informacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Cargo: "+ cargo);
        System.out.println("Salario: "+ salario);
        System.out.println("Fecha de Ingreso: "+ fechaIngreso);
        System.out.println("----------------------------------------");
    }
}



public class Main {
    public static void main(String[] args) {
Empleado empleado1 =new Empleado("Maria Lopez","Gerente",2500.00,"2019-05-05");
Empleado empleado2 = new Empleado("Juan Gomez","Contador",1700.00,"2020-11-06");
Empleado empleado3 = new Empleado("Anny Perez","Asistente",1000.00,"2023-09-19");
empleado1.informacion();
empleado2.informacion();
empleado3.informacion();
    }

}