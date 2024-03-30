package controller;

import java.util.ArrayList;
import java.util.Collection;

import impl.UserImpl;
import service.UserService;
import model.UserModel;

public class UserController {
	private final UserService userControl = new UserImpl();

	public int user(final UserModel user) {
		return userControl.user(user);
	}

	public String add(final UserModel add) {
		return userControl.add(add);

	}

	public ArrayList<String> collect(final UserModel list) {
		return userControl.collect(list);

	}

	public ArrayList<String> update(final UserModel detail) {
		return userControl.update(detail);

	}

	public ArrayList<String> delete(final UserModel list) {
		return userControl.delete(list);

	}

	public Collection<String> get(final UserModel list) {
		return userControl.get(list);

	}
}
