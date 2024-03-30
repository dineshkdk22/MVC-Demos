package service;

import java.util.ArrayList;
import java.util.Collection;

import model.UserModel;

public interface UserService {

	int user(final UserModel User);

	String add(final UserModel add);

	ArrayList<String> collect(final UserModel list);

	ArrayList<String> update(final UserModel list);

	ArrayList<String> delete(final UserModel list);

	Collection<String> get(final UserModel list);
}
