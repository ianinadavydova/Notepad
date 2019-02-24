public class Main {

    public static void main(String[] args) throws InterruptedException {
        Notepad notepad = new Notepad();

        // add new record
        notepad.addRecord(new Record("First Record", "What a nice weather today"));

        // print all records
        for (Record r : notepad.getAllRecords()) {
            System.out.println(r);
        }
        // add second record
        notepad.addRecord(new Record("Blah blah", "Blah-blah"));

        // print all records again
        for (Record r : notepad.getAllRecords()) {
            System.out.println(r);
        }

        // find record
        Record coolRecord = notepad.findByTitle("Blah blah");

        System.out.println("Found record:" + "\n" + coolRecord);

        // get title
        System.out.println(coolRecord.getTitle());

        // get content
        System.out.println(coolRecord.getContent());

        // print record
        System.out.println(coolRecord.toString());

        // edit record
        Thread.sleep(4000);
        coolRecord.updateContent("The weather is awful");

        // print edited record
        System.out.println(coolRecord.toString());

        // remove record
        notepad.removeRecord(coolRecord);

        // print all records
        for (Record r : notepad.getAllRecords()) {
            System.out.println(r);
        }

        // add 1000 records to Notepad
        Record[] arr = new Record[1001];

        for (int i = 0; i < 1001; i++) {
            Record rec = new Record(String.valueOf(i), "Some content");
            arr[i] = rec;
        }

        for (Record r : arr) {
            notepad.addRecord(r);
        }

        // remove 1000 records from Notepad
        for (Record r : arr) {
            notepad.removeRecord(r);
        }

    }
}
