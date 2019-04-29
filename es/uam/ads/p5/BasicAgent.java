package es.uam.ads.p5;


/**
 * Clase BasicAgent, implementa la Interfaz IBasicAgent
 * @author David Quintana Ruiz, Victor Sanchez de la Roda Nuñez
 */

public class BasicAgent implements IBasicAgent {

    /**
     * Celda
     */
    private Cell celda;

    /**
     * Nombre de la celda
     */
    private String nombre;

    /**
     * Constructor de BasicAgent
     * @param nombre nombre de la celda
     */
    public BasicAgent(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve una celda donde esta ubicado el BasicAgent
     * @return Celda devuelta
     */
    @Override
    public Cell cell() {
        return celda;
    }

    /**
     * Sirve para realizar una copia del agente
     * @return Dicha copia
     */
    @Override
    public IBasicAgent copy() {
        BasicAgent copia = new BasicAgent(nombre);
        copia.celda = this.celda;
        return copia;
    }
}
