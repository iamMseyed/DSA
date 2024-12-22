import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("""
        Printing pattern like : (whatever row, same number)
        1
        2 2
        3 3 3
        4 4 4 4
        ......
        """);
        System.out.print("Enter how many rows you want to get printed:");
        int row = s.nextInt();
        printPattern(row);
    }
    public static void printPattern(int rows){
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<=i;j++){
               System.out.print((i+1)+ " ");
            }
            System.out.println();
        }
    }
}
