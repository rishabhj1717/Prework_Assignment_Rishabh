import java.util.Scanner;

class PatternPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
    }
    
    static void patternPrinter(int n) {
        for(int i=0; i<n; i++){
            int k = n;
            for(int j=0;j<n; j++){
                int count=0;
                while(count<(n-i)){
                    System.out.print(k+" ");
                    count++;
                }
                k--;
            }
            System.out.println();
        }
    }
    }