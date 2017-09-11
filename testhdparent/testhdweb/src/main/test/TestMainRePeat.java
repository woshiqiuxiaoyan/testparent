import com.hd.HelloTestMaven;
import lombok.Data;


public class TestMainRePeat {

    public static void main (String []args){

        HelloTestMaven helloTestMaven =new HelloTestMaven();
        helloTestMaven.setAge(123);
        System.out.println(helloTestMaven);
    }

}
