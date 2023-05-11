package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> testResult = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int n = 5;
        var newList = App.take(testResult, n);
        System.out.println(newList);

        System.out.println(newList.isEmpty());
        assertThat(!newList.isEmpty()).isTrue();

        System.out.println(newList.size());
        assertThat(newList.size() == n).isTrue();

        for (var i = 0; i < n; i++){
            /*            System.out.println(newList.get(i));
            System.out.println(testResult.get(i));*/
            assertThat(newList.get(i) == testResult.get(i)).isTrue();
        }

        testResult = new ArrayList<>();
        n = 0;
        newList = App.take(testResult, n);
        System.out.println(newList);

        System.out.println(newList.isEmpty());
        assertThat(newList.isEmpty()).isTrue();

        System.out.println(newList.size());
        System.out.println(newList.size() == n);
        assertThat(newList.size() == n).isTrue();

        for (var i = 0; i < n; i++){
/*            System.out.println(newList.get(i));
            System.out.println(testResult.get(i));*/
            assertThat(newList.get(i) == testResult.get(i)).isTrue();
        }

        testResult = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        n = 10;
        newList = App.take(testResult, n);
        System.out.println(newList);

        System.out.println(newList.isEmpty());
        assertThat(!newList.isEmpty()).isTrue();;

        System.out.println(newList.size());
        assertThat(newList.size() == testResult.size()).isTrue();

        for (var i = 0; i < newList.size(); i++){
            /*System.out.println(newList.get(i));
            System.out.println(testResult.get(i));*/
            assertThat(newList.get(i) == testResult.get(i)).isTrue();
        }
        // END
    }
}
