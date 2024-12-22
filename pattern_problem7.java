import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("""
        Printing * diamond
        """);
        System.out.print("Enter how many rows you want to get printed:");
        int row = s.nextInt();
        printPattern(row);
    }
    public static void printPattern(int rows){
        for(int i = 0;i<rows;i++){
            for(int j=0;j<(rows-i)-1;j++) // space
                System.out.print(" ");
            for(int j=0;j<(2*i)+1;j++) // *
                System.out.print("*");
            for(int j=0;j<(rows-i)-1;j++) // space
                System.out.print(" ");
        System.out.println();
        }
    }
}
