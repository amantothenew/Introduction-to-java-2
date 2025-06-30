// Q4) Write a program to show application of Factory Design Pattern.

abstract class Document {
    public abstract void open();
}

class Report extends Document {
    @Override
    public void open() {
        System.out.println("Opening a Report document.");
    }
}

class Spreadsheet extends Document {
    @Override
    public void open() {
        System.out.println("Opening a Spreadsheet document.");
    }
}

abstract class Application {
    public abstract Document createDocument();
}


class ReportApplication extends Application {
    @Override
    public Document createDocument() {
        return new Report();
    }
}

class SpreadsheetApplication extends Application {
    @Override
    public Document createDocument() {
        return new Spreadsheet();
    }
}

public class DocumentCreatorExample {
    public static void main(String[] args) {
        Application reportApp = new ReportApplication();
        Document report = reportApp.createDocument();
        report.open();

        Application spreadsheetApp = new SpreadsheetApplication();
        Document spreadsheet = spreadsheetApp.createDocument();
        spreadsheet.open();
    }
}
