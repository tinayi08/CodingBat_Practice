package String1;

import java.util.ArrayList;

public class Like_Exercise {

    public static void main(String[] args) {

//        likes [] -- must be "no one likes this"
//        likes ["Peter"] -- must be "Peter likes this"
//        likes ["Jacob", "Alex"] -- must be "Jacob and Alex like this"
//        likes ["Max", "John", "Mark"] -- must be "Max, John and Mark like this"
//        likes ["Alex", "Jacob", "Mark", "Max"] -- must be "Alex, Jacob and 2 others like this"

        System.out.println(like(new String[]{"Jacob", "Alex", "Mark", "Max"}));
    }

    //method like() pass through array

    public static String like (String [] likes) {
        if (likes.length == 0) {
            return "No one likes this";
        } else if (likes.length == 1) {
            return likes[0] + " likes this";
        } else if (likes.length == 2) {
            return likes[0] + " and " + likes[1] + " likes this";
        } else if (likes.length == 3) {
            return likes[0] + ", " + likes[1] + ", and " + likes[2] + " like this";
        } else
            return likes[0] + ", " + likes[1] + ", and " + ((likes.length)-2) + " others like this";
    }
}
