import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("""
        Printing pattern like : (n row n column)
        ****
        ****
        ****
        ****
        """);
        System.out.print("Enter number of rows and cols to be taken (enter for row or col, it would be considered same for both):");
        int row = s.nextInt();
        
        for(int i = 0; i<row;i++){
            for(int j = 0;j<row;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
