package aidrivenresumescreening;

public class Main {
        public static void main(String[] args) {
                    DataScientist dataScientist1=new DataScientist("Dev","Data Scientist","9691876623");
                    DataScientist dataScientist2=new DataScientist("Aditya","Data Scientist","9691876622");
                    DataScientist dataScientist3=new DataScientist("Prakash","Data Scientist","9691876636");
                    ProductManager productManager1=new ProductManager("Ravi","Manager","9123070213");
                    ProductManager productManager2=new ProductManager("Aman","Manager","9818837892");
                    SoftwareEngineer softwareEngineer1=new SoftwareEngineer("Akshit","Software Engineer","7385612969");
                    SoftwareEngineer softwareEngineer2=new SoftwareEngineer("pratap","Software Engineer","7385638969");

                    Resume<DataScientist> dataScientistResume=new Resume<>();
                    Resume<SoftwareEngineer> softwareEngineerResume=new Resume<>();
                    Resume<ProductManager> productManagerResume=new Resume<>();

                    dataScientistResume.addItem(dataScientist1);
                    dataScientistResume.addItem(dataScientist2);
                    dataScientistResume.addItem(dataScientist3);

                    productManagerResume.addItem(productManager1);
                    productManagerResume.addItem(productManager2);

                    softwareEngineerResume.addItem(softwareEngineer1);
                    softwareEngineerResume.addItem(softwareEngineer2);

                    System.out.println(dataScientistResume.getList());
                    System.out.println(productManagerResume.getList());
                    System.out.println(softwareEngineerResume.getList());

                }
            }


