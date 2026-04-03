/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

public class ConfigUtil {

public static String getUsername() {
String username = System.getenv("APP_USERNAME");

if (username == null || username.isBlank()) {
username = "standard_user"; // local fallback
}

return username;
}
public static String getPassword() {
String password = System.getenv("APP_PASSWORD");

if (password == null || password.isBlank()) {
password = "secret_sauce"; // local fallback
}

return password;
}

public static String getBaseUrl() {
return "https://www.saucedemo.com/";
}


}
