/*
la cual deberá contener como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario.
 */
package pooej6extra;

/**
 *
 * @author Invitado
 */
public class Ahorcado {

    private String[] palabra;
    
    private int letrasEncontradas;
    
    private int maxJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int maxJugadas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.maxJugadas = maxJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getMaxJugadas() {
        return maxJugadas;
    }

    public void setMaxJugadas(int maxJugadas) {
        this.maxJugadas = maxJugadas;
    } 

}
