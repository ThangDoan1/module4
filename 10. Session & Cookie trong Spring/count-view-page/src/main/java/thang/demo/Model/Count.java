package thang.demo.Model;

public class Count {
    private int count ;

    public int increment(){
        return count++ ;
    }

    public Count(){}

    public Count(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
