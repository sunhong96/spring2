package hello.core.singleton;

public class singletonService {

    private static final singletonService instance = new singletonService();

    public static singletonService getInstance() {
        return instance;
    }

    private singletonService() {} // 이걸로 new 키워드를 막음

    public void logic() {
        System.out.println("싱글톤 객체에 로직 호출");
    }

    //1. static 영역에 객체 instance 를 미리 하나 생성해서 올려둔다.
    //2. 이 객체 인스턴스가 필요하면 오직 getInstance() 메서드를 통해서만 조회할 수 있다. 이 메서드를
    //호출하면 항상 같은 인스턴스를 반환한다.
    //3. 딱 1개의 객체 인스턴스만 존재해야 하므로, 생성자를 private 으로 막아서 혹시라도 외부에서 new
    //키워드로 객체 인스턴스가 생성되는 것을 막는다
}
