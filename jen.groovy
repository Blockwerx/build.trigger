
import jenkins.model.Jenkins;
import hudson.model.*;

def build  = Thread.currentThread().executable;
def jenkins = Jenkins.instance;
jenkins.getComputer().get_all().each{ 
 if(it.getNumExecutors() - 1 ==  it.countIdle()){
        //execution bash script to do clean up
        def workspace = build.workspace.toString();
         printOut("ls -ls $workspace".execute());
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


