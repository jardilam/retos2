package co.utp.misiontic2022;

public class PrecioTotal {
    // Atributos
    private Double tAlimentos;
    private Double tRefrescos;
    private Double tCarnicos;
    private Alimentos listaAlimentos[];

    // Constructores
    public PrecioTotal() {
        this.tAlimentos = 0.0;
        this.tRefrescos = 0.0;
        this.tCarnicos = 0.0;
    }

    public PrecioTotal(Alimentos listaAlimentos[]){
        this.tAlimentos = 0.0;
        this.tRefrescos = 0.0;
        this.tCarnicos = 0.0;
        this.listaAlimentos = listaAlimentos;
    }

    // Metodo mostrar Total
    public void mostrarTotal(){
        for(Alimentos x: listaAlimentos) {
            if (x instanceof Alimentos) {
                tAlimentos = tAlimentos + x.calcularPrecio(); //ERROR
            }
        }
        for(Alimentos b: listaAlimentos) {
            if (b instanceof Refrescos) {
                tRefrescos = tRefrescos + b.calcularPrecio();
            }
        }
        for(Alimentos c: listaAlimentos) {
            if (c instanceof Carnicos) {
                tCarnicos = tCarnicos + c.calcularPrecio();
            }
        }

        // Codigo calculo de total
        System.out.println("El precio total de los Productos Alimentos es de " + tAlimentos);
        System.out.println("La suma del precio de las Refrescos es de " + tRefrescos);
        System.out.println("La suma del precio de los Cárnicos es de " + tCarnicos);
    } 
}