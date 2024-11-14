// import java.util.ArrayList;
// import java.util.List;

public class Main {
    public static void main(String[] args){
        Network network = new Network();

        User alice = network.addUser("Alice");
        User bob = network.addUser("Bob");
        User viktori = network.addUser("Viktori");

        alice.addPost("Hello, this is Alice first post!");
        bob.addPost("Hello everyone, Bob is here!");
        viktori.addPost("Saya suka PBO!");

        network.addPost(alice.getPosts().get(0));
        network.addPost(bob.getPosts().get(0));
        network.addPost(viktori.getPosts().get(0));
        
        bob.likePost(alice.getPosts().get(0));
        alice.likePost(bob.getPosts().get(0));
        viktori.likePost(alice.getPosts().get(0));
        alice.likePost(viktori.getPosts().get(0));
        

        network.showAllPosts();
    }
}