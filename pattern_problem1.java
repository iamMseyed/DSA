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
        printPattern(row);
    }
    public static void printPattern(int count){
        for(int i = 0; i<count;i++){
            for(int j = 0;j<count;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

