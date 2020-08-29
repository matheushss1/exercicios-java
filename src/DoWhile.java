public class DoWhile {
    public static void main(String[] args) {
        int count = 0;
        while(count != 5){
            System.out.println("O valor do contador é " + count);
            count++;
        }
        // FAZ A MESMA COISA QUE:
        for(int i = 1; i<5; i++){
            System.out.println(i);
        }
        // Simplificando:
        int contador = 0;
        while(true){
            if(contador == 5){
                break;
            }
            System.out.println("O valor é " + contador);
            contador++;
        }
    }
}

