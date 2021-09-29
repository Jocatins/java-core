import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Stud implements Comparable<Stud>{
    int rollNo , score;
    String name;

    public Stud(int rollNo, String name, int score){
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
    }
    public String toString(){
        return "Stud [rollNo ="+ rollNo + "name =" + name + " score=" + score + " ]";
    }
    public int compareTo(Stud sty){
        //return score> sty.score ? 1 : -1 ;
        return name.length() > sty.name.length() ? 1 : -1;
    }
}


public class CollectionsDemo {

    public static void main(String[] args) {
        List<Stud> st = new ArrayList<>();
        st.add(new Stud(56, "sphinx", 90));
        st.add(new Stud(6, "titan", 56));
        st.add(new Stud(56, "candace", 79));
        st.add(new Stud(56, "jenny", 60));

        Collections.sort(st);

        for(Stud s: st){
            System.out.println(s);
        }
    }
}
