package impl;

import java.util.ArrayList;
import java.util.Collection;

import model.UserModel;
import service.UserService;

public class UserImpl implements UserService {

	private static final ArrayList<String> store = new ArrayList<>();
	private static final ArrayList<UserModel> userlist = new ArrayList<>();
	private static final ArrayList<String> read = new ArrayList<>();

	public int user(final UserModel User) {
		userlist.add(User);
		return User.getPassword();
	}

	public String add(final UserModel add) {
		store.addAll(add.getFood());
		return store.get(add.getCartlist());

	}

	public ArrayList<String> collect(final UserModel list) {
		read.add(list.getCart());
		return read;
	}

	public Collection<String> get(final UserModel list) {
		return read;

	}

	public ArrayList<String> update(final UserModel list) {
		read.remove(list.getRemove());
		read.add(store.get(list.getAdd()));
		return read;

	}

	public ArrayList<String> delete(final UserModel list) {
		read.clear();
		list.setList(read);
		return read;

	}
}