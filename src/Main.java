import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        //Path pathToInputFile = Paths.get("sample");
        Path pathToInputFile = Paths.get("sample2");
        ANTLRInputStream reader = new ANTLRInputStream(Files.newInputStream(pathToInputFile));
        PascalLexer lexer = new PascalLexer(reader);
        TokenStream tokens = new CommonTokenStream(lexer);
        PascalParser parser = new PascalParser(tokens);
        parser.program();
    }
}