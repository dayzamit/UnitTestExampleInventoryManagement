package com.leapfrog.inventorymanagementsystem.presenters;

import android.util.Log;

import com.leapfrog.inventorymanagementsystem.contracts.LoginActivityContract;

import org.junit.Test;

/**
 * Presenter for login activity
 * Handle all the actions of login view via {@link LoginActivityContract}
 */
public class LoginActivityPresenter implements LoginActivityContract.UserInteractions {
    String username = "zeppelin";
    String password = "asdf";

    LoginActivityContract.Views loginActivityView;

    public LoginActivityPresenter(LoginActivityContract.Views loginActivityView) {
        this.loginActivityView = loginActivityView;
    }

    /**
     * Method to check the username and password and determine login success or failure
     */
    public void login() {

        String userName = loginActivityView.getUsername();
        String password = loginActivityView.getPassword();

        if (userName.isEmpty()) {
            loginActivityView.setUsernameError();
        } else if (password.isEmpty()) {
            loginActivityView.setPasswordError();
        } else {
            if (userName.toLowerCase().contentEquals(this.username) && password.toLowerCase().contentEquals(this.password)) {
                loginActivityView.loginSuccess();
            } else {
                loginActivityView.loginFailure();
            }
        }

    }

    @Override
    public void attemptLogin() {
        login();
    }

    public Boolean  checkConnection(){
        System.out.println("check");
        return  true;
    }

}
