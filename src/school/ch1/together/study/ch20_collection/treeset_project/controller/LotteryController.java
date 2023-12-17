package school.ch1.together.study.ch20_collection.treeset_project.controller;

import school.ch1.together.study.ch20_collection.treeset_project.mode.vo.Lottery;
import school.ch1.together.study.ch20_collection.treeset_project.mode.vo.SortedLottery;

import java.util.*;

public class LotteryController {

    private HashSet<Lottery> lottery = new HashSet();
    private HashSet<Lottery> win = new HashSet();

    public boolean insertObject(Lottery l) {
         return lottery.add(l);
    }
    public boolean deleteObject(Lottery l) {

        //  전달  받은  l을  lottery에서  삭제
        //  당첨자  목록(win)  중에  삭제된  추첨  대상자가  존재할  수  있으니
        //  삭제  결과인  boolean  값과  win객체가  null이  아닐  때에만
        // win에도  해당  추첨  대상자  삭제
        boolean result = lottery.remove(l);

        if (result && win != null) {
            win.remove(l);

//        if (!(win == null) && deleteObject(l) == true) {
//            win.remove(l);
        }
        return result;
    }
    public HashSet winObject() {

        ArrayList<Lottery> l = new ArrayList(lottery);

        while (win.size() != 4) {
            int randomIndex = (int) (Math.random() * l.size() + 1); // l의 길이가 5라면 1 ~ 5 범위
            win.add(l.get(randomIndex - 1));
        }
        return win;
    }
    public TreeSet sortedWinObject() {

        Comparator<Lottery> comp = new SortedLottery();

        TreeSet<Lottery> ts = new TreeSet<>(comp );
        if (win.size() != 4) {
            winObject();
        }
        ts.addAll(win);
        return ts;


    }
    public boolean searchWinner(Lottery l) {

        return win.contains(l);
    }
}

