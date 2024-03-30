package model;

import java.util.ArrayList;
import java.util.Collection;

public class UserModel {
	private long number;
	private String name;
	private int password;
	private Collection<String> opinion;

	private String food;
	private ArrayList<String> list;
	private int cartlist;
	private int add;
	private int remove;

	public Collection<String> getFood() {
		return opinion;
	}

	public void setFood(Collection<String> opinion) {
		this.opinion = opinion;
	}

	public String getCart() {
		return food;
	}

	public void setCart(String food) {
		this.food = food;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public int getCartlist() {
		return cartlist;
	}

	public void setCartlist(int cartlist) {
		this.cartlist = cartlist;
	}

	public int getAdd() {
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public int getRemove() {
		return remove;
	}

	public void setRemove(int remove) {
		this.remove = remove;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
}
