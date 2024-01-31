package lsp1.view;

import lsp1.shape.Quadritateral;

public class ShapeView {
    private final Quadritateral rectangle;

    public ShapeView(Quadritateral rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(rectangle.getArea());
    }
}
