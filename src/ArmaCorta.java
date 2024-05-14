public class ArmaCorta extends Arma {
    private boolean automatica;

    public ArmaCorta(Policia policia, int municiones, int alcance, String marca, double calibre, String estado, boolean automatica) {
        super(policia, municiones, alcance, marca, calibre, estado);
        this.automatica = automatica;
    }

    public boolean isAutomatica() {
        return automatica;
    }

    public boolean puedeDispararALargaDistancia() {
        return getAlcance() > 200;
    }

    @Override
    public int compareTo(ArmaCorta armaCorta) {
        return 0;
    }
}