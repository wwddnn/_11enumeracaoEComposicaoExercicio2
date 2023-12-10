package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Instanciar um formato de data customizado. Vou especificar a minha máscara dentro desse método.
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //Criei os 2 objetos comment.
        Comment c1 = new Comment("Have a nice trip ! ");
        Comment c2 = new Comment("How that's awesome ! ");

        //Criei o objeto p1 que é um Post.
        //No atributo data, chamo o método sdf1.parse para ele transformar essa String que foi digitada em um formato de data customizado.
        Post p1 = new Post(sdf1.parse("21/06/2018 13:05:44"), "Traveling in New Zealand",  "I'm goind to visit this wonderful country !", 12);

        //Vou colocar os objetos Comment c1 e c2 dentro do objeto Post p1.
        p1.addComment(c1);
        p1.addComment(c2);

        //Exibir o meu objeto p1 e os comentários que estão associados a esse objeto p1.
        System.out.println(p1);

        System.out.println("-----------------------------------------------------------------");
        //Agora vou criar o segundo objeto Post, que nesse caso é o objeto de nome p2.
        Post p2 = new Post(sdf1.parse("20/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5  );

        //Criar os comentários para esse objeto Post p2.
        Comment c3 = new Comment("Good night !");
        Comment c4 = new Comment("May the force be with you !");

        //Colocar os objetos Comment c2 e c3 dentro do objeto Post c2.
        p2.addComment(c3);
        p2.addComment(c4);

        //Exibir o meu objeto Post p2 e os comentários que estão associados a esse objeto p2.
        System.out.println(p2);







    }
}
