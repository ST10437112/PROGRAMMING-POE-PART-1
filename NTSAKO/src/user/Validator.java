/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

public class Validator {

    public static boolean isValidUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public static boolean isValidPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+]).{8,}$");
    }

    public static boolean isValidCellPhone(String cellPhone) {
        return cellPhone.matches("^\\+27\\d{9}$");
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }
}