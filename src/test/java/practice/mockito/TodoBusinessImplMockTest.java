package practice.mockito;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockTest {

    @Test
    public void retrieveTodosRelatedToSpring_UsingAMock_Test() {

        FirstMockitoTest.TodoService todoServiceMock = mock(FirstMockitoTest.TodoService.class);

        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");

        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

        FirstMockitoTest.TodoBusinessImpl todoBusinessImpl =
                new FirstMockitoTest.TodoBusinessImpl(todoServiceMock);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");

        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void retrieveTodosRelatedToSpring_withEmpty_Test() {

        FirstMockitoTest.TodoService todoServiceMock = mock(FirstMockitoTest.TodoService.class);

        List<String> todos = Arrays.asList();

        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

        FirstMockitoTest.TodoBusinessImpl todoBusinessImpl =
                new FirstMockitoTest.TodoBusinessImpl(todoServiceMock);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");

        assertEquals(0, filteredTodos.size());
    }


}
