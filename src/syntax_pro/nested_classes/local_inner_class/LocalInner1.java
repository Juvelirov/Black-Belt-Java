package syntax_pro.nested_classes.local_inner_class;

import org.w3c.dom.ls.LSOutput;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math{


    public void getResult(){


        class Delenie{

            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getDelitel() {
                return delitel;
            }

            public int getChastnoe(int delimoe, int delitel){
                return delimoe / delitel;
            }

            public int getOstatok(int delimoe, int delitel){
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println(delenie.getChastnoe(delenie.getDelimoe(), delenie.getDelitel()));
    }



}