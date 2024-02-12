public class Main {
    public static void main(String[] args) {
        Letter a = (Letter) FDocument.createDocument(ETypeDoc.LETTER);

        a.create("toto");
        SDatabase.getInstance().addDocument(a.getKey(), a);

        SDatabase.getInstance().getDocument(a.getKey()).create("tata");

        System.out.println(SDatabase.getInstance().getDocument(a.getKey()).toString());


    }
}