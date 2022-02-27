import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
        # 2장. 의미있는 이름

        - 의도를 분명히 밝힐 것
            - 존재이유?, 수행기능?, 사용방법? 등을 나타내는 주석이 필요할 경우 의도를 드러내지 못한 이름
            - 의도가 드러난 이름을 사용하면 코드 이해와 변경이 쉬워진다.

        - a, the 와 같은 불용어는 피할 것

        - 그릇된 정보는 피할 것
            - accountList (bad) / accounts (good)

        - 흡사한 이름을 사용하지 않도록 주의

        - 의미있게 구분할 것

        - 발음하기 쉬운 이름을 사용할 것
            - genymdhms (bad) / generationTimestamp (good)
            
        - 검색하기 쉬운 이름을 사용할 것
            - 이름의 길이는 범위 크기에 비례

        - 인코딩을 피할 것

        - 개인적으론 인터페이스 이름에 I를 붙이는걸 피한다. (인터페이스임을 노출하지 않음)
        
        - 자신만 기억하는 이름으로 지정하지 말 것

        - 클래스 이름과 객체 이름은 명사가 적합
        - 메서드 이름은 동사가 적합
        - 생성자를 중복정의할 때 정적 팩토리 메서드를 사용 -> 이 때 메서드는 인수를 설명하는 이름을 사용
        - 기발한 이름은 피할 것

        - 한 개념에 한 단어를 사용할 것 (일관성)

        - 말장난을 하지 말것 (한 닺ㄴ어를 두가지 목적으로 사용하지 말 것)

        - 기술 개념에는 기술 이름(프로그래머 용어)이 적합
        - 기술 이름이 없다면 문제영역
        
        - 의미있는 맥락을 추가할 것
        - 불필요한 맥락은 없앨 것
     */
    public static void main(String[] args) {

        int d; // Bad
        int daysSinceCreation; // Good


    }

    // Bad
    public List<int[]> getThem(List<int[]> theList) {
        List<int[]> list1 = new ArrayList<>();
        for(int[] x : theList)
            if(x[0] == 4)
                list1.add(x);
        return list1;
    }

    // Good
    public List<int[]> getFlaggedCells(List<int[]> gameBoard) {
        int FLAGGED = 4;
        int STATUS_VALUE = 0;
        List<int[]> flaggedCells = new ArrayList<>();
        for(int[] cell : gameBoard) {
            if(cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        }
        return flaggedCells;
    }

    // Good
    public static void copyChars(char source[], char destination[]) {
        // ...
    }
}
