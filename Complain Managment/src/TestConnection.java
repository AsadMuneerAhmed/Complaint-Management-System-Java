/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asad Ali
 */
import database.DBConnection;
import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection c = DBConnection.getConnection();
        if (c != null)
            System.out.println("Connected OK");
        else
            System.out.println("Connection FAILED");
    }
}


