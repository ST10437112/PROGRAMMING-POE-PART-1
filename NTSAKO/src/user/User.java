/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package user;
public class User {
    private String username;
    private String password;
    private String cellPhone;
    private String email;

    public User(String username, String password, String cellPhone, String email) {
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
        this.email = email;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
}