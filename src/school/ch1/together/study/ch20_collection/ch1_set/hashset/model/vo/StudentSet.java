package school.ch1.together.study.ch20_collection.ch1_set.hashset.model.vo;

import java.util.Objects;

public class StudentSet {

    private String name;
    private int age;
    private int score;

    public StudentSet() {

    }

    public StudentSet(String name, int age, int score) {
        super();
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentSet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//
//        // Student.equals(비교대상 Student 객체)
//
//        if (!(obj instanceof StudentSet)) {
//            return false;
//        }
//        StudentSet other = (StudentSet) obj;
//
//        // 3가지 필드값이 모두 동일한경우 동일한 객체로 판단할 예정
//        if (this.name.equals(other.name) && this.age == other.age && this.score == other.score)
//            return true;
//
//        return false;
//    }
//    // 객체의 주소값이 아닌, 필드값을 기준으로 해시코드를 만들어서 반환하도록 정의
//    @Override
//    public int hashCode() {
//        return (name+age+score).hashCode();
//    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentSet that = (StudentSet) o;
        return age == that.age && score == that.score && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }
}
