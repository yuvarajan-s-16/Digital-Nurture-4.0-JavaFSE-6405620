//this is class book
class Book {
    int bookId;
    String title, author;

    Book(int id, String t, String a) {
        bookId = id;
        title = t;
        author = a;
    }
}

public class LibraryManagementSystem {
    static int linearSearch(Book[] arr, String title) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].title.equals(title))
                return i;
        return -1;
    }

    static int binarySearch(Book[] arr, String title) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int cmp = arr[m].title.compareTo(title);
            if (cmp == 0)
                return m;
            else if (cmp < 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Book[] arr = {
                new Book(0, "Chemistry", "James"),
                new Book(1, "DSA", "Smith"),
                new Book(2, "History", "Sweety"),
                new Book(3, "Maths", "Ramya"),
                new Book(4, "Physics", "Sheik")
        };
        System.out.println(linearSearch(arr, "Maths"));
        // Assume arr is sorted by title for binarySearch
        System.out.println(binarySearch(arr, "Physics"));
    }
}