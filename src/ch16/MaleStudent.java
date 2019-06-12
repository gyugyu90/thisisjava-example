package ch16;


import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {

    private List<Student> list;

    public MaleStudent() {
        this.list = new ArrayList<>();
        System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
    }

    public void accumulate(Student student) {
        list.add(student);
        System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
    }

    // 두 MaleStudent를 결합하는 메소드
    public void combine(@NotNull MaleStudent other) {
        list.addAll(other.getList());
        System.out.println("[" + Thread.currentThread().getName() + "] combine()");
    }

    public List<Student> getList() {
        return list;
    }
}
