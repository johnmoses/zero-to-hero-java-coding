package helloworld;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {

    final String world = "Hello World!";

    public String getworld() {
        return world;
    }
}