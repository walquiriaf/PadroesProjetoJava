import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgrssivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Test {
    public static void main(String[] args) {

        // Singleton

    //    SingletonLazy lazy = SingletonLazy.getInstancia();
    //    System.out.println(lazy);
    //    lazy = SingletonLazy.getInstancia();
    //    System.out.println(lazy);

    //    SingletonEager eager = SingletonEager.getInstancia();
    //    System.out.println(eager);
    //    eager = SingletonEager.getInstancia();
    //    System.out.println(eager);

    //    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    //    System.out.println(lazyHolder);
    //    lazyHolder = SingletonLazyHolder.getInstancia();
    //    System.out.println(lazyHolder);
//
    //    /*Statregy*/
//
    //    Comportamento normal = new ComportamentoNormal();
    //    Comportamento defensivo = new ComportamentoDefensivo();
    //    Comportamento agressivo = new ComportamentoAgrssivo();
//
    //    Robo robo = new Robo();
//
    //    robo.setComportamento(normal);
    //    robo.mover();
    //    robo.mover();
//
    //    robo.setComportamento(defensivo);
    //    robo.mover();
    //    robo.mover();

    //    robo.setComportamento(agressivo);
    //    robo.mover();
    //    robo.mover();

        /* Facade */
        Facade facade = new Facade();
        facade.migrarCliente("Wal", "12345678");
    }
}
