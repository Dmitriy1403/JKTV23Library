package ee.ivkhkdev.helpers;

import ee.ivkhkdev.model.User;
import ee.ivkhkdev.interfaces.Input;

import java.util.List;

public class AppHelperUser implements AppHelper<User>{
    private final Input input;
    private final List<User> users;

    public AppHelperUser(Input input, List<User> users) {
        this.input = input;
        this.users = users;
    }
    @Override
    public User create(){
        User user = new User();
        System.out.print("Имя: ");
        user.setFirstname(input.nextLine());
        System.out.print("Фамилия: ");
        user.setLastname(input.nextLine());
        System.out.print("Телефон: ");
        user.setPhone(input.nextLine());
        System.out.print("email: ");
        user.setEmail(input.nextLine());
        return user;
    }
    @Override
    public void printList() {
        if (users.isEmpty()) {
            System.out.println(" --- Список читателей пуст --- ");
        } else {
            System.out.println(" --- Список читателей --- ");
            for (int i = 0; i < users.size(); i++) {
                System.out.printf("%d. %s. %s. %s. %s%n",
                        i + 1,
                        users.get(i).getFirstname(),
                        users.get(i).getLastname(),
                        users.get(i).getPhone(),
                        users.get(i).getEmail()
                );
            }
            System.out.println(" --- Конец списка --- ");
        }
    }

    @Override
    public List<User> getList() {
        return users;
    }
}
