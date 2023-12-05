package seminars.fourth.database;


import org.assertj.core.api.ListAssert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class DataProcessorTest {
    @Test
    void dataBaseQueryTest(){
        Database databaseMock = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(databaseMock);
        when(dataProcessor.processData(anyString())).thenReturn(Arrays.asList("d1", "d2", "d3"));

        List<String> result = dataProcessor.processData("query");

        assertThat(result).isEqualTo(Arrays.asList("d1", "d2", "d3"));
    }


}