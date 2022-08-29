import java.util.Scanner;

class FirstLetterPrinter {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
    }

    static String firstLetterPrinter(String str) {
        String allFirstLetterStr=""+str.charAt(0);
        //Starting from index=1 as the firt character of the first word would always be at 0.
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)== ' '){
                allFirstLetterStr += str.charAt(i+1);
            }
        }

        return allFirstLetterStr;
    }
}