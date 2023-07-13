/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 */
package pooej13;

/**
 *
 * @author Invitado
 */
public class POOEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Curso c1 = new Curso();
        CursoServicios cs = new CursoServicios();

        cs.crearCurso(c1);

        int ganancia = cs.calcularGananciaSemanal(c1);

        System.out.println("La ganancia semanal es " + ganancia + "$.");

    }

}
