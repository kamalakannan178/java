package jk;
import java.util.Scanner;
public class sk07 {

	public static void main(String[] args) {
int arr[]={5,10,15,20};
int sum=0;
for(int num:arr){
	sum= sum+num;
	sum+= num;
}
System.out.println("sum="+sum);
	}

}
