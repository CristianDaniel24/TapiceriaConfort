package Proyecto.TapiceriaConfort.entities;

public class Employee extends Person{
    private String position;
    private Double salary;

    public Employee(String nombre,String email,int phoneNumber,String position,Double salary){
        super(nombre,email,phoneNumber);
        this.position = position;
        this.salary = salary;
    }
    public void detailsEmployee(){{
        System.out.println("Detalles del empleado"+
                "\nNombre: "+nombre+
                "\nEmail: "+email+
                "\nNumero de telefono: "+phoneNumber+
                "\nPosicion: "+position+
                "\nSalario: "+salary);
    }}
    //ARREGLAR NOMBRE
    public void performSeriv(){
        System.out.println("Servicio Empleado");
    }
}
