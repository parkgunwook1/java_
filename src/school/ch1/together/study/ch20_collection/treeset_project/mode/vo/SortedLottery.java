package school.ch1.together.study.ch20_collection.treeset_project.mode.vo;

import java.util.Comparator;

public class SortedLottery implements Comparator<Lottery>{

    @Override
    public int compare(Lottery o1, Lottery o2) {

        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}


