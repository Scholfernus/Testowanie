package pl.sdacademy.storage;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//@RequiredArgsConstructor
class Storage {
    private List<Object> data = new ArrayList<>();
    private final Connection connection;

    public Storage(Connection connection) {
        this.connection = connection;
    }

    int addValue(Object value) {
        if (connection.isClosed()) {
            throw new StorageConnectionException(
                    "Connection is closed, data cannot be added");
        }
        data.add(value);
        return data.size();
    }

    boolean removeValue(Object value) {
        if (connection.isClosed()){
            throw new StorageConnectionException(
                    "Connection is closed, data cannot be removed");
        }
        return data.remove(value);
    }

    List<Object> getData() {
        if (connection.isClosed()){
            throw new StorageConnectionException(
                    "Connection is closed, data cannot be retrieved");
        }
        return data;
    }
}
