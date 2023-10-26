package school.ch1.together.study.ch20_collection.hashmap_project.controller;

import school.ch1.together.study.ch20_collection.hashmap_project.model.vo.Member;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {
    private HashMap<String, Member> map = new HashMap();

    public boolean joinMembership(String id, Member m) {
        // 전달받은 id가 없다면 id와 m을 map에 추가 후 true qksghks
        // 있다면 false 값 반환

        if (map.get(id) == null) {
            map.put(id, m);
            return true;
        }
        return false;
    }

    public String login(String id, String password) {

        if (map.containsKey(id)) {
            Member user = map.get(id); // member 객체 반환

            String userPwd = user.getPassword(); // member 객체 내부에 초기화된 비밀번호
            return userPwd.equals(password) ? user.getName() : null;
        }
        return null;

    }

    public boolean changePassword(String id, String oldPw, String newPw) {
//        if (map.containsKey(id) &&  map.get(oldPw).equals(map.get(newPw))) {
//            map.remove(oldPw);
//            map.get(id).getPassword(newPw);
//            oldPw = newPw;
//        }
        // map.replace(id, new Member(newPw, oldPw, id)));
//            return false;
        if (map.get(id) != null && map.get(id).getPassword().equals(oldPw)) {
            map.get(id).setPassword(newPw);
            return true;
        }
        return false;
    }

    public void changeName(String id, String newName) {
//        Member member = new Member();
        // put : 데이터 저장할 때 사용
        // get : 데이터 꺼내올 때 사용
//        if(map.containsKey(id)) {

        map.get(id).setName(newName);
//            member.setName(newName);
    }

    public TreeMap<String, String> sameName(String name) {

        Set<String> s = map.keySet();
        TreeMap<String, String> tm = new TreeMap<>();

        for (String key : s) {
            if (map.get(key).getName().equals(name)) {
                tm.put(key, name);
            }
        }
        return tm;
    }
}
