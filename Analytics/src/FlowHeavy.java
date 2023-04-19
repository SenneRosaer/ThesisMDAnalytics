public class FlowHeavy {
    public Integer earlyRemoveAll(boolean input1, boolean input2) {
        if (isEqual(1,1) && input1) {
            System.out.println("First");
            if (isEqual(1,3) || input2) {
                System.out.println("Second");
            } else {
                Integer i1 = 5;
                while(isEqual(i1,5)){
                    i1 -= 1;
                }
                return 1;
            }
        }
        return 2;
    }

    public boolean isEqual(Integer i1, Integer i2) {
        return i1 == i2;
    }


    }
