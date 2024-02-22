//Crea un'interfaccia Shape e un metodo draw
// crea 2 o più classi che implementino Shape.
//Crea una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo etc etc)
//Crea una factory class che abbia un metodo che ritorni la forma corretta (shape)
// in base all'enum in input.
//Stampa a video il risultato della funzione draw di ogni shape creata

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory1;
        shapeFactory1 = new ShapeFactory();
        Shape cerchio1 = shapeFactory1.shapeCreate(ShapeEnum.CERCHIO);
        Shape triangolo1 = shapeFactory1.shapeCreate(ShapeEnum.TRIANGOLO);
        Shape rettangolo1 = shapeFactory1.shapeCreate(ShapeEnum.RETTANGOLO);
        Shape quadrato1 = shapeFactory1.shapeCreate(ShapeEnum.QUADRATO);

        if (quadrato1 != null) {
            quadrato1.draw();
        } else System.out.println("invalid shape");

        if (triangolo1 != null) {
            triangolo1.draw();
        } else {
            System.out.println("invalid shape");
        }

        if (rettangolo1 != null) {
            rettangolo1.draw();
        } else {
            System.out.println("invalid shape");
        }

        if (cerchio1 != null) {
            cerchio1.draw();
        } else {
            System.out.println("invalid shape");
        }
    }
}