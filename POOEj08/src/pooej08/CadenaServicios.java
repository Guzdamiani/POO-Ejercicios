/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej08;

/**
 *
 * @author Invitado
 */
public class CadenaServicios {

    public void mostrarVocales(Cadena c) {

        int cantA = 0;
        int cantE = 0;
        int cantI = 0;
        int cantO = 0;
        int cantU = 0;

        for (int i = 0; i < c.getLongitud(); i++) {

            String letra = c.getCadena().substring(i, i + 1);
            letra = letra.toLowerCase();

            switch (letra) {
                case "a":
                    cantA++;
                    break;
                case "e":
                    cantE++;
                    break;
                case "i":
                    cantI++;
                    break;
                case "o":
                    cantO++;
                    break;
                case "u":
                    cantU++;
                    break;
            }
        }

        int suma = cantA + cantE + cantI + cantO + cantU;

        if (suma != 0) {
            System.out.println("En la cadena " + c.getCadena() + ", hay " + suma + " vocales.");
            System.out.println("A: " + cantA);
            System.out.println("E: " + cantE);
            System.out.println("I: " + cantI);
            System.out.println("O: " + cantO);
            System.out.println("U: " + cantU);
        } else {
            System.out.println("La cadena no posee vocales");
        }

    }

    public void invertirFrase(Cadena c) {

        System.out.println("La frase invertida se escribe de la siguiente manera:");
        System.out.println("");

        for (int i = c.getLongitud() - 1; i >= 0; i--) {

            System.out.print(c.getCadena().charAt(i));

        }

    }

    public void vecesRepetido(String letra, Cadena c) {

        int cantLetra = 0;

        for (int i = 0; i < c.getLongitud(); i++) {

            String posicion = c.getCadena().substring(i, i + 1);

            if (letra.equals(posicion)) {
                cantLetra++;
            }
        }

        switch (cantLetra) {
            case 0:
                System.out.println("La letra " + letra + " no se encuentra en la cadena.");
                break;
            case 1:
                System.out.println("La letra " + letra + " se encuentra una única vez en la cadena.");
                break;
            default:
                System.out.println("La letra " + letra + " se encuentra " + cantLetra + " veces en la cadena.");
                break;
        }
    }

    public void compararLongitud(String frase, Cadena c) {

        System.out.println("Longitud de `" + c.getCadena() + "`: " + c.getLongitud());
        System.out.println("Longitud de `" + frase + "`: " + frase.length());
        System.out.println("");

        if (c.getLongitud() > frase.length()) {

            System.out.println("`" + c.getCadena() + "` es mas larga que `" + frase + "`.");
            
        } else if (c.getLongitud() < frase.length()) {
            
            System.out.println("`" + frase + "` es mas larga que `" + c.getCadena() + "`.");

        } else {
            System.out.println("Ambas frasees tienen la misma longitud.");
        }
    }
    
    public void unirFrases(String frase, Cadena c) {
        
       String frasesUnidas = c.getCadena().concat(frase);
       
        System.out.println("Las frases unidas se escriben de la siguiente manera:");
        System.out.println(frasesUnidas);
        
    }
    
    public void reemplazar(String letra, Cadena c) {
        
        
        for (int i = 0; i < c.getLongitud(); i++) {

            String posicion = c.getCadena().substring(i, i + 1);

            if ("a".equals(posicion)) {
                System.out.print(letra);
            } else {
                System.out.print(posicion);
            }
        }
        
        System.out.println("");
        
    }
    
    public boolean contiene(String letra, Cadena c) {
        
        boolean contiene = false;
        
        for (int i = 0; i < c.getLongitud(); i++) {

            String posicion = c.getCadena().substring(i, i + 1);

            if (letra.equals(posicion)) {
                contiene = true;
                break;
            }
        }
        
        return contiene;
    }
}
