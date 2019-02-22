public class Notepad {
    private Record[] records = new Record[1000];
    private int recordsCount = 0;


    public void addRecord(Record newRecord) {
        if (recordsCount == records.length) {
            extendRecors();
        }
        records[recordsCount++] = newRecord;
    }

    public void removeRecord(Record record) {
        int i = indexOf(record);
        if (i == -1) {
            System.err.println("Record not found");
        };
        for (int j = i + 1; j < recordsCount; j++) {
            records[j - 1] = records[j];
        }
        recordsCount--;
        if (recordsCount == records.length - 1000) {
            shrinkRecords();
        }
    }

    private int indexOf(Record record) {
        for (int i = 0; i < recordsCount; i++) {
            if (records[i] == record) {
                return i;
            }
        }
        return -1;
    }

    private void extendRecors() {
        Record[] extendedRecords = new Record[records.length + 1000];
        for (int i = 0; i < recordsCount; i++) {
            extendedRecords[i] = records[i];
        }
        records = extendedRecords;
    }

    private void shrinkRecords() {
        Record[] shrinkedRecords = new Record[records.length - 1000];
        for (int j = 0; j < recordsCount; j++) {
            shrinkedRecords[j] = records[j];
        }
        records = shrinkedRecords;
    }
}
