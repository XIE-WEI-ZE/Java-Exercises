package 繼承練習;

public class Main {

    public static void main(String[] args) {
        // TODO 自動產生的方法 Stub
        NTOU ntou = new NTOU("海洋大學","國立一般大學",25000);
        
        Teacher CEteacher = new Teacher("Amy","教授");
        Student CEstudent = new Student("謝維澤",4);
        Teacher MMteacher = new Teacher("Lisa","教授");
        Student MMstudent = new Student("馬子晴",3);
        Teacher CSteacher = new Teacher("Eva","教授");
        Student CSstudent = new Student("洪采明",2);
        
        CE ce = new CE(CEteacher, CEstudent);
        MM mm = new MM(MMteacher, MMstudent);
        CS cs = new CS(CSteacher, CSstudent);
        
        System.out.println("校名:" + ntou.getName() + "\n類型:" + ntou.getType() + "\n學費: " + ntou.getFee());
        
        ce.response1();
        System.out.println("通訊與導航工程學系老師\t" + CEteacher.getName() + "\t職等:" + CEteacher.getRank() );
        CEteacher.teach();
        System.out.println("通訊與導航工程學系學生\t" + CEstudent.getName() + "\t年級:" );
        CEstudent.study();
        cs.response2();
        System.out.println("資訊工程系老師\t" + CSteacher.getName() + "\t職等:" + CSteacher.getRank() );
        MMteacher.teach();
        System.out.println("資訊工程學系學生\t" + CSstudent.getName() + "\t年級:" );
        mm.response3();
        MMstudent.study();
        System.out.println("商船系老師\t" + MMteacher.getName() + "\t職等:" + MMteacher.getRank() );
        CSteacher.teach();
        System.out.println("商船學系學生\t" + MMstudent.getName() + "\t年級:" );
        CSstudent.study();

        
        
        
    }

}
