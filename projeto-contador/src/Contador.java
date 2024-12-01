
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
        
        System.out.print("DIGITE O PRIMEIRO NÚMERO: ");
        int parametroUm = sc.nextInt();
        System.out.print("DIGITE O SEGUNDO NÚMERO: ");
        int parametroDois = sc.nextInt();
            
        contar(parametroUm, parametroDois);

        sc.close();
        
        } catch (InputMismatchException e){
            System.out.println("OS NÚMEROS DEVEM SER INTEIROS");
        } catch (Exception e) {
            System.out.println("O SEGUNDO PARAMETRO DEVE SER MAIOR QUE O PRIMEIRO");
        }
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            
            for (int i = 1; i <= contagem; i++){
                System.out.println("IMPRIMINDO NÚMERO " + i);
            }
        }
        
    }
}
