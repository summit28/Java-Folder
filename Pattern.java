public class Pattern {

    public static void isstar(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void reverse_star(int n){
            for(int i=n; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
    }

    public static void inverted_rotated_half_pyramid(int n){
            for(int i=1; i<=n; i++){
                //spaces
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                //star
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
    }

    public static void half_pyramid_num_pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void char_pattern(int n){
        char ch='A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }

    public static void Hollow_Rec_Pattern(int rows, int colms){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=colms; j++){
                if( i==1 || i==rows ||  j==1 || j==colms){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                } 
        }
        System.out.println("");
    }
    }

    public static void inverted_rotated_half_pyramid_num(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i+1; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    }    
    public static void main(String[] args) {
    //isstar(4);
    //reverse_star(4);
    //inverted_rotated_half_pyramid(4);
    // half_pyramid_num_pattern(4);
    //char_pattern(4);
    // Hollow_Rec_Pattern(4,5);
    //inverted_rotated_half_pyramid_num(5);
    }
    
}
