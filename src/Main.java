public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 1000));
            bindir.add(new File("latex", 2000));
            rootdir.printList();

            System.out.println("");

            System.out.println("Making user entries...");
            Directory suzuki = new Directory("suzuki");
            Directory sato = new Directory("sato");
            Directory takahashi = new Directory("takahashi");
            usrdir.add(suzuki);
            usrdir.add(sato);
            usrdir.add(takahashi);
            suzuki.add(new File("diary.html", 100));
            suzuki.add(new File("composite.java", 200));
            sato.add(new File("memo.txt", 300));
            takahashi.add(new File("game.doc", 400));
            takahashi.add(new File("junk.mail", 500));
            rootdir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
