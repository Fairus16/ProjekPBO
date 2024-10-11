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
