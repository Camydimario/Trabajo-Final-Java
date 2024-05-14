public abstract class Arma {
    private Policia policia;
    private int municiones;
    private int alcance;
    private String marca;
    private double calibre;
    private String estado;

    public Arma(Policia policia, int municiones, int alcance, String marca, double calibre, String estado) {
        this.policia = policia;
        this.municiones = municiones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public Policia getPolicia() {
        return policia;
    }

    public int getMuniciones() {
        return municiones;
    }

    public int getAlcance() {
        return alcance;
    }

    public String getMarca() {
        return marca;
    }

    public double getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

    public boolean estaEnCondiciones() {
        return estado.equals("EN USO") && calibre >= 9;
    }

    public abstract int compareTo(ArmaCorta armaCorta);
}