package ee.ivkhkdev;

<<<<<<< HEAD

import static org.junit.jupiter.api.Assertions.assertTrue;
=======
import ee.ivkhkdev.helpers.AppHelperBookInput;
import ee.ivkhkdev.helpers.AppHelperUserInput;
import ee.ivkhkdev.model.Book;
import ee.ivkhkdev.model.User;
import ee.ivkhkdev.repository.Repository;
import ee.ivkhkdev.services.BookService;
import ee.ivkhkdev.services.UserService;
import ee.ivkhkdev.storages.Storage;
import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.interfaces.impl.ConsoleInput;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9


class AppTest {

//    Input inputMock;
//    Repository repositoryMock;
//    PrintStream defaultOut;
//    ByteArrayOutputStream mockOut;
//    @BeforeEach
//    void setUp() {
//        inputMock = Mockito.mock(ConsoleInput.class);
//        repositoryMock = Mockito.mock(Storage.class);
//        defaultOut = System.out;
//        mockOut = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(mockOut));
//    }
//
//    @AfterEach
//    void tearDown() {
//        System.setOut(defaultOut);
//    }
//
//    @Test
//    void runExit() {
//        when(inputMock.nextLine()).thenReturn("0");
//        App app = new App();
//        app.run();
//        String expected = "До свидания!";
//        String actual = mockOut.toString();
////        System.setOut(defaultOut);
////        System.out.println(actual);
//        assertTrue(actual.contains(expected));
//    }
//   @Test
//    void runAddBook(){
<<<<<<< HEAD
//        AppHelperBook appHelperBookInputMock = mock(AppHelperBook.class);
=======
//        AppHelperBookInput appHelperBookInputMock = mock(AppHelperBookInput.class);
>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
//        Book bookMock = Mockito.mock(Book.class);
//        when(appHelperBookInputMock.createBook()).thenReturn(bookMock);
//        Repository<Book> repositoryMock = Mockito.mock(Storage.class);
//        BookService bookService = new BookService();
//        boolean result = bookService.addBook();
//        verify(repositoryMock, times(1)).save(bookMock);
//        assertTrue(result);
//    }
//    //@Test
//    void runAddUser(){
//        User userMock = Mockito.mock(User.class);
<<<<<<< HEAD
//        AppHelperUser appHelperUserInputMock = Mockito.mock(AppHelperUser.class);
=======
//        AppHelperUserInput appHelperUserInputMock = Mockito.mock(AppHelperUserInput.class);
>>>>>>> 9178d0340341c88c548ba3c5f0cba85bef2b65a9
//        Repository<User> repositoryMock = mock(Storage.class);
//        when(appHelperUserInputMock.createUser(inputMock)).thenReturn(userMock);
//        UserService userService = new UserService(inputMock, repositoryMock);
//        boolean result = userService.addUser(appHelperUserInputMock);
//        verify(repositoryMock, times(1)).save(userMock);
//        assertTrue(result);
//    }
}