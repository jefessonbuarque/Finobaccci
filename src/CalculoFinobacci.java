import java.util.Scanner;

public class CalculoFinobacci {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n1 = 0, n2 = 1, n3 = 0, i ;
		System.out.println("sequencia finobacci: 0, 1, 2, 3, 5, 8, 13, 21, 34...");
		System.out.println("Digite uma sequencia da finobacci:");
		i = scan.nextInt();

		while (i > n3) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

		}

		if (i == 0) {
			System.out.println("O n�mero 0 est� na sequencia finabacci, o proxima sequencia finabacci � 1");
		}

		else if (i == n3) {
			System.out.println(
					"O n�mero " + i + " est� na sequencia finabacci, o proxima sequencia finabacci �:" + (n1 + i));
		}

		else {
			System.err.println("ERRO!!!, este n�mero que voc� digitou, n�o faz parte da sequ�ncia finobacci");
		}

	}

}
