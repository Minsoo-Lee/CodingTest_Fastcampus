package ch09_HashTable;

public class Main {
    public static void main(String[] args) {
        // 초간단 해쉬 함수
        String name = "DaveLee";

        System.out.println(name.charAt(0));             // D
        System.out.println((int) (name.charAt(0)));      // 68
        System.out.println((int) (name.charAt(0)) % 20);   // 8
        System.out.println();

        // 테스트1 - 기본
        MyHashChain myHashChain = new MyHashChain(20);
        myHashChain.saveData("DaveLee", "01022223333");
        myHashChain.saveData("fun-coding", "01033334444");
        System.out.println(myHashChain.getData("DaveLee"));
        System.out.println(myHashChain.getData("fun-coding"));
        System.out.println();

        // 테스트2 - Chaining
        MyHashChain myHashChain1 = new MyHashChain(20);
        myHashChain1.saveData("DaveLee", "01022223333");
        myHashChain1.saveData("fun-coding", "01033334444");
        myHashChain1.saveData("David", "01044445555");
        myHashChain1.saveData("Dave", "01055556666");
        System.out.println(myHashChain1.getData("fun-coding"));
        System.out.println(myHashChain1.getData("David"));
        System.out.println(myHashChain1.getData("DaveLee"));
        System.out.println(myHashChain1.getData("Dave"));

        // 테스트3 - Linear Probing
        MyHashLP myHashLP = new MyHashLP(20);
        myHashLP.saveData("DaveLee", "01022223333");
        myHashLP.saveData("fun-coding", "01033334444");
        myHashLP.saveData("David", "01044445555");
        myHashLP.saveData("Dave", "01055556666");
        System.out.println(myHashLP.getData("fun-coding"));
        System.out.println(myHashLP.getData("David"));
        System.out.println(myHashLP.getData("DaveLee"));
        System.out.println(myHashLP.getData("Dave"));
    }
}


