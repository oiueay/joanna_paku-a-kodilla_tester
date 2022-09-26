public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1100, 2018);
        System.out.println("Notebook weight:"+ notebook.weight + " , " + "Notebook price:"
                + notebook.price + " , " + "Notebook year:" + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkSomething();

        Notebook heavyNotebook = new Notebook(2000, 200, 2010);
        System.out.println("Heavy notebook weight:" + heavyNotebook.weight + " , " + "Heavy notebook price:"
                + heavyNotebook.price + " , " + "Heavy notebook year:" + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkSomething();

        Notebook oldNotebook = new Notebook(1200, 300, 2015);
        System.out.println("Old notebook weight: " + oldNotebook.weight + " , " + "Old notebook price:"
                + oldNotebook.price + " , " + "Old notebook year:" + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkSomething();
    }

}
