public class Pelicula {
    
    // Nombre del director
    private String director;
    // Número de actores
    private int numeroActores;
    // Película terminada
    private boolean peliculaTerminada;

    /**
     * Crea película con director, número de actores y su estado.
     */
    public Pelicula(String nombreDirector, boolean peliculaFinalizada) {
        director = nombreDirector;
        numeroActores = 20;
        peliculaTerminada = peliculaFinalizada;
    }
    
    /**
     * Devuelve el nombre del director
     */
    public String getNombreDirector() {
        return director;
    }   
    
    /**
     * Devuelve el número de actores
     */
    public int getNumeroActores() {
        return numeroActores;
    }  

    /**
     * Devuelve el estado de la película
     */
    public boolean getPeliculaTerminada() {
        return peliculaTerminada;
    }  
    
    /**
     * Establece nombre director del nuevo director
     */
    public void setNombreDirector(String nombreNuevoDirector) {
        director = nombreNuevoDirector;
    }   
    
    /**
     * Establece el número de actores actuales
    */
    public void setNumeroActoresActual(int numeroActoresActual) {
        numeroActores = numeroActoresActual;
    }   
    
    /**
     * Establece el estado de la película actual
     */
    public void setEstadoPelicula(boolean nuevoEstadoPelicula) {
        peliculaTerminada = nuevoEstadoPelicula;
    }   
    
    /**
     * Añade el número de actores nuevos
     */
    public void modificarNumeroActores(int nuevosActoresIncorporados) {
        numeroActores = numeroActores + nuevosActoresIncorporados;
    }  

    /**
     * Cambia el estado de la película
     */
    public void cambioEstadoPelicula() {
        if (peliculaTerminada == true) {
            peliculaTerminada = false;
        }
        else {
            peliculaTerminada = true;
        }    
    }
    
    /**
     * Imprime detalles película
     */
    public void imprimirDetalles() {
        System.out.println("Director: " + director + " / Número total de actores actuales: " + numeroActores + " / Película terminada: " + peliculaTerminada);
    }
    
    /**
     * Explica el estado de la película
     */
    public String estadoActualPelicula() {
        String estadoActualPelicula = director + numeroActores + peliculaTerminada;
        return estadoActualPelicula;
    }
}