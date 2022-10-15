package switchDemo;

public class main {

	public static void main(String[] args) {
		
		char grade='C';
		
		switch(grade) {
		case 'A':
			System.out.println("Mukemmel : Gectiniz");
			break;
		case 'B':
			System.out.println("Cok iyi : Gectiniz");
			break;
		case 'C':
			System.out.println("İyi : Gectiniz");
			break;
		case 'D':
			System.out.println("Fena Degil : Gectiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
			default:
				System.out.println("Lutfen gecerli bir not giriniz");
		}

	}

}
