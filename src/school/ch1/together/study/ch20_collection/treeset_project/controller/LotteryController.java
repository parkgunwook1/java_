package school.ch1.together.study.ch20_collection.treeset_project.controller;

import school.ch1.together.study.ch20_collection.treeset_project.mode.vo.Lottery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class LotteryController {

    private HashSet<Lottery> lottery = new HashSet();
    private HashSet win = new HashSet();

    public boolean insertObject(Lottery l) {
         return lottery.add(l);
    }
    public boolean deleteObject(Lottery l) {

        //  전달  받은  l을  lottery에서  삭제
        //  당첨자  목록(win)  중에  삭제된  추첨  대상자가  존재할  수  있으니
        //  삭제  결과인  boolean  값과  win객체가  null이  아닐  때에만
        // win에도  해당  추첨  대상자  삭제
        lottery.remove(l);

        if (!(win == null) && deleteObject(l) == true) {
            win.remove(l);
        }
        return false;
    }
    public HashSet winObject() {
        Random random = new Random();

        ArrayList
    }
    public TreeSet sortedWinObject() {

    }
    public boolean searchWinner(Lottery l) {

    }
}

