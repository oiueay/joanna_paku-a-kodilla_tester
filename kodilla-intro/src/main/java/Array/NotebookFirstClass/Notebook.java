package Array.NotebookFirstClass;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 900) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("This price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 500) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 600 && this.price < 1000) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkSomething() {
        if (this.year > 2017 && this.price > 1000) {
            System.out.println("New, expensive");
        } else if (this.year < 2017 && this.year > 2010 && this.price < 1000 && this.price > 200) {
            System.out.println("Average");
        } else {
            System.out.println("Old, cheap");
        }
    }
}
