package Proyecto.TapiceriaConfort.entities;

public class Customer extends Person{
    private long id;

    public Customer(String nombre,String email,int phoneNumber,long id){
        super(nombre,email,phoneNumber);
        this.id = id;
    }
    public void detailsCustomer(){{
        System.out.println("Detalles del cliente"+
                "\nNombre: "+nombre+
                "\nEmail: "+email+
                "\nNumero de telefono: "+phoneNumber+
                "\nId: "+id);
    }}
    public void buyProduct(){
        System.out.println("Compra producto");
    }
    public void requestService(){
        System.out.println("Solicitud de servicio");
    }
}
