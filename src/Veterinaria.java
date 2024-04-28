import java.util.ArrayList;

public class Veterinaria {
    private ArrayList<Animal> listaAnimales;
    private ArrayList<Cliente> listaClientes;

    public Veterinaria() {
        listaClientes = new ArrayList<>();
        listaAnimales = new ArrayList<>();
    }

   
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }

    public void asignarConsulta(Animal animal, Consulta consulta) {
        animal.agregarConsulta(consulta);
    }


    public void imprimirConsultas(){
        for (Animal animal : listaAnimales) {
            for (Consulta consulta : animal.getHistorialConsultas()) {
                System.out.println(consulta.getMotivo() + " " + consulta.getFecha() + " " + consulta.getDiagnostico());
            }
        }
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }    
}
