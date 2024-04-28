public class Main {
    public static void main(String[] args) {

        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria

        Veterinaria vet = new Veterinaria();

        // Crear dos clientes

        Cliente clie1 = new Cliente("Fany", "Bertamirans", "789008078");
        Cliente clie2 = new Cliente("Riki", "Brion", "978768792");

        // Agregar clientes a la veterinaria
        vet.agregarCliente(clie1);
        vet.agregarCliente(clie2);

        // Crear dos animales
        Animal a1 = new Animal("Leo", "Perro", "Pincher", clie1);
        Animal a2 = new Animal("Shiba", "Perro", "Gran danés", clie2);


        // Agregar animales a la veterinaria
        vet.agregarAnimal(a1);
        vet.agregarAnimal(a2);


        //Crear un veterinario 
        Veterinario veterinario1 = new Veterinario("Aurora", "Animales domésticos");


        // Crear una consulta
        Consulta consulta = new Consulta("26/09/2004", "Desparasitación", "Pulgas", "Pastillas", veterinario1);


        // Asignar la consulta a un animal
        a1.agregarConsulta(consulta);

        //Imprimir todas las consultas de los animales de la clínica 
        vet.imprimirConsultas();
    }
}