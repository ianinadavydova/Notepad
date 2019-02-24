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
        }
        for (int j = i + 1; j < recordsCount; j++) {
            records[j - 1] = records[j];
        }
        records[recordsCount-1] = null;
        recordsCount--;
        if (recordsCount > 0 && recordsCount == records.length - 1000) {
            shrinkRecords();
        }
    }

    public Record findByTitle (String title) {
        for (int i = 0; i < recordsCount; i++) {
            if (records[i].getTitle().equals(title)) {
                return records[i];
            }
        }
        return null;
    }

    public Record[] getAllRecords () {
        Record[] result = new Record[recordsCount];
        for (int i = 0; i < recordsCount; i++) {
            result[i] = records[i];
        }
        return result;
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
