import Operaciones.Ecuacion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    IO.println(String.format("Ejercicios de aplicación!"));

    // Caso 1: valores iniciales válidos
    Ecuacion ecuacion = new Ecuacion(1, 4, 4);
    ecuacion.CalcularX1();
    ecuacion.CalcularX2();

    if (ecuacion.isEcuacionCoreecta()) {
        System.out.printf("\nEl valor de x1 es %f", ecuacion.CalcularX1());
        System.out.printf("\nEl valor de x2 es %f", ecuacion.CalcularX2());
    } else {
        IO.println(ecuacion.getMensajeError());
    }

    // Caso 2: cambiar valores y volver a calcular
    ecuacion.setA(1);
    ecuacion.setB(-3);
    ecuacion.setC(2);
    ecuacion.CalcularX1();
    ecuacion.CalcularX2();

    IO.println("\n\nRecalculando con nuevos valores:");
    if (ecuacion.isEcuacionCoreecta()) {
        System.out.printf("\nEl nuevo valor de x1 es %f", ecuacion.CalcularX1());
        System.out.printf("\nEl nuevo valor de x2 es %f", ecuacion.CalcularX2());
    } else {
        IO.println(ecuacion.getMensajeError());
    }

    // Caso 3: división por cero (a = 0)
    Ecuacion ecuacionDivCero = new Ecuacion(0, 5, 1);
    ecuacionDivCero.CalcularX1();
    ecuacionDivCero.CalcularX2();

    IO.println("\n\nCaso de división por cero:");
    if (ecuacionDivCero.isEcuacionCoreecta()) {
        System.out.printf("\nEl valor de x1 es %f", ecuacionDivCero.CalcularX1());
        System.out.printf("\nEl valor de x2 es %f", ecuacionDivCero.CalcularX2());
    } else {
        IO.println(ecuacionDivCero.getMensajeError());
    }

    // Caso 4: raíz cuadrada negativa (discriminante < 0)
    Ecuacion ecuacionRaizNegativa = new Ecuacion(1, 2, 5);
    ecuacionRaizNegativa.CalcularX1();
    ecuacionRaizNegativa.CalcularX2();

    IO.println("\n\nCaso de raíz cuadrada negativa:");
    if (ecuacionRaizNegativa.isEcuacionCoreecta()) {
        System.out.printf("\nEl valor de x1 es %f", ecuacionRaizNegativa.CalcularX1());
        System.out.printf("\nEl valor de x2 es %f", ecuacionRaizNegativa.CalcularX2());
    } else {
        IO.println(ecuacionRaizNegativa.getMensajeError());
    }
}
