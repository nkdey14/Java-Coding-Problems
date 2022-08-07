package app_java_ser_deser;

import java.io.Serializable;

// if we make a non-static variable transient, 
// then during Serialization that variable content will not be written in the object

public class A implements Serializable {
	
	String user_name = "nitindey";
	
	transient String password = "nitin123";
}
