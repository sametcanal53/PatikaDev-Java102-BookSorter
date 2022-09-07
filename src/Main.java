import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> sortBooksByPageNumber = new TreeSet<>(new OrderByPageNumberComparator());

        sortBooksByPageNumber.add(new Book("Simyacı",166,"Paulo Coelho","1988"));
        sortBooksByPageNumber.add(new Book("Kumarbaz",161,"Dostoyevksi","1866"));
        sortBooksByPageNumber.add(new Book("Suç ve Ceza",160,"Dostoyevksi","1866"));
        sortBooksByPageNumber.add(new Book("Savaş ve Barış",1225,"Tolstoy","1867"));

        for(Book book : sortBooksByPageNumber){
            System.out.println("Book Name : " +book.getName() +
                    " Page Number : "+book.getPageNumber()+
                    " Author : "+book.getAuthorName()+
                    " Release Date : "+book.getReleaseDate());
        }

        System.out.println("-----------------------------------");
        TreeSet<Book> sortBooksByName = new TreeSet<>(new OrderByNameComparator());
        sortBooksByName.add(new Book("Simyacı",166,"Paulo Coelho","1988"));
        sortBooksByName.add(new Book("Kumarbaz",161,"Dostoyevksi","1866"));
        sortBooksByName.add(new Book("Suç ve Ceza",160,"Dostoyevksi","1866"));
        sortBooksByName.add(new Book("Savaş ve Barış",1225,"Tolstoy","1867"));

        for(Book book : sortBooksByName){
            System.out.println("Book Name : " +book.getName() +
                    " Page Number : "+book.getPageNumber()+
                    " Author : "+book.getAuthorName()+
                    " Release Date : "+book.getReleaseDate());
        }

    }
}
