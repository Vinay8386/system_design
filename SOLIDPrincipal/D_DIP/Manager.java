package SOLIDPrincipal.D_DIP;

import java.util.ArrayList;
import java.util.List;

//High level module
public class Manager {
    //List where the Manager will store its workers.
    List<Workers> workersList;

    public Manager(){
        workersList=new ArrayList<>();
    }
    //This method allows different types of workers to be added to the Manager’s list of workers.
    public void addWorkers(Workers workers){
        workersList.add(workers);
    }
    // Manager class iterates over the list of Worker objects and calls their work() method.
    public void manageWork(){
        for (Workers w:workersList) {
            w.work();
        }
    }
}
