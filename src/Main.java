//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Policia policia1 = new Policia("Juan", "Pérez", 1234);
        ArmaCorta armaCorta = new ArmaCorta(policia1, 10, 50, "Glock", 9.5, "EN USO", true);
        ArmaLarga armaLarga = new ArmaLarga(policia1, 20, 100, "Remington", 12.7, "EN USO", true, "Uso policial", 3);

        System.out.println("Arma corta en condiciones: " + armaCorta.estaEnCondiciones());
        System.out.println("Arma corta puede disparar a larga distancia: " + armaCorta.puedeDispararALargaDistancia());

        System.out.println("Arma larga en condiciones: " + armaLarga.estaEnCondiciones());
        System.out.println("Arma larga tiene sello RENAR: " + armaLarga.tieneSelloRENAR());
        // Crear un objeto de la clase Policia con los datos del policía asignado
        Policia policiaAsignado = new Policia("Oscar", "Gomez", 62451);

        // Asignar el objeto de la clase Policia a las armas cortas y largas
        armaCorta = new ArmaCorta(policiaAsignado, 10, 50, "Glock", 9.5, "EN USO", true);
        armaLarga = new ArmaLarga(policiaAsignado, 20, 100, "Remington", 12.7, "EN USO", true, "Uso policial", 3);

        //caso
        System.out.println(" ----Se abre el caso----");

        // datos del policía asignado
        System.out.println("Policía asignado:");
        System.out.println("Nombre: " + policiaAsignado.getNombre());
        System.out.println("Apellido: " + policiaAsignado.getApellido());
        System.out.println("Legajo: " + policiaAsignado.getLegajo());

        // armas cortas y largas
        System.out.println("Arma corta:");
        System.out.println("Municiones: " + armaCorta.getMuniciones());
        System.out.println("Alcance: " + armaCorta.getAlcance());
        System.out.println("Marca: " + armaCorta.getMarca());
        System.out.println("Calibre: " + armaCorta.getCalibre());
        System.out.println("Estado: " + armaCorta.getEstado());
        System.out.println("Automática: " + armaCorta.isAutomatica());

        System.out.println("Arma larga:");
        System.out.println("Municiones: " + armaLarga.getMuniciones());
        System.out.println("Alcance: " + armaLarga.getAlcance());
        System.out.println("Marca: " + armaLarga.getMarca());
        System.out.println("Calibre: " + armaLarga.getCalibre());
        System.out.println("Estado: " + armaLarga.getEstado());
        System.out.println("Tiene sello RENAR: " + armaLarga.tieneSelloRENAR());
        System.out.println("Descripción uso: " + armaLarga.getDescripcionUso());
        System.out.println("Nivel: " + armaLarga.getNivel());


 if (armaLarga.compareTo(armaCorta) > 0) {
        System.out.println("La arma larga es mayor que la arma corta.");
    } else if (armaLarga.compareTo(armaCorta) < 0) {
        System.out.println("La arma corta es mayor que la arma larga.");
    } else {
        System.out.println("Las armas cortas y largas son iguales.");
    }
}



}




