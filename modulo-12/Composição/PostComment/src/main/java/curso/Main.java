package curso;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime momentPost1 = LocalDateTime.parse("21/06/2018 13:05:44", formatter);
        LocalDateTime momentPost2 = LocalDateTime.parse("28/07/2018 23:14:19", formatter);

        List<Post> posts = new ArrayList<>();
        Post post1 = new Post(momentPost1, "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        post1.addComment(new Comment("Have a nice trip"));
        post1.addComment(new Comment("Wow that's awesome!"));
        posts.add(post1);

        Post post2 = new Post(momentPost2, "Good night guys", "See you tomorrow", 5);
        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));
        posts.add(post2);

        System.out.println(post1);
        System.out.println(post2);
    }
}