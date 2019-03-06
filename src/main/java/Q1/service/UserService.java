package Q1.service;

import Q1.model.User;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class UserService {
    private List<User> userList = new LinkedList<>();

//    public void addUser(User user) {
//        if(!findByName(user)) {
//            userList.add(user);
//        } else {
//            System.out.println("This user already exist. Not added.");
//        }
//    }
//
//    public boolean findByName(Optional<User> user) {
//        return Optional.ofNullable(user)
//                .filter(person -> !userList.contains(person))
//                .orElse(Optional<>);
//    }
}
