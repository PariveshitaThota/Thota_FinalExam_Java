/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Pariveshita Thota
 */
        public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Pariveshita Thota - Question 2");

        GeometricObject[] go = new GeometricObject[5];
        go[0] = new Square(4);
        go[1] = new Square(7);
        go[2] = new Square(15);
        go[3] = new Square(6);
        go[4] = new Square(10);

        for (int i = 0; i < go.length; i++) {
            System.out.println("Area of square " + (i + 1) + " :" + go[i].calculateArea());
            if (go[i] instanceof Colorable) {
                ((Square) go[i]).howToColor();
            }
        }
    }
}

    
    

