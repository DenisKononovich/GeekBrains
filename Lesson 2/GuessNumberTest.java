import java.util.Scanner;

class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userResponse = "yes";

		while(userResponse.equals("yes")) {
			System.out.println("Игра 'Угадай число'");
			System.out.print("Введите имя первого игрока: ");
			Player playerOne = new Player();
			playerOne.setName(sc.next());
			System.out.print("Введите имя второго игрока: ");
			Player playerTwo = new Player();
			playerTwo.setName(sc.next());
			GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);		

			guessNumber.play();

			do {
				System.out.print("Хотите продолжить? [yes/no]: ");
				userResponse = sc.next();
			} while(!userResponse.equals("yes") && !userResponse.equals("no"));
		}
	}
}