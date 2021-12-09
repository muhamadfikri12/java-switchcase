import java.util.Scanner;

class Forum9 {
	public static void main(String args[]){

		char nilai;
		Scanner input = new Scanner(System.in);

		System.out.print("Input Nilai Anda (A - E): ");
		nilai = input.next().charAt(0);

		switch (nilai) {
		case 'A':
			System.out.println("Pertahankan!");
			break;
		case 'B':
			System.out.println("Harus lebih baik lagi");
			break;
		case 'C':
			System.out.println("Perbanyak belajar");
			break;
		case 'D':
			System.out.println("Jangan keseringan main game");
			break;
		case 'E':
			System.out.println("Jangan kebanyakan bolos...");
			break;
		default:
			System.out.println("Maaf, format nilai tidak sesuai");
		}

	}
}