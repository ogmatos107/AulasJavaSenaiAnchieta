package Aula04;

public class exemplo {
    public static void main(String[] args) {

        int x = 62;
        if (x < 30) {
            System.out.println(x + " maior que 30\n");
        } else {
            System.out.println(x + " menor que 30\n");
        }
        //exemplo 02

        String corpal = "verde";

        if (corpal == "verde") {
            System.out.println("vai\n");
        } else if (corpal == "amarelo") {
            ;
            System.out.println("atenção\n");
        } else if (corpal == "vermelho") {
            System.out.println("pare\n");
        } else {
            System.out.println("esta cor não tem no meu semáforo.\n");
        }
        //exemplo2.1

        String corpa = "verde";

        if ((corpa == "verde") || corpa == "Verde") {
            System.out.println("vai\n");
        } else if (corpa == "amarelo") {
            ;
            System.out.println("atenção\n");
        } else if (corpa == "vermelho") {
            System.out.println("pare\n");
        } else {
            System.out.println("esta cor não tem no meu semáforo.\n");
        }
        //exemplo03

        int idade = 15;

        if (idade >= 0 && idade <= 12) {
            System.out.println("criança\n");
        } else if (idade > 12 && idade < 18)
            System.out.println("adolescente\n");
        else if (idade >= 18 && idade < 65)
            System.out.println("adulto\n");
        else if (idade >= 65 &&  idade <=150)
            System.out.println("idoso\n");
        else
            System.out.println("idade invalida\n");{}{}

        //exemplo 04

        int exem=55;
        boolean r;

        r= exem<50 ? true:false;
        System.out.println(r+"\n");

        //exemplo 05

int preco= 100;
float desconto;

desconto = preco>80? 0.5f : 0;

        System.out.println("desconto= "+ (preco-desconto*preco+"\n"));

        //exemplo 06 switch

        corpal="verde";
        switch (corpal)
        {
            case "verde":
                System.out.println("vai\n");
                break;
            case "amarelo":
                    System.out.println("calmou\n");
                break;
            case "vermelho":
                System.out.println("perai\n");
                break;
            default:
                System.out.println("essa cÔ não existe\n");
        }

        //exemplo 07 menu

        int opcao= 2;
        System.out.println("escolha uma opção\n");
        System.out.println("digite 01 para falar com o diabo");
        System.out.println("digite 02 para falar com o Neymar");
        System.out.println("digite 03 para falar com bolsonaro\n");

        switch (opcao)
        {
            case 1:
                System.out.println("preciso do seu sangue");
                break;
            case 2:
                System.out.println("fala vida");
                break;
            case 3:
                System.out.println("imbroxavél");
            default:
                System.out.println("nao tem essa opcao");

        }
    }
}



