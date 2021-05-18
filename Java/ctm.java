public class ctm {

    String atributo1;
    int atributo2;

    ctm(String atributo1, int atributo2){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }
    
    public static String getAtributo1(){
        return atributo1;
    }

    public static int getAtributo2(){
        return atributo2;
    }

    public static void setAtributo1(String nombre){
        this.atributo1 = nombre;
    }

    public static void setAtributo1(String numero){
        this.atributo2 = numero;
    }

}
