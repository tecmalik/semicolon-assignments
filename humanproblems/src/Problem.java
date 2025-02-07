import problem.Type;

public class Problem {
    private String name;
    private Type type;
    private boolean isSolved;

    public Problem(String name, Type type) {
        this.name = name;
        this.type = type;
        this.isSolved = false;
    }

    public boolean isSolved() {
        return isSolved;
    }



}