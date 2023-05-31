public class WorkingWithForLoop2 {

    public static void main(String[] args) {

        for (int i=10; i>0; i--){
            System.out.println("Ator to Grubas: " +i);

            /* jeden z wielu przykładów pętli nie skończonej

           for(int i =0; i>=0 i++){
           System.out.println("!");
           }
             */
        }

        for (int i =0; i<10; i++){
            int square = i*i;
            System.out.println("i= " + i + ", sq==" + square);
        }
           // nie działa bo square to zmienna blokowa = w bloku for
        // System.out.println(square);

    }
}
