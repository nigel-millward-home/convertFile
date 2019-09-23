package scv.tests;


import com.google.common.io.Resources;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import scv.config.AppConfig;
import scv.model.CustomerData;
import scv.model.CustomerTestDataBuilder;
import scv.model.CustomerTestData;
import scv.parsers.PsvParser;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AppConfig.class})
public class FileToObjectTest {

    @Autowired
    private PsvParser psvParser;

    @Autowired
    private String getCustomerData;

    @Test
    public void quickTest() {
        File file = new File(Resources.getResource(getCustomerData).getPath());
        List<CustomerTestData> customerData = psvParser.convertFileToData(file, CustomerTestData.class, true);

        List<CustomerData> testData = new ArrayList<>();
        CustomerTestDataBuilder customerTestDataBuilder = new CustomerTestDataBuilder();

        for (CustomerTestData data : customerData) {
            testData.add(
                    customerTestDataBuilder
                            .withTestData(data)
                            .build()
            );
        }

        List<CustomerData> customerDataList = testData;
    }
}
