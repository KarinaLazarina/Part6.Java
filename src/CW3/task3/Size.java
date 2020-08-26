package CW3.task3;

public enum Size {
    XXS(32){
        public void getDescription(){
            System.out.println("XXS");
        }
    },
    XS(34){
        public void getDescription(){
        System.out.println("XS");
        }
    },
    S(36){
        public void getDescription(){
            System.out.println("S");
        }
    },
    M(38){
        public void getDescription(){
            System.out.println("M");
        }
    },
    L(40){
        public void getDescription(){
            System.out.println("L");
        }
    };
    abstract void getDescription();

    int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }
}
