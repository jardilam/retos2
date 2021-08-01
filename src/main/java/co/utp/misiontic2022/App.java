package co.utp.misiontic2022;

public class App
{
    public static void main( String[] args ) {
        //Ejemplo1:

        Alimentos listaAlimentos1[] = new Alimentos[5]; 
        listaAlimentos1[0] = new Alimentos(); 
        listaAlimentos1[1] = new Refrescos(120.2,8,'N'); 
        listaAlimentos1[2] = new Carnicos(210.0,60); 
        listaAlimentos1[3] = new Refrescos(120.0,10,'i'); 
        listaAlimentos1[4] = new Carnicos(190.0,10);

        PrecioTotal solucion1 = new PrecioTotal(listaAlimentos1); 
        solucion1.mostrarTotal();


        //Ejemplo2:
        /*
        Alimentos listaAlimentos2[] = new Alimentos[10]; 
        listaAlimentos2[0] = new Alimentos(12.0,5,'N'); 
        listaAlimentos2[1] = new Alimentos();
        listaAlimentos2[2] = new Refrescos(25.4,40,'i'); 
        listaAlimentos2[3] = new Carnicos();
        listaAlimentos2[4] = new Refrescos(30.0,3); 
        listaAlimentos2[5] = new Carnicos(14.2,190,12); 
        listaAlimentos2[6] = new Carnicos(87.2,450,21); 
        listaAlimentos2[7] = new Refrescos(43.9,70,'N'); 
        listaAlimentos2[8] = new Carnicos();
        listaAlimentos2[9] = new Carnicos();

        PrecioTotal solucion2 = new PrecioTotal(listaAlimentos2); 
        solucion2.mostrarTotal();
        */
    }
}