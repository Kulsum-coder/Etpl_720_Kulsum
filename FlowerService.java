package com.evergent.corejava.store.service;

import com.evergent.corejava.store.DAO.FlowerDAO;
import com.evergent.corejava.store.bean.FlowerBean;

public class FlowerService {
    FlowerDAO flowerDAO = new FlowerDAO();
    
    public void addFlower(int flowerId, String flowerName, int quantity, double price) {
        FlowerBean flower = new FlowerBean();
        flower.setFlowerId(flowerId);
        flower.setFlowerName(flowerName);
        flower.setQuantity(quantity);
        flower.setPrice(price);
        flowerDAO.addFlower(flower);
        System.out.println("Flower added successfully.");
    }

    public void showInventory() {
        flowerDAO.showInventory();
    }

    public void purchaseFlower(int flowerId, int quantity) {
        flowerDAO.purchaseFlower(flowerId, quantity);
    }
}
