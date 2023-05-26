package game;

import jdk.dynalink.beans.StaticClass;

public class  Die {

    private int numbrerFaces = 6;

    public Die(int numbrerFaces) {
        this.numbrerFaces = numbrerFaces;
    }

    public  Die() {
    }

    public int throwDie(){
        return this.generateRandomNumbers(1,this.numbrerFaces);

    }

    private int generateRandomNumbers(int minimo,int maximo){
        return (int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
    }

}
