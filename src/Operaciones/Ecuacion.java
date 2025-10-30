package Operaciones;

public class Ecuacion {
    private int A;
    private int B;
    private int C;
    private boolean ecuacionCoreecta;
    private String mensajeError;
    //constructor

    public Ecuacion(){
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.ecuacionCoreecta= false;
        this.mensajeError= "";
    }

    public Ecuacion(int a, int b, int c) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.ecuacionCoreecta= false;
        this.mensajeError= "";
    }

    //Agregue solo lectura para: ecuacion correcta y mensaje de red


    public String getMensajeError() {
        return mensajeError;
    }

    public boolean isEcuacionCoreecta() {
        return ecuacionCoreecta;
    }

    private double discriminante(){
        return  ((B * B) - (4 * A * C));
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }

    public void setA(int a) {
        A = a;
    }

    public void setB(int b) {
        B = b;
    }

    public void setC(int c) {
        C = c;
    }

    public double CalcularX1(){
        double d = discriminante();
        double x1=0;
        if (A == 0){
            x1 = (-B + Math.sqrt(d))/(2*A);
            this.ecuacionCoreecta = false;
            this.mensajeError = "Imposible dividir para 0";
            return  0;
        }
        if (d >= 0){
            x1 = (-B + Math.sqrt(d))/(2*A);
            this.ecuacionCoreecta = true;
            this.mensajeError = "";
        }
        else {
            this.ecuacionCoreecta = false;
            this.mensajeError = "Error: no se puede calcular la raiz cuadrada de un numero negartivo";
        }
        return  x1;

    }
    public double CalcularX2(){
        double d = discriminante();
        double x2=0;
        if (A == 0){
            x2 = (-B - Math.sqrt(d))/(2*A);
            this.ecuacionCoreecta = false;
            this.mensajeError = "Imposible dividir para 0";
            return  0;
        }
        if (d >= 0){
            x2 = (-B + Math.sqrt(d))/(2*A);
            this.ecuacionCoreecta = true;
            this.mensajeError = "";
        }
        else {
            this.ecuacionCoreecta = false;
            this.mensajeError = "Error: no se puede calcular la raiz cuadrada de un numero negartivo";
        }
        return  x2;


    }
}