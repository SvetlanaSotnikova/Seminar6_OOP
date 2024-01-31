package lsp1.shape;

public class Square extends Quadritateral {

    int side;

    public Square(int side) {
        this.side = side;
    }


    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }
}
