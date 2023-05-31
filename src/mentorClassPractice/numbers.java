package mentorClassPractice;

public class numbers {

    public static void main(String[] args) {

        String DBy15 = "";
        String DBy5 = "";
        String DBy3 = "";

        for (int i = 0; i <= 100; i++) {

            if(i % 15 == 0){
                DBy15 += i + " ";
            }

            if (i %5 == 0 && i %15 !=0 ){
                DBy5 += i +" ";
            }

            if (i %3 == 0 && i %15 != 0 ){
                DBy3 += i + " ";
            }


        }


        System.out.println("Divisivle by 15: " + DBy15);
        System.out.println("Divisivle by 5: " + DBy5);
        System.out.println("Divisivle by 3: " + DBy3);



    }


}

