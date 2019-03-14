
import jenkins.model.Jenkins;

Jenkins jenkins = Jenkins.instance;
jenkins.getComputer().get_all().each{ 
 if(it.getNumExecutors() - 1 ==  it.countIdle()){
        //execution bash script to do clean up
        printOut("./clean_ws.sh".execute());
    } else{
        println "Some executors are engaged, try again later"
    }
}

def printOut(proc){
    def out  = new StringBuffer();
    def err  = new StringBuffer();

    proc.consumeProcessOutput(out, err);
    proc.waitFor();

    println out;
    println err;
}


