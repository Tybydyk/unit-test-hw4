package seminars.fourth.book;

// У вас есть класс BookService, который использует интерфейс BookRepository
// для получения информации о книгах из базы данных.
// Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

class BookServiceTest {

    BookRepository bookRepositoryMock = mock(BookRepository.class);
    BookService bookService = new BookService(bookRepositoryMock);

    @Test
    public void testFindBookByIdForGetTitle() {

        when(bookRepositoryMock.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));

        Book result = bookService.findBookById("1");

        assertEquals("Book1", result.getTitle());
    }

    @Test
    public void testFindBookByIdForGetAuthor() {

        when(bookRepositoryMock.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));

        Book result = bookService.findBookById("1");

        assertEquals("Author1", result.getAuthor());
    }

    @Test
    public void testFindAllBooksForSizeOfList() {

        when(bookRepositoryMock.findAll()).thenReturn(List.of(new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")));

        List<Book> result = bookService.findAllBooks();

        assertEquals("Author2", (result.get(1)).getAuthor());
    }
    @Test
    public void testFindAllBooksForTitleOneInTheBookList() {

        when(bookRepositoryMock.findAll()).thenReturn(List.of(new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")));

        List<Book> result = bookService.findAllBooks();

        assertEquals("Book1", (result.get(0)).getTitle());
    }

    @Test
    public void testFindAllBooksForAuthorTwoInTheBookList() {

        when(bookRepositoryMock.findAll()).thenReturn(List.of(new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")));

        List<Book> result = bookService.findAllBooks();

        assertEquals("Author2", (result.get(1)).getAuthor());
    }
}