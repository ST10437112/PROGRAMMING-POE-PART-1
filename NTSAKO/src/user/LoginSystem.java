/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

public class LoginSystem {
    private User registeredUser;

    public boolean register(String username, String password, String cellPhone, String email) {
        if (Validator.isValidUsername(username) &&
            Validator.isValidPassword(password) &&
            Validator.isValidCellPhone(cellPhone) &&
            Validator.isValidEmail(email)) {

            registeredUser = new User(username, password, cellPhone, email);
            return true;
        }
        return false;
    }

    public boolean login(String username, String password) {
        if (registeredUser == null) return false;
        return registeredUser.getUsername().equals(username) &&
               registeredUser.getPassword().equals(password);
    }
}
