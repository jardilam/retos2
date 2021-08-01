package co.utp.misiontic2022;

public class Carnicos extends Alimentos {
    // Atributos
    private Integer TEMPERATURA = 10;
    private Integer temperatura;

    // Contructores
    public Carnicos(){
        this.temperatura = TEMPERATURA;
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        
    }
    public Carnicos(Double precioBase, Integer peso){
        super(precioBase, peso);
    }

    public Carnicos(Double precioBase, Integer peso, Integer temperatura){
        super(precioBase, peso);
        this.temperatura = temperatura;
    }

    public Double calcularPrecio(){
        // Variables:
        double adicion = 0;
        double adicionT = 0;
        double precioFinal = 0;
        
        // Método:
        if (temperatura == null) {
            this.temperatura = TEMPERATURA; // La temperatura tomaría el valor
            // de TEMPERATURA
        } 
        if (temperatura >= 5 && temperatura < 10) {
            // Se adiciona 20$:
            adicionT = 20;
        } else if (temperatura >= 10 && temperatura <= 15) {
            // Se adiciona 18$:
            adicionT = 18;
        } else if (temperatura > 15) {
            // Se adiciona 5$
            adicionT = 5;
        }

        adicion = adicionT + peso;
        // Codigo calcular precio final
        precioFinal = precioBase + adicion;
        return precioFinal;
    }
}
