
import hudson.model.Node;
import hudson.model.Slave;
import jenkins.model.Jenkins;

Jenkins jenkins = Jenkins.instance;
def nodes = jenkins.nodes;

print "\n Hello there";
def requiredNodes = ['Slave1', 'Slave2', 'Slave3'];
requiredNodes.each{
        println it;
}

