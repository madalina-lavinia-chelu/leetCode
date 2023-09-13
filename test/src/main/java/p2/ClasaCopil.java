package p2;

import p1.ClasaCuAtributeProtected;

public class ClasaCopil extends ClasaCuAtributeProtected{
    public static void main(String[] args) {
        ClasaCuAtributeProtected clasaCuAtributeProtected = new ClasaCuAtributeProtected();
       // clasaCuAtributeProtected.varstaProtected;


        ////
        ClasaCopil clasaCopil = new ClasaCopil();
        clasaCopil.varstaProtected = 3;
       // clasaCopil.varstaDefault =3;
    }

}
