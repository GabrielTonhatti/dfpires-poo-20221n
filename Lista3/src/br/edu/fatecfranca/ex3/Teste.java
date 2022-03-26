package br.edu.fatecfranca.ex3;

public class Teste {

	public static void main(String[] args) {
		Post post = new Post(100, "Guerra na Ucrânia", "Fulano");
		Comment comment1 = new Comment(101, "Muito triste ver as crianças passando por isso", "Beltrano");
		Comment comment2 = new Comment(102, "Tomara que acabe logo", "Ciclano");
		Comment comment3 = new Comment(103, "E tudo fica bem", "João");

		post.addComment(comment1);
		post.addComment(comment2);
		post.addComment(comment3);
		post.darLike();
		post.darLike();
		System.out.println(post.mostrar());
		post.removeComment(comment1);
		post.tirarLike();
		System.out.println(post.mostrar());
	}

}
