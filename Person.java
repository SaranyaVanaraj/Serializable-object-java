package oopsassignment;
		import java.io.Serializable;
		class Person implements Serializable {
		    private static final long serialVersionUID = 1L; 
		    String name;
		    int age;
		    Person(String name, int age) {
		        this.name = name;
		        this.age = age;
		    }
		    void display() {
		        System.out.println("Name: " + name + ", Age: " + age);
		    }
		}
