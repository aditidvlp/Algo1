package scratches;

import java.util.Arrays;

public class Array {

    String[] topics;

    public Array(String[] initialTopics) {
        topics = initialTopics;
    }

    public static void main(String[] args) {
        Array feed;
        if (args[0].equals("Human")) {

            //topics for a Human feed:
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new Array(humanTopics);

        } else if(args[0].equals("Robot")) {

            //topics for a Robot feed:
            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new Array(robotTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new Array(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}
