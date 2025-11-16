//Creamos un atributo estatico en el cual el usurio pueda introducir el nombre de un empleado introduciendo variables fijas y estaticas
public class MainGestionEmpresa {
    private static final int max_EMPLEADOS = 10;
    private static Empleado[] empleados = new Empleado[max_EMPLEADOS];
    private static int contadorEmpleado = 0;
//Creamos el metodo contratarEmpleado para cuando el usurio introduzca los datos del empleado hace que los alacene, con una funcion If Else para que digo si el empleado esta contartado o no dependiendo del numero de contratados.
    public static void contrarEmpleados(String nombre, double salario, String departamento){
        if(contadorEmpleado < max_EMPLEADOS){
            empleados[contadorEmpleado] =
                    new Empleado(nombre,salario,departamento);
            contadorEmpleado++;
            System.out.println("Empleado contratado:" + nombre);
        }else {
            System.out.println("No se pueden contratar mas empleados");
        }
    }
    //Despues creamos un metodo que muestre la informacion del empleado que ha introducido el usuaio.
    public static void mostrarEmpleados(){
        System.out.println("\n===Lista de empleados===\n");
        for(int i = 0; i < contadorEmpleado; i++){
            System.out.println("Empleado: " + empleados[i].getNombre());
        }
    }
//Acto seguido creamos un metodo en el cual calcule la nomina del empleado com un bucle for
    public static double calcularNominal(){
        double salario = 0;
        for(int i = 0; i < contadorEmpleado; i++){
            salario += empleados[i].getSalario();
        }
        return salario;
    }
//Acto seguido creamos un metodo en el cual busque a los empleados existentes con una variable booleana el cual lo que va hacer en el bucle for es ddecir si existe o no el empleado almacecnado anteriormente
    public static void buscarEmpleado(String nombre){
        System.out.println("\nBuscando empleado : " +nombre);
        boolean existe = false;
     for (int i = 0; i < contadorEmpleado; i++) {
        if (empleados[i].getNombre().equalsIgnoreCase(nombre)) {
            System.out.println("Empleado encontrado: " + empleados[i]);
            existe = true;
        }
    }
     if(!existe){
         System.out.println("Empleado no encontrado");
     }
    }
//Creamos el metodo main para que muestre la informacion qu ele usuario ha intorducido
    public static void main (String[] args){

        contrarEmpleados("tchouameni", 2000, "recursos humanos");
        contrarEmpleados("Dani Carvajal", 10000, "ventas");
        contrarEmpleados("thibaut courtois", 5000, "administrador");

        mostrarEmpleados();

        System.out.println("\nNomina Total: " + calcularNominal());

        buscarEmpleado("Dani Carvajal");
        buscarEmpleado("Luka Modrick");
    }
}
