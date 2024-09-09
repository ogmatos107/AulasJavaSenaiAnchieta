package Aula04;

public class exemplo {
    public static void main(String[] args) {

        int x = 62;
        if (x < 30) {
            System.out.println(x + " maior que 30");
        } else {
            System.out.println(x + " menor que 30");
        }
        //exemplo 02

        String corpal = "verde";

        if (corpal == "verde") {
            System.out.println("vai");
        } else if (corpal == "amarelo") {
            ;
            System.out.println("atenção");
        } else if (corpal == "vermelho") {
            System.out.println("pare");
        } else {
            System.out.println("esta cor não tem no meu semáforo.");
        }
        //exemplo2.1

        String corpa = "verde";

        if ((corpa == "verde") || corpa == "Verde") {
            System.out.println("vai");
        } else if (corpa == "amarelo") {
            ;
            System.out.println("atenção");
        } else if (corpa == "vermelho") {
            System.out.println("pare");
        } else {
            System.out.println("esta cor não tem no meu semáforo.");
        }
        //exemplo03

        int idade = 15;

        if (idade >= 0 && idade <= 12) {
            System.out.println("criança");
        } else if (idade > 12 && idade < 18)
            System.out.println("adolescente");
        else if (idade >= 18 && idade < 65)
            System.out.println("adulto");
        else if (idade >= 65 &&  idade <=150)
            System.out.println("idoso");
        else
            System.out.println("idade invalida");{}{}

        //exemplo 04

        int exem=55;
        boolean r;

        r= exem<50 ? true:false;
        System.out.println(r);
        //exemplo 05

int preco= 100;
float desconto;

desconto = preco>80? 0.5f : 0;

        System.out.println("desconto= "+ (preco-desconto*preco));

    }
}



