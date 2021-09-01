import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HuffmanEncoding hufcode = new HuffmanEncoding();
        ArrayList<String> ans = new ArrayList<>();
        System.out.println("Enter length of character array");
        int N = sc.nextInt();
        char arr[] = new char[N];
        int freq[] = new int[N];
        System.out.println("Enter character array:");
        for(int i = 0; i<N; i++) {
            arr[i] = sc.next().charAt(0);
        }

        System.out.println("Enter frequency of each character in string");
        for(int i = 0; i<N; i++)
        {
            freq[i] = sc.nextInt();
            sc.next();
        }
        String str = new String(arr);
        ans = hufcode.huffmanCodes(str,freq,N);

        for(int i = 0; i<ans.size(); i++)
        {
            System.out.println(str.charAt(i) + " " + ans.get(i));
        }
    }
}
