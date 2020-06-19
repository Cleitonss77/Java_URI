import java.util.Scanner; 

public class BibliotecaTeste{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int solicitacao;
        String livro;
        Biblioteca l1;
        Biblioteca l2;
        Biblioteca l3;
        Biblioteca l4;
        Biblioteca l5;



        l1 = new Biblioteca("Senhor dos Aneis","Tolkien",1950,"Fantasia",7,7,false);
        l2 = new Biblioteca("Harry Potter","JK Rolling",1990,"Fantasia",5,7,false);
        l3 = new Biblioteca("Calculo Vetorial","Sem mae",1050,"Terror",4,7,true);
        l4 = new Biblioteca("Programacao Java","Isidro",1990,"didatico",3,7,false);
        l5 = new Biblioteca("Fisica III","Sapiroto",1050,"Didatico",2,7,false);


        System.out.println("Escolha um livro (l1,l2,l3,l4 ou l5");
        livro = input.nextLine();


        System.out.println("Para verificar emprestimos digite 1, para solicitar emprestimo digite 2:");
        solicitacao = input.nextInt();
        
        if (solicitacao == 1)
        {    
            if (l1.getEmprestimo())     
            System.out.printf("O livro esta emprestado\n");
            else
            System.out.printf("O livro esta disponivel\n");
        }else {
            l1.setEmprestimo(true);
            System.out.printf("O livro "+livro+ " foi emprestado com sucesso!!");
        }

    

    }

}