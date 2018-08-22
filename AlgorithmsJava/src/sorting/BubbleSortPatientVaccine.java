package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortPatientVaccine {
	public static void main(String[] args) {
		BubbleSortPatientVaccine bb = new BubbleSortPatientVaccine();
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] mcpatients = new int[n];
		for (int i = 0; i < mcpatients.length; i++) {
			mcpatients[i] = scan.nextInt();
		}
		int[] vaccinestregth = new int[n];
		for (int i = 0; i < vaccinestregth.length; i++) {
			vaccinestregth[i] = scan.nextInt();
		}
		System.out.println(bb.checkPatientsVaccine(mcpatients, vaccinestregth));
		scan.close();
	}
	String checkPatientsVaccine(int[] mcpatients,int[] vaccinestregth) {
        Arrays.sort(mcpatients);
        Arrays.sort(vaccinestregth);
        for (int i = 0; i < vaccinestregth.length; i++) {
			if(vaccinestregth[i]<mcpatients[i]) {
				return "No";
			}
		}
		return "Yes";
	}
}
