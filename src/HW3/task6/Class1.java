package HW3.task6;

public class Class1 implements Scream{
    private String msg;

    public Class1(String msg) {
        this.msg = msg;
    }

    public Class1() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void scream() {
        String msg = getMsg();
        System.out.println(msg);
    }
}
