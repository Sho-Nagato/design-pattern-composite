public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 1000));
            rootdir.printList();

            System.out.println("");

            System.out.println("Making user entries...");
            Directory suzuki = new Directory("suzuki");
            usrdir.add(suzuki);
            suzuki.add(new File("diary.html", 100));
            suzuki.add(new File("composite.java", 200));
            rootdir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
