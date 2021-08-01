package co.utp.misiontic2022;

public class Refrescos extends Alimentos {
    // Atibutos:
    
    private char lugarOrigen;
    private static final char LUGAR_ORIGEN = 'N';
    
    // Constructores:

    public Refrescos(){
        super();
        this.lugarOrigen = LUGAR_ORIGEN;
    }

    public Refrescos(double precioBase, Integer peso){
        // Metodo:
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Refrescos(Double precioBase, Integer peso, char lugarOrigen){ 
        // Metodo:
        super(precioBase, peso);
        comprobarLugarOrigen(lugarOrigen);
    }

    public void comprobarLugarOrigen(char lugarOrigen){ 
        // Metodo:
        this.lugarOrigen = lugarOrigen;
        if (lugarOrigen == 0) {
            this.lugarOrigen = LUGAR_ORIGEN;
        } else {
            this.lugarOrigen = lugarOrigen;
        }
    }

    public Double calcularPrecio(){

        //Variables:
        double adicion = 0;
        double adicionLo = 0;
        double precioFinal = 0;

        // Metodo:
        // Condicion validar lugar de origen N,I:

        if (lugarOrigen == 'N') {
            adicion = 5;
        } else if (lugarOrigen == 'i') {
            adicion = 15;
        }

        adicion = adicionLo + peso;
        precioFinal = precioBase + adicion;
        return precioFinal;
    }
}