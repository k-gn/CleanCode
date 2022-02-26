import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
        # 2장. 의미있는 이름

        - 의도를 분명히 밝힐 것
            - 존재이유?, 수행기능?, 사용방법? 등을 나타내는 주석이 필요할 경우 의도를 드러내지 못한 이름
            - 의도가 드러난 이름을 사용하면 코드 이해와 변경이 쉬워진다.
     */
    public static void main(String[] args) {

        int d; // Bad
        int daysSinceCreation; // Good


    }

    // Bad
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<>();
        for(int[] x : list1)
            if(x[0] == 4)
                list1.add(x);
        return list1;
    }

    // Good
    public List<int[]> getFlaggedCells(List<int[]> gameBoard ) {
        int FLAGGED = 4;
        int STATUS_VALUE = 0;
        List<int[]> flaggedCells = new ArrayList<>();
        for(int[] cell : gameBoard) {
            if(cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        }
        return flaggedCells;
    }
}
