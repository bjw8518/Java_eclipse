package Fig;

    public class Base {
        protected String name;
        protected double size;

        Base(){
            this.name="도형";
        }

//        protected void inputNumber() {
//
//        }
        protected void randomNumber() {

        }
        protected void calcSize() {

        }
        protected void printSize(){
            System.out.println(this.name+"Size: "+this.size);
        }
        public void doAction(){
            //this.inputNumber();
            this.randomNumber();
            this.calcSize();
            this.printSize();
        }
    }
