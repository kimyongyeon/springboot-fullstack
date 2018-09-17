package com.study.full.stack.fullstack_project;

import org.hibernate.Transaction;

public class UserServiceImple implements UserService {

    public UserServiceImple(Transaction transaction) {}

    @Override
    public boolean isServiceUp() {
        return false;
    }

    @Override
    public void save(User user) {
        System.out.println("UserServiceImple");
    }
}
