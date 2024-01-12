
package TD3;

public class PointEx1 {
    public void PointEx1 (int x, int y) { this.x = x ; this.y = y ; }
    public void deplace (int dx, int dy) { x += dx ; y += dy ; }
    public int getX() { return x ; }
    public int getY() { return y ; }
    private int x, y ;
}
class PointA extends PointEx1 {
    void affiche()
    { System.out.println ("Coordonnees : " + getX() + " " + getY()) ;
    }
    public static void main (String args[])
    { PointEx1 p = new PointEx1 () ;
        p.PointEx1 (2, 5);
        System.out.println ("Coordonnees : " + p.getX() + " " + p.getY() ) ;
        PointA pa = new PointA () ;
        pa.PointEx1 (1, 8);
        pa.affiche() ;}
}
/*Si la classe Point n’avait pas disposé des méthodes d’accès getX et getY,
il n’aurait pas été possible d’accéder à ses champs privés x et y depuis la classe PointA.
Il n’aurait donc pas été possible de la doter de la méthode affiche.
L’héritage ne permet pas de contourner le principe d’encapsulation.*/