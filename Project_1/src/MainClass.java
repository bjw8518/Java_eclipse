import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ClassRoom[] classRoom = {
                new ClassRoom("A반"),
                new ClassRoom("B반"),
                new ClassRoom("C반"),
                new ClassRoom("D반")
        };

        for(int k = 0; k < 9999; k++) {
            System.out.println("--------전체 반 목록---------");
            for(int i = 0; i < classRoom.length; i++) { //바로위에있는 ClassRoom배열만큼 보여줌
                System.out.println("" + i + " : " + classRoom[i]);  //ClassRoom배열의 i값
            }
            System.out.println("수정할 반 번호 입력 (종료 : q)");
            Scanner scanner = new Scanner(System.in);
            String selectClass = scanner.nextLine();
            if (selectClass.equals("q")) {  //q누르면 break(종료)
                break;
            }
            int selectClassNumber = Integer.parseInt(selectClass);
            classRoom[selectClassNumber].showMenu();
            System.out.println();
            System.out.println();
        }
    }
}


//        classRoom[0].addClass();
//        classRoom[0].addStudent();
//        classRoom[0].addStudent();



//        Student s1 = new Student("홍길동");
//        s1.name = "서울";
//        s1.sex = "남자";
//
//        c1.student[0] = s1;
//
//        Student s2 = new Student("둘리","남자","부산");
//
//        c1.student[0] = s2;
//
//레플리카 VS 어센틱.