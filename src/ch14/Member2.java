package ch14;

public class Member2 {
    private String id;
    private String name;


    public Member2() {
        System.out.println("Member() 실행");
    }

    public Member2(String id) {
        System.out.println("Member(String id) 실행");
        this.id = id;
    }

    public Member2(String id, String name) {
        System.out.println("Member(String id, String name) 실행");
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
}
