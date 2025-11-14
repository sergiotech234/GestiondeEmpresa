public class MainGestionEmpresa {
    private static final int max_EMPLEADOS = 10;
    private static Empleado[] empleados = new Empleado[max_EMPLEADOS];
    private static int contadorEmpleado = 0;

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
    public static void mostrarEmpleados(){
        System.out.println("\n===Lista de empleados===\n");
        for(int i = 0; i < contadorEmpleado; i++){
            System.out.println("Empleado: " + empleados[i].getNombre());
        }
    }

    public static double calcularNominal(){
        double salario = 0;
        for(int i = 0; i < contadorEmpleado; i++){
            salario += empleados[i].getSalario();
        }
        return salario;
    }
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