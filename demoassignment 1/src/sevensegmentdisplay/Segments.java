package sevensegmentdisplay;

public class Segments {
    private char a;
    private char b;
    private char c;
    private char d;
    private char e;
    private char f;
    private char g;
    private char h;


    private Segments(char a, char b, char c, char d, char e, char f, char g, char h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }

    public boolean display(){
        return this.h == 1;
    }



}
