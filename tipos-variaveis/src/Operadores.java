public class Operadores {
    public static void main(String[] args) {
        

        String nomeUm = "Cristóvão";
        String nomeDois = new String("Cristóvão");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numero1 é igual a numero2? " + "numero1 " + numero1 + " " + " numero2 " + numero2 + " " + simNao);


        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente do numero2? " + "numero1 " + numero1 + " " + " numero2 " + numero2 + " " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 é maior que o numero2? " + "numero1 " + numero1 + " " + " numero2 " + numero2 + " " + simNao);
    }
}
