package practice.mockito;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void retrieveTodosRelatedToSpring_UsingAStub_Test() {
        FirstMockitoTest.TodoService todoServiceStub = new TodoServiceStub();

        FirstMockitoTest.TodoBusinessImpl todoBusinessImpl =
                new FirstMockitoTest.TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");

        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void retrieveTodosRelatedToSpring_UsingAStub_Test2() {
        FirstMockitoTest.TodoService todoServiceStub = new TodoServiceStub();

        FirstMockitoTest.TodoBusinessImpl todoBusinessImpl =
                new FirstMockitoTest.TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");

        assertEquals(0, filteredTodos.size());
    }
}
