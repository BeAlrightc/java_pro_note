import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Æ´½Ó×Ö·û´® {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr = sc.next();
		Set<String> set = new HashSet<String>();
		for(int i=0;i<=arr.length();i++) {
			for(int j=i+1;j<=arr.length();j++) {
				String temp = arr.substring(i,j);
				set.add(temp);
			}
		}
		System.out.println(set.size());

	}

}
