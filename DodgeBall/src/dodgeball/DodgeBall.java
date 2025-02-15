// DodgeBall.java 
// Autor: José Alexander Brenes Brenes
//        Juan Daniel Quirós
// El programa consiste en un juego en el que se controla el rebote de una
// bola con una raqueta, para así obtener o perder puntos si rebota en las zonas
// definidas.

package dodgeball;

import dodgeball.presentacion.Controller;
import dodgeball.presentacion.View;
import dodgeball.presentacion.Model;

public class DodgeBall {

    public static void main(String[] args) throws InterruptedException {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        view.setVisible(true);
        for (;;) {
            model.avanzar();
            try {
                Thread.sleep(42);
            } catch (InterruptedException e) {

            }
        }
        
    }

}
