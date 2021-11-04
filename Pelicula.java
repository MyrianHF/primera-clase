public class Pelicula {
    
    // Nombre del director
    private String director;
    // N�mero de actores
    private int numeroActores;
    // Pel�cula terminada
    private boolean peliculaTerminada;

    /**
     * Crea pel�cula con director, n�mero de actores y su estado.
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
     * Devuelve el n�mero de actores
     */
    public int getNumeroActores() {
        return numeroActores;
    }  

    /**
     * Devuelve el estado de la pel�cula
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
     * Establece el n�mero de actores actuales
    */
    public void setNumeroActoresActual(int numeroActoresActual) {
        numeroActores = numeroActoresActual;
    }   
    
    /**
     * Establece el estado de la pel�cula actual
     */
    public void setEstadoPelicula(boolean nuevoEstadoPelicula) {
        peliculaTerminada = nuevoEstadoPelicula;
    }   
    
    /**
     * A�ade el n�mero de actores nuevos
     */
    public void modificarNumeroActores(int nuevosActoresIncorporados) {
        numeroActores = numeroActores + nuevosActoresIncorporados;
    }  

    /**
     * Cambia el estado de la pel�cula
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
     * Imprime detalles pel�cula
     */
    public void imprimirDetalles() {
        System.out.println("Director: " + director + " / N�mero total de actores actuales: " + numeroActores + " / Pel�cula terminada: " + peliculaTerminada);
    }
    
    /**
     * Explica el estado de la pel�cula
     */
    public String estadoActualPelicula() {
        String estadoActualPelicula = director + numeroActores + peliculaTerminada;
        return estadoActualPelicula;
    }
}