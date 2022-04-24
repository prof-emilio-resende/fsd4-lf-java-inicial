package fit.basico;

public class Types {
    public static void experimentar() {
        System.out.println("experimentar ...");
        int inteiro = 10;
        Integer inteiroObj = 10;
        System.out.println(inteiroObj.toString()); 

        int inteiroPrimitivo = Integer.valueOf(20);
        System.out.println(inteiroPrimitivo);

        // boxing
        inteiroObj = inteiro;

        // unboxing
        inteiro = inteiroObj;

    }
}
