public class Switch {
    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was neither 1 or 2");
//        }

        int switchValue = 1;
        switch (switchValue){
            case 1 :
                System.out.println("Valor é 1");
                break;
            case 2 :
                System.out.println("Valor é 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Valor é 3, 4 ou 5");
                System.out.println("No caso, é " + switchValue);
                break;
            default:
                System.out.println("Não é 1, 2, 3, 4 nem 5");
                break;
        }

        char letra = 'A';
        switch (letra){
            case 'A':
                System.out.println("A letra é A");
                break;
            case 'B':
                System.out.println("A letra é B");
                break;
            case 'C':
                System.out.println("A letra é C");
                break;
            case 'D':
                System.out.println("A letra é D");
                break;
            case 'E':
                System.out.println("A letra é E");
                break;
            case 'F': case 'G': case 'H': case 'I':
                System.out.println("A letra é "+ letra);
                break;
            default:
                System.out.println("Não é nenhuma das letras: A, B, C, D, E, F, G, H, I");
                break;
        }

        String mes = "Janeiro";
        switch (mes.toLowerCase()) {
            case "janeiro": case "fevereiro": case "março" : case "abril" : case "maio" :
                System.out.println("Mês é " + mes);
                break;
            case "junho": case "julho": case "agosto": case "setembro": case "outubro":
                System.out.println("Passou da metade do ano. Mês é " + mes);
                break;
            case "novembro": case "dezembro":
                System.out.println("Chegou o fim do ano. Mês é " + mes);
                break;
            default:
                System.out.println("Não é um mês válido");
        }
    }
}
