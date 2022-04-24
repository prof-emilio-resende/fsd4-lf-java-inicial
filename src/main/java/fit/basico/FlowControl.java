package fit.basico;

public class FlowControl {

    public static void experimentar() {
        System.out.println("Iniciando FlowControl...");
        Integer numero = 200;
        Boolean ePar = ((numero % 2) == 0);

        System.out.printf("numero %d e par: %s%n", numero, ePar);

        if (ePar) {
            switch (numero) {
                case (2):
                    System.out.println("Numero e == 2");
                    break;
                case (3):
                    System.out.println("Numero e == 3");
                    break;
                case (4):
                    System.out.println("Numero e == 4");
                    break;
                default:
                    System.out.println("Nao sei que numero e este...");
            }
        }

        switch (numero) {
            case 2 -> System.out.println("2!");
            default -> System.out.println("outra coisa");
        }

        String numeroTexto = numero.toString();
        System.out.println("imprimindo digitos do nro...");

        for (int i = 0; i < numeroTexto.length(); i++) {
            System.out.printf("valor do digito (%d) -> %s%n", i, numeroTexto.charAt(i));
        }

        for (char letra : numeroTexto.toCharArray()) {
            System.out.printf("valor -> %s%n", letra);
        }

        int whileI = 0;
        do {
            System.out.printf("valor do digito usando while (%d) -> %s%n", whileI, numeroTexto.charAt(whileI));
        } while (++whileI < numeroTexto.length());
    }

}