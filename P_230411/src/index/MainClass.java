package index;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        //int[]a= new int[10];
//		people[0] =new People(); //서랍
//		people[0].address;
        People[] people = new People[990]; //people클래스 참조
        int index=0;
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<999;i++) {
            System.out.println("원하시는메뉴선택");
            System.out.println("1. 새 데이터 출력");
            System.out.println("2. 전체 데이터 출력");
            System.out.println("3. 지역별 통계");
            System.out.println("q. 종료");

            String menuString = scanner.nextLine();
            if(menuString.equals("q")) {
                break;
            } else if (menuString.equals("1")) {
                people[index]=new People();
                //객체데이터로 입력받기
                people[index].inputData();//inputData메소드//people클래스
                index++;//인덱스를 증가시켜야함
            }else if(menuString.equals("2")) {
                for(int j=0;j<index;j++) {
                    people[j].printInfo();
                }
            }else if(menuString.equals("3")) {
//                Region[]region=new Region[6];//지역을 관리하기위한 객체
//                region[0] = new Region();
//                region[0].name="서울";

                Region[] region={
                        new Region("서울"),new Region("경기"),new Region("충청"),
                        new Region("강원"),new Region("전라"),new Region("경기"),
                };
                for (int j = 0; j < region.length; j++) {
                    region[j].calcCount(people);
                }

            }else{
                System.out.println("입력이잘못됨");
            }

            //String[] region = {"서울", "경기", "충청", "전라", "경상", "강원"};
//                int[] regionCount = new int[region.length];
//                for (int j = 0; j < index; j++) {
//                    for (int k = 0; k < region.length; k++) {
//                        if (region[k].equals(people[j].address)) {
//                            regionCount[k]++;
//                        }
//                    }
//                }
//                for (int k = 0; k < region.length; k++) {
//                    System.out.println(region[k] + " 인구 수 : " + regionCount[k]);
//
            System.out.println();
            System.out.println();
        }
    }

}