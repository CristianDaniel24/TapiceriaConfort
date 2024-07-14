package Proyecto.TapiceriaConfort.entities;

public class Provider extends Person{

    private String companyName;
    private String address;

    public Provider(String nombre,String email,int phoneNumber,String companyName,String address){
        super(nombre,email,phoneNumber);
        this.companyName = companyName;
        this.address = address;
    }

    public void detailsProvider(){{
        System.out.println("Detalles del proveedor"+
                "\nNombre: "+nombre+
                "\nEmail: "+email+
                "\nNumero de telefono: "+phoneNumber+
                "\nDireccion: "+address);
    }}

    public void supplyProduct(){
        System.out.println("Suministro del Producto");
    }







}
