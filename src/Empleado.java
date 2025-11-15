public class Empleado {
    private String nombre;
    private double salario;
    private String departamento;
//Creamos el constructor de empleado para que el usuario pueda fijar los datos del empleado
    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }
//Creamos los metodos get y setter para que el programa pueda encontrar los datos que se introduzcan
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }
// Creamos el metodo override para que muestre el mensaje en la teminal al  ejercutarlo
    @Override
    public String toString() {
        return "Empleado: " + nombre +
                ", salario: " + salario +
                ", departamento: " + departamento;
    }
}
