public class ArmaLarga extends Arma implements Comparable<ArmaLarga> {
    private boolean tieneSelloRENAR;
    private String descripcionUso;
    private int nivel;

    public ArmaLarga(Policia policia, int municiones, int alcance, String marca, double calibre, String estado, boolean tieneSelloRENAR, String descripcionUso, int nivel) {
        super(policia, municiones, alcance, marca, calibre, estado);
        this.tieneSelloRENAR = tieneSelloRENAR;
        this.descripcionUso = descripcionUso;
        this.nivel = nivel;
    }

    public boolean tieneSelloRENAR() {
        return tieneSelloRENAR;
    }

    public String getDescripcionUso() {
        return descripcionUso;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public int compareTo(ArmaLarga otraArma) {
        return Integer.compare(this.nivel, otraArma.nivel);
    }

    @Override
    public int compareTo(ArmaCorta armaCorta) {
        return 0;
    }
}