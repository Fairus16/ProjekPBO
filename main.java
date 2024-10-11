// Kelas Induk Pertama
class Parent1 {
    private String name;

    public Parent1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Parent1 Name: " + name);
    }

    // Method overloading
    public void showInfo(String message) {
        System.out.println(message + ": " + name);
    }
}

// Kelas Induk Kedua
class Parent2 {
    private String description;

    public Parent2(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showDescription() {
        System.out.println("Parent2 Description: " + description);
    }

    // Method overloading
    public void showDescription(String message) {
        System.out.println(message + ": " + description);
    }
}

// Kelas Anak yang Menginduk ke Parent1 dan Parent2
class Child extends Parent1 {
    private String childAttribute;

    public Child(String name, String childAttribute) {
        super(name);  // Memanggil constructor Parent1
        this.childAttribute = childAttribute;
    }

    public String getChildAttribute() {
        return childAttribute;
    }

    public void setChildAttribute(String childAttribute) {
        this.childAttribute = childAttribute;
    }

    // Method overriding
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Child Attribute: " + childAttribute);
    }
}

// Kelas Utama (Main)
public class Main {
    public static void main(String[] args) {
        // Instansiasi objek
        Parent1 parent1 = new Parent1("John Doe");
        Parent2 parent2 = new Parent2("This is Parent2");
        Child child = new Child("Jane Doe", "Special Child Attribute");

        // Menampilkan informasi
        parent1.showInfo();
        parent1.showInfo("Info from Parent1");

        parent2.showDescription();
        parent2.showDescription("Additional Info");

        child.showInfo();

        // Menggunakan setter dan getter
        child.setChildAttribute("Updated Child Attribute");
        System.out.println("Updated Child Attribute: " + child.getChildAttribute());
    }
}
