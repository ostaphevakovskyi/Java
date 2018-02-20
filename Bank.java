package lab1;

public class Bank {
    private String name;
    private int foundation;
    private String type;
    private String form;
    private String size;
    private static int QuantityOfCustomer=0;
    public Bank(){

    }

    public Bank(String name, int foundation, String type, String form) {
        setName(name);
        setType(type);
        setFoundation(foundation);
        setForm(form);
    }

    public Bank(String name, int foundation, String type, String form, String size) {
        setName(name);
        setType(type);
        setFoundation(foundation);
        setForm(form);
        setSize(size);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setFoundation(int foundation) {
        this.foundation = foundation;
    }

    public int getFoundation() {
        return foundation;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String toString() {
        return "Info about this bank: \nname: " + getName()
                +"\nYear of foundation: " + getFoundation()
                +"\nType of bank: " + getType()
                +"\nForm of bank: " + getForm()
                +"\nSize: " + getSize()
                +"\n";

    }

    public void printSum(){
        System.out.println(getName() + " was founded in: " + getFoundation());
    }

    public void printStaticSum(){
        System.out.println(getName() + " now has " + QuantityOfCustomer + "customers" + "\n");
    }

    public void setQuantityOfCustomer(int quantityOfCustomer) {
        Bank.QuantityOfCustomer -= this.QuantityOfCustomer;
        Bank.QuantityOfCustomer +=Bank.QuantityOfCustomer;

    }

    public void resetValues( String name, int foundation, String type, String form, String size){
        setName(name);
        setForm(form);
        setFoundation(foundation);
        setType(type);
        setSize(size);
    }
}



