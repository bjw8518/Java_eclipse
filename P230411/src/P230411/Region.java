package P230411;

public class Region {
    String name;
    int count=0;

    Region(){
        this.name = "한국";
    }
    Region(String name){
        this.name = name;
    }

    public void calcCount(People[] people){
        for (int i=0;i<people.length;i++){
            if (people[i]==null){
                continue;
            }
            if (people[i].address.equals(this.name)){
                this.count++;
            }
        }
        System.out.println(this.name + " 인구 수 : " + this.count);

    }
}
