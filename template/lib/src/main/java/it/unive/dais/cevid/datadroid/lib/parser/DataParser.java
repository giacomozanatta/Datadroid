package it.unive.dais.cevid.datadroid.lib.parser;

import android.os.AsyncTask;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Interfaccia che rappresenta un parser di dati qualsiasi.
 * @param <Data>
 */
public interface DataParser<Data, Progress> {
    List<Data> executeAndRetrieve() throws ExecutionException, InterruptedException;
    void execute();
    List<Data> retrieve() throws ExecutionException, InterruptedException;
    AsyncTask<Void, Progress, List<Data>> asAsyncTask();
}
