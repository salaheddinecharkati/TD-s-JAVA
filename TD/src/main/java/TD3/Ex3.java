
package TD3;

public class Ex3 {
        public static void main(String[] args) {
            Point3 point = new Point3(1 , 2 );
            Centre centre = new Centre(2 , 3 , "o");
            Cercle cercle = new Cercle(2 , 3 , "c" , 3);
            point.affCoord();
            centre.affCoord();
            centre.affNom();
            cercle.affNom();
        }
    }