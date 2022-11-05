import java.util.*;
public class Main {
    public static void main(String[] args) {
        Password pass = new Password("123456789");
        try {
            pass.checkPassword();
        } catch (WrongPasswordException e) {
            System.out.println(e);
        }
        System.out.println(pass);
        List<String> book = new ArrayList<>();//создаем список книг
        book.add("dbook");
        book.add("cbook");
        book.add("ebook");
        book.add("gbook");
        book.add("ybook");
        book.add("fbook");
        book.add("abook");
        book.add("ibook");
        book.add("bbook");
        book.add("hbook");
        book.add("jbook");
        book.add("zbook");
        book.add("kbook");
        book.add("lbook");
        book.add("xbook");
        book.add("vbook");
        book.add("mbook");
        book.add("ubook");
        book.add("nbook");
        book.add("obook");
        book.add("wbook");
        book.add("tbook");
        book.add("pbook");
        book.add("qbook");
        book.add("rbook");
        book.add("sbook");
        System.out.println(book); // смотрим что они в хаотичном порядке изначально
        System.out.println();
        System.out.println(putBookInShelf(book)); //получаем упорядоченный стеллаж из 5ти полок
    }
    public static List<ArrayList<String>> putBookInShelf(List<String> book){ // получаем на вход список названий книг
        Collections.sort(book);   //сортируем по афавиту
        List<ArrayList<String>> rack = new ArrayList<>(); //создаем стеллаж
        for (int i = 0; i < 5; i++) {                       //собираем из полок стеллаж
            ArrayList<String> shelf = new ArrayList<>();
            rack.add(shelf);
        }
        int bookInd = 0; //индекс для получения элемента из отсортированного списка с книгами
        int shelfInd = 0; //индекс для для того что бы определить номер полки на которую положить книгу

        while (bookInd < book.size()) {
            int perShelf = getBooksPerShelf(book.size() - bookInd, rack.size() - shelfInd);
            for (int i = 0; i < perShelf; i++) {
                rack.get(shelfInd).add(book.get(bookInd));
                bookInd++;
            }
            shelfInd++;
        }
        return rack; //возвращаем разложенные книги по полкам на стеллаже
 }
    public static int getBooksPerShelf(int book, int shelf) { //считаем сколько книг нужно положить на полку
        int perShelf = book / shelf;
        if (perShelf * shelf < book)
            perShelf++;
        return perShelf;
    }
}