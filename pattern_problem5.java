import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("""
        Printing pattern like : (whatever row, same number * but reversed)
        ......
        * * * * * 
        * * * * 
        * * * 
        * * 
        * 
        """);
        System.out.print("Enter how many rows you want to get printed:");
        int row = s.nextInt();
        printPattern(row);
    }
    public static void printPattern(int rows){
        for(int i = rows; i>0;i--){
            for(int j=0;j<i;j++){
               System.out.print("*" + " ");
             }
            System.out.println();
        }
    }
}
