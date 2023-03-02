import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrLength = scanner.nextInt();
		Long[] arr = new Long[arrLength];
		Long sum = 0L;
		for (int i = 0; i < arrLength; i++) {
			arr[i] = scanner.nextLong();
		}
		for (Long num : arr) {
			sum += num;
		}
		System.out.println(sum);
	}
}