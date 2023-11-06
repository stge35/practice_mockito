package practice.mockito;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstMockitoTest {

    @Test
    public void test() {
        assertTrue(true);
    }

    public interface TodoService {
        public List<String> retrieveTodos(String user);
    }

    public static class TodoBusinessImpl {
        private TodoService todoService;

        public TodoBusinessImpl(TodoService todoService) {
            this.todoService = todoService;
        }

        public List<String> retrieveTodoRelatedToSpring(String user) {
            List<String> filteredTodos = new ArrayList<String>();
            List<String> todos = todoService.retrieveTodos(user);
            for(String todo:todos) {
                if(todo.contains("Spring")) {
                    filteredTodos.add(todo);
                }
}

            return filteredTodos;
        }
    }
}
