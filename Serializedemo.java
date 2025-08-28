package oopsassignment;
		import java.io.*;
		public class SerializeDemo {
		    public static void main(String[] args) {
		        Person p1 = new Person("Saranya V", 18);
		        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
		            oos.writeObject(p1);
		            System.out.println("Object has been serialized and saved!");
		        } catch (IOException e) {
		            System.out.println("IOException: " + e.getMessage());
		        }
		        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
		            Person p2 = (Person) ois.readObject();
		            System.out.println("Object has been deserialized!");
		            p2.display();
		        } catch (IOException | ClassNotFoundException e) {
		            System.out.println("Exception: " + e.getMessage());
		        }
		    }
		}
