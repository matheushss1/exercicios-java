public class DayOfWeek {
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

        if(day == 0){
            System.out.println("Domingo");
        } else if(day == 1) {
            System.out.println("Segunda-Feira");
        } else if(day == 2){
            System.out.println("Terça-Feira");
        } else if (day == 3) {
            System.out.println("Quarta-Feira");
        } else if (day == 4){
            System.out.println("Quinta-Feira");
        } else if (day == 5){
            System.out.println("Sexta-Feira");
        } else if (day == 6){
            System.out.println("Sábado");
        } else {
            System.out.println("Dia inválido");
        }
    }
}
