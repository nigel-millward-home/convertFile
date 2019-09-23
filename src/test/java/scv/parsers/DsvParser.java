package scv.parsers;
import com.univocity.parsers.common.processor.BeanListProcessor;

import com.univocity.parsers.csv.CsvFormat;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import java.io.File;
import java.util.List;


public class DsvParser {
    private final com.univocity.parsers.csv.CsvParser parser;
    private final CsvParserSettings settings;
    private final CsvFormat format;
    char delimeter;

    DsvParser() {
        settings = new CsvParserSettings();
        settings.setNullValue("<NO VALUE>");
        format = new CsvFormat();
        format.setDelimiter(delimeter);
        settings.setFormat(format);
        parser = new CsvParser(settings);
    }

    public <T> List<T> convertFileToData(File file, Class<T> clazz, boolean removeHeader) {

        BeanListProcessor<T> rowProcessor = new BeanListProcessor<>(clazz);
        CsvParserSettings settings = new CsvParserSettings();
        settings.getFormat().setDelimiter(delimeter);
        settings.setProcessor(rowProcessor);
        settings.setHeaderExtractionEnabled(removeHeader);

        CsvParser parser = new CsvParser(settings);
        parser.parseAll(file);

        return rowProcessor.getBeans();
    }
}
