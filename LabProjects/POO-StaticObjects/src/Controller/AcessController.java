package Controller;

import javax.swing.*;
import java.util.ArrayList;

public class AcessController {
        private String user;
        private static ArrayList<String> userAcessList;
        private static int counter = 0;

        public AcessController(String user){
            this.user = user;
            userAcessList = new ArrayList<String>();
            userAcessList.add(user);
            if (user != null){
                counter++;
            }
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public static ArrayList<String> getUserAcessList() {
            return userAcessList;
        }

        public static void setUserAcessList(String user) {
            AcessController.userAcessList = userAcessList;
            if (userAcessList.contains(user) && user != null) {
                counter++;
            }
            if (userAcessList.contains(user) == false && user != null) {
                userAcessList.add(user);
                counter++;
            }
        }

        public static int getCounter() {
            return counter;
        }

        public static void setCounter(int counter) {
            AcessController.counter = counter;
        }
    }

