package view;

import model.UserModel;
import controller.UserController;
import java.util.ArrayList;
import java.util.Scanner;

public class UserView {

	private static final Scanner scanner = new Scanner(System.in);
	private static final UserController control = new UserController();
	private static final UserModel userinfo = new UserModel();
	private static final UserView userview = new UserView();

	private void createUser() {
		System.out.println("Enter Your Number : ");
		final long number = scanner.nextLong();

		userinfo.setNumber(number);
		System.out.println("Enter Your Name : ");
		final String name = scanner.next();

		userinfo.setName(name);
		System.out.println("Create Your Password : ");
		final int password = scanner.nextInt();
		userinfo.setNumber(number);

		System.out.println("Confirm Your Password5 : ");
		int check = scanner.nextInt();
		if (password == check) {
			control.user(userinfo);
			System.out.println("Account Created Succesfully !!! ");

			display();
		} else {
			System.out.println("Wrong Password Please Try Again ");
			createUser();
		}

	}

	private void get() {
		System.out.println(control.get(userinfo));
	}

	private void delete() {
		System.out.println(control.delete(userinfo));
	}

	private void change() {
		System.out.println(userinfo.getList());
		System.out.println("Select the food items you want to replace : ");

		userinfo.setRemove(scanner.nextInt());
		System.out.println("Select the food items do you want to add : ");

		userinfo.setAdd(scanner.nextInt());
		System.out.println("The new updated cart is ");
		System.out.println(control.update(userinfo));
	}

	private void display() {
		System.out.println("Welcome : " + userinfo.getName());
		System.out.println("Select Your Preffered Hotel !!! ");

		String stores = "1.A2B\n2.Hakkims\n3.ssHydrabath\n4.Sangeetha's\n5.MuruganIdly";
		System.out.println(stores);

		food(scanner.nextInt());
		System.out.println(userinfo.getFood());

		come();
		System.out.println("Your Cartlist : ");
		System.out.println(userinfo.getList());
	}

	public void come() {
		System.out.println("Which food items do you want to add : ");
		userinfo.setCartlist(scanner.nextInt());
		userinfo.setCart(control.add(userinfo));
		System.out.println(userinfo.getCartlist());

		userinfo.setList(control.collect(userinfo));
		System.out.println("Do you want to add more food press x");
		if (scanner.next() == "x") {
			come();
		}
	}

	public void food(int userinput) {
		final ArrayList<String> food = new ArrayList<>();
		userinfo.setFood(food);

		switch (userinput) {
		case 1:

			food.add("");
			food.add("Idly");
			food.add("Dosa");
			food.add("Pongal");
			food.add("Poori");
			food.add("Upma");
			break;
		case 2:

			food.add("");
			food.add("Chicken Biriyani");
			food.add("Chicken Tikka");
			food.add("Mutton Curry");
			food.add("Prawn Fry");
			food.add("Fish Curry");
			break;
		case 3:

			food.add("");
			food.add("Mutton briyani");
			food.add("chicken briyani");
			food.add("fried rice");
			food.add("chili chickken");
			food.add("noodelss");
			break;
		case 4:

			food.add("");
			food.add("idly");
			food.add("dosa");
			food.add("poori");
			food.add("pongal");
			food.add("chapathi");
			food.add("idiyappam");
			break;
		case 5:

			food.add("");
			food.add("Mini idly");
			food.add("podi Idly");
			food.add("ghee idly ");
			food.add("chilli idly");
			food.add("medhuvada");
			break;
		default:

		}

	}

	public static void main(String[] args) {
		userview.createUser();
		final int option = scanner.nextInt();

		switch (option) {
		case 1:
			userview.createUser();
			break;

		case 2:
			userview.delete();
			break;

		case 3:
			userview.change();
			break;

		case 4:
			userview.get();
			break;

		case 5:
			userview.out();
		default:
			System.out.println("");

		}

	}

	private void out() {
		System.out.println("ThankYou");
	}

}
