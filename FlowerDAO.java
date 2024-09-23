package com.evergent.corejava.store.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.evergent.corejava.store.bean.FlowerBean;


public class FlowerDAO {
    public void addFlower(FlowerBean flower) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO flower_store (flowerId, flowerName, quantity, price) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, flower.getFlowerId());
            pstmt.setString(2, flower.getFlowerName());
            pstmt.setInt(3, flower.getQuantity());
            pstmt.setDouble(4, flower.getPrice());
            pstmt.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showInventory() {
        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT * FROM flowe_store";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Flower ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) +
                                   ", Quantity: " + rs.getInt(3) + ", Price: " + rs.getDouble(4));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void purchaseFlower(int flowerId, int quantity) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "UPDATE flower_store SET quantity = quantity - ? WHERE flowerId = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, quantity);
            pstmt.setInt(2, flowerId);
            pstmt.executeUpdate();
            con.close();
            System.out.println("Flower purchased successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
