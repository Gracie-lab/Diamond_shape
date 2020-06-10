public class Diamond {
        public static void main(String... args){
            int rows = 27;
            int spaces = rows/2;
            int stars = 1;
            int midPoint = rows/2+1;
            for(int i = 1; i<=rows; i++){
                for(int  j = 1; j <=spaces; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k<=stars; k++){
                    System.out.print("*");
                }
                if(i<midPoint){
                    spaces--;
                    stars+=2;}
                else{
                    spaces++;
                    stars-=2;
                }
                System.out.println("");
            }

        }
    }

