public class ShapeFactory {
    public Shape shapeCreate(ShapeEnum shapeType1){
        return switch (shapeType1){
            case TRIANGOLO -> new Triangolo();
            case RETTANGOLO -> new Rettangolo();
            case QUADRATO -> new Quadrato();
            case CERCHIO -> new Cerchio();
        };
    }
}
