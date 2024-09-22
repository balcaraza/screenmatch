import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaLanzamiento(2021);
        miPelicula.setDuracion(120);
        miPelicula.setIncluidoEnPlan(true);
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7);

        System.out.println("EL total de evaluaciones es: " + miPelicula.getTotalEvaluaciones());
        System.out.println("La puntuacion media es de: " + miPelicula.calculaMedia());




        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del Dragón");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporada(1);
        casaDragon.setMinutosEpisodio(50);
        casaDragon.setEpisiodiosTemporada(10);
        System.out.println(casaDragon.getDuracion());
       casaDragon.muestraFichaTecnica();

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaLanzamiento(1998);
        otraPelicula.setDuracion(180);

       CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
       calculadora.incluye(miPelicula);
       calculadora.incluye(casaDragon);
       calculadora.incluye(otraPelicula);
       System.out.println("Tiempo estimado para ver los titulos elegidos: " + calculadora.getTiempoTotal() + " minutos");


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa de los famosos");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);


    }
}
