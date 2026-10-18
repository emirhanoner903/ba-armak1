import java.util.Scanner;

public class olucak {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Basit Hesap Makinesi");
		System.out.println("Çıkmak için q yazın.");

		while (true) {
			System.out.print("\nİlk sayıyı girin: ");
			if (scanner.hasNext("q")) {
				break;
			}
			if (!scanner.hasNextDouble()) {
				System.out.println("Geçerli bir sayı girin.");
				scanner.next();
				continue;
			}
			double ilkSayi = scanner.nextDouble();

			System.out.print("İşlemi girin (+, -, *, /): ");
			String islem = scanner.next();
			if (islem.equalsIgnoreCase("q")) {
				break;
			}

			System.out.print("İkinci sayıyı girin: ");
			if (!scanner.hasNextDouble()) {
				System.out.println("Geçerli bir sayı girin.");
				scanner.next();
				continue;
			}
			double ikinciSayi = scanner.nextDouble();
			double sonuc;

			switch (islem) {
				case "-":
					sonuc = ilkSayi - ikinciSayi;
					break;
				case "*":
					sonuc = ilkSayi * ikinciSayi;
					break;
				
                
						continue;
					}
					sonuc = ilkSayi / ikinciSayi;
					break;
				default:
					System.out.println("Geçersiz işlem.");
					continue;
			}

			System.out.println("Sonuç: " + sonuc);
		}

		scanner.close();
		System.out.println("Hesap makinesi kapatıldı.");
	}


