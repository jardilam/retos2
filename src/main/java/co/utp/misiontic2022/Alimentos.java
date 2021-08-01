package co.utp.misiontic2022;

public class Alimentos {
    // Atributos:

    private static final char TIPO_ALIMENTO = 'N';
    protected static final double PRECIO_BASE = 80.0;
    public static final int PESO_BASE = 5;
    
    public double precioBase;
    public int peso;
    public char tipoAlimento;
    
    // Contructores:

    public Alimentos(){
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.tipoAlimento = TIPO_ALIMENTO;
    }

    public Alimentos(Double precioBase, Integer peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.tipoAlimento = TIPO_ALIMENTO;
    }

    public Alimentos(Double precioBase, Integer peso, char tipoAlimento){
        this(precioBase, peso);
        comprobarTipoAlimento(tipoAlimento);
    }

    
    public void comprobarTipoAlimento(char tipoAlimento){
        this.tipoAlimento = tipoAlimento;
        if (tipoAlimento == 0){ // REVISAR si se evalua igual a 0?
            this.tipoAlimento = TIPO_ALIMENTO;
        } else {
            this.tipoAlimento = tipoAlimento;
        }
    }

    public Double calcularPrecio(){
        // Variables:

        double adicionP = 0;
        double adicion_tA = 0;
        double adicion = 0;
        double precioFinal = 0;

        // Métodos:

        if (precioBase == 0){
            this.precioBase = PRECIO_BASE;
        } 

        if (peso >= 1 && peso <= 9) {
            // Se adicionar:
            adicionP = 6;
        } else if (peso > 9 && peso <= 16) {
            // Se adiciona:
            adicionP = 8;
        } else if (peso > 16) {
            // Se adicionar
            adicionP = 20;
        }
        // Condicion validar tipo de alimento N,C
        if (tipoAlimento == 'N') {
            adicion_tA = 40;
        } else if (tipoAlimento == 'C') {
            adicion_tA = 20;
        } else if (tipoAlimento == /* null */) {

        }

        adicion = adicionP + adicion_tA;
        precioFinal = precioBase + adicion;
        return precioFinal;
    }
}
