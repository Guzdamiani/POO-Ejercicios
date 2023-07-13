/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package pooej07;

/**
 *
 * @author Invitado
 */
public class POOEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaServicios ps = new PersonaServicios();

        //Crear personas y llamar metodos correspondientes:
        Persona[] vectorPersonas = new Persona[4];
        int[] indice = new int[4];
        boolean[] esMayor = new boolean[4];

        for (int i = 0; i < 4; i++) {

            vectorPersonas[i] = ps.crearPersona();
            indice[i] = ps.calcularIMC(vectorPersonas[i]);
            esMayor[i] = ps.esMayorDeEdad(vectorPersonas[i]);

        }

        for (int i = 0; i < 4; i++) {
            System.out.println("[" + indice[i] + "]");
        }
        
        //Calcular porcentajeGregos
        float cantidadDebajo = 0;
        float cantidadEncima = 0;
        float cantidadIdeal = 0;
        float mayores = 0;
        float menores = 0;

        for (int i = 0; i < 4; i++) {

            switch (indice[i]) {
                case -1:
                    cantidadDebajo++;
                    break;
                case 0:
                    cantidadIdeal++;
                    break;
                case 1:
                    cantidadEncima++;
                    break;
            }

            if (esMayor[i]) {
                mayores++;
            } else {
                menores++;
            }

        }

        System.out.println("");
        System.out.println("El porcentaje de personas mayores de edad es " + mayores / 4 * 100 + "%.");
        System.out.println("");
        System.out.println("El porcentaje de personas menores de edad es " + menores / 4 * 100 + "%.");
        System.out.println("");
        System.out.println("El porcentaje de personas tienen un peso por debajo del ideal " + cantidadDebajo / 4 * 100 + "%.");
        System.out.println("");
        System.out.println("El porcentaje de personas tienen un peso por debajo del ideal " + cantidadEncima / 4 * 100 + "%.");
        System.out.println("");
        System.out.println("El porcentaje de personas tienen un peso por debajo del ideal " + cantidadIdeal / 4 * 100 + "%.");

        
    }
}
