package Lists;


public class ma extends AbstractList{

    public static void main(String[] args){

        List l1 = new ma2();
        List l2 = new ma();

        l1.isWorking();
        l2.isWorking();

    }

    @Override
    public void add(int item) {
    }

    @Override
    public boolean isWorking() {
        return true;
    }
}
