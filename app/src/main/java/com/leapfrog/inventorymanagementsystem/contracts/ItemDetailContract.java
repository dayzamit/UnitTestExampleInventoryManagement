package com.leapfrog.inventorymanagementsystem.contracts;

import com.leapfrog.inventorymanagementsystem.models.Item;

/**
 * Interface to fetch view from main activity for main activity presenter
 */
public interface ItemDetailContract {
    int getQuantity();

    String getItemCode();

    void purchaseSuccessful();

    void purchaseFailure();

    interface UserInteractions{
        void addToCart(Item item);
    }

}
