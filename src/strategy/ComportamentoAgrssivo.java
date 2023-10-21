package strategy;

public class ComportamentoAgrssivo implements Comportamento {
    
    @Override
    public void mover() {
        System.out.println("Movendo-se agrssivamente.");
    }
}